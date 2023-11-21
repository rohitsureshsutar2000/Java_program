package com.demo.service;

public class Addition {	//	0		10
	public static int add(int a,int n)
	{
		
		if(a==n)
		{	System.out.println("rohit");
			return a;
		}
		
		System.out.println(a+" times run");
		return add(a+2,n);
	}
}
