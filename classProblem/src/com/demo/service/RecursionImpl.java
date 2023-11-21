package com.demo.service;

public class RecursionImpl {
	static int i=1; 
	public static int facto(int a,int n)
	{
		
		if(i==n)
		{
			return a;
		}
		i++;
		return facto(a*i,n);
	}
}
