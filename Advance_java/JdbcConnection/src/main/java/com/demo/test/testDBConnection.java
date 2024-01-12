package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;

import com.demo.dao.DBmanager;

public class testDBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=DBmanager.getMyConnection();
		if(conn!=null)
		{
			System.out.println("Connection Done...");
		}
		else
		{
			System.out.println("Connection failed...");
		}
	}

}
