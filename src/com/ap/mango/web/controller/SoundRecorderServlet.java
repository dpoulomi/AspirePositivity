package com.ap.mango.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Singleton;

/**
 * Servlet implementation class SoundRecorder
 */
@Singleton
public class SoundRecorderServlet extends HttpServlet {
    /**
	 * Serial id 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
		
		/* final StringBuffer jb = new StringBuffer();
		 JSONObject jsonObject= new  JSONObject();
		  String line = null;
		  try {
		    final BufferedReader reader = request.getReader();
		    while ((line = reader.readLine()) != null)
		      jb.append(line);
		  } catch (final Exception e) { report an error }

		  try {
		     jsonObject =  HTTP.toJSONObject(jb.toString());
		  } catch (final JSONException e) {
		    // crash and burn
		    throw new IOException("Error parsing JSON request string");
		  }
		  
		  */

      //  final String button = request.getParameterNames()
		
		
	/*	 final SoundRecorderService loginService = new SoundRecorderService();
		 
		 loginService.saveRecordedData(jsonObject);*/
   
        	 response.sendRedirect("soundRecord.jsp");
       // } 
}
 
}
