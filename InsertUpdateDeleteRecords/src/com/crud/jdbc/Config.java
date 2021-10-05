package com.crud.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {

	public static Connection getconnection(String url,String user,String password)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
