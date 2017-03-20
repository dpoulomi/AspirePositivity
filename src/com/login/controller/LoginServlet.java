package com.login.controller;
 
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.Users;
import com.login.service.LoginService;
 
 
public class LoginServlet extends HttpServlet {
    /**
	 * Serial id 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
 
     final String username = request.getParameter("username");   
     final String password = request.getParameter("password");
     final LoginService loginService = new LoginService();
     final boolean result = loginService.authenticateUser(username, password);
     final Users user = loginService.getUserByUserName(username);
     if(result == true){
         request.getSession().setAttribute("user", user);      
         response.sendRedirect("home.jsp");
     }
     else{
         response.sendRedirect("error.jsp");
     }
}
 
}
