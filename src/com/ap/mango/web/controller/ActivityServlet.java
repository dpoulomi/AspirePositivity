package com.ap.mango.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Singleton;

/**
 * Servlet implementation class ActivityServlet
 */
@Singleton
public class ActivityServlet extends HttpServlet {
    /**
	 * Serial id 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
 
   
   /*  final LoginService loginService = new LoginService();
     final boolean result = loginService.authenticateUser(username, password);
     final Users user = loginService.getUserByUserName(username);*/
		
		
        final String button = request.getParameter("button");
        if ("button1".equals(button)) {
        	 response.sendRedirect("soundRecord.jsp");
        } /*else if ("button2".equals(button)) {
        	response.sendRedirect("activity.jsp");
        } else if ("button3".equals(button)) {
        	response.sendRedirect("activity.jsp");
        } */
/*
        if ("button1".equals(button)) {
            myClass.method1();
        } else if ("button2".equals(button)) {
            myClass.method2();
        } else if ("button3".equals(button)) {
            myClass.method3();
        } else {
            // ???
        }

        request.getRequestDispatcher("/WEB-INF/some-result.jsp").forward(request, response);
    }
		*/
     /*if(result == true){
         request.getSession().setAttribute("user", user);      
         response.sendRedirect("home.jsp");
     }
     else{
         response.sendRedirect("error.jsp");
     }*/
}
 
}
