package com.login.controller;
 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.model.Users;
import com.login.service.RegisterService;
 
 
public class RegisterServlet extends HttpServlet {
    @Override
	public void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     final PrintWriter out = response.getWriter();
     final String firstName = request.getParameter("firstName");
     final String username = request.getParameter("username");
     final String lastName = request.getParameter("lastName");
     final String emailId = request.getParameter("email");
     final String userId = request.getParameter("userId");
     final String password = request.getParameter("password");
     final Users user = Users.builder()
    		 					.firstName(firstName)
    		 					.lastName(lastName)
    		 					.emailId(emailId)
    		 					.password(password)
    		 					.username(username)
    		 					.build();
             
    
     try { 
         final RegisterService registerService = new RegisterService();
         final boolean result = registerService.register(user);      
         out.println("<html>");
         out.println("<head>");      
         out.println("<title>Registration Successful</title>");    
         out.println("</head>");
         out.println("<body>");
         out.println("<center>");
         if(result){
             out.println("<h1>Thanks for Registering with us :</h1>");
             out.println("To login with new UserId and Password<a href=login.jsp>Click here</a>");
         }else{
             out.println("<h1>Registration Failed</h1>");
             out.println("To try again<a href=register.jsp>Click here</a>");
         }
         out.println("</center>");
         out.println("</body>");
         out.println("</html>");
     } finally {       
         out.close();
     }
}
 
}