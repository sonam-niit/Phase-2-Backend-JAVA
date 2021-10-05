package com.db.sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {

	public static Connection getConnection(String url,String user, String pwd) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, pwd);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
