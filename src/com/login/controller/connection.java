package com.login.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class connection{
	public static void main(final String args[]){
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				final Connection con=DriverManager.getConnection("");
			} catch (final ClassNotFoundException | SQLException ex) {
			}
			
			
			//final Statement stmt=con.createStatement()
			
	}
	
	
}