package com.simplilearn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

	public static void main(String[] args) {
		
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/simplilearn";
		String uname="root";
		String password="";

		try {
			Class.forName(driver); // load driver
			Connection conn=DriverManager.getConnection(url,uname,password);
			//get the connection with db
			
			if(conn!=null) {
				System.out.println("Connection Established");
			}
			else {
				System.out.println("Error in connection");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
