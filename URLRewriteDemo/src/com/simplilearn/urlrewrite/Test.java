package com.simplilearn.urlrewrite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ecommerce?characterEncoding=utf8";
		String 	userid="root";
		String	password="master";
		
		try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userid, password);
            if(connection!=null) {
            	System.out.println("Connected");
            	ResultSet set=connection.createStatement().executeQuery("select * from eproduct");
            	while(set.next()) {
            		System.out.println(set.getString(2));
            	}
            }
            else {
            	System.out.println("Error in connection");
            }

		} catch (Exception e) {
			System.out.println(e);
		}
		


	}

}
