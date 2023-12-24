package com.demo.servlet;

import java.sql.Connection;
import java.util.Scanner;

import com.demo.dao.DBUtil;

public class testOperan {
	static Connection conn;
	public static void main(String[] args) {
		
		conn=DBUtil.getConnection();
		if(conn!=null) {
			System.out.println("server is running");
			
		}
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("1.Rider Login\n2. Pillion Login");
//		int ch=sc.nextInt();
//		
//		switch(ch)
//		{
//		case 1:
//			
//			break;
//		case 2:
//			break;
//		default:
//			break;
//		}
	}

}
