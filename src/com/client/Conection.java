package com.client;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conection {
	
	static Connection con;
	
	public static Connection provideConnection() {
		
		try {
			//1 step - load the driver
			//Class.forName("com.mysql.jdbc.Driver");
			
			//2 step- get the connection
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
	
			if(con!=null)
				System.out.println("Connection created successfully..!");
			else
				System.out.println("failed to create connection");
			
			
			//3 step close the connection
			//con.close();
			
			}catch(Exception e) {
				System.out.println(e);
			}

		return con;
		
	}
	
	
}
