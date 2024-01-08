package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBmanager {
	static Connection conn=null;
	public static Connection getConnection()
	{
		if(conn==null)
		{
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String conString="jdbc:mysql://192.168.10.150:3306/dac41?useSSL=false";
				conn=DriverManager.getConnection(conString,"dac41","welcome");
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return conn;
	}
}
