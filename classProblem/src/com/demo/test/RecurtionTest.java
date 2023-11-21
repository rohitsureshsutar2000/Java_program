package com.demo.test;

import java.util.Scanner;

import com.demo.service.RecursionImpl;

public class RecurtionTest {

	public static void main(String[] args) {
		// calculate factorial 
		Scanner sc =new Scanner(System.in);
		int i=1;
		System.out.println("Enter no ");
		int a=sc.nextInt();
		System.out.println(RecursionImpl.facto(i, a));

	}

}
