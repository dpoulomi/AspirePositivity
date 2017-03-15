package com.login.controller;
 
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.user;
import com.login.service.LoginService;
 
 
public class LoginServlet extends HttpServlet {
    /**
	 * Serial id 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
 
     final String userId = request.getParameter("userId");   
     final String password = request.getParameter("password");
     final LoginService loginService = new LoginService();
     final boolean result = loginService.authenticateUser(userId, password);
     final user user = loginService.getUserByUserId(userId);
     if(result == true){
         request.getSession().setAttribute("user", user);      
         response.sendRedirect("home.jsp");
     }
     else{
         response.sendRedirect("error.jsp");
     }
}
 
}
