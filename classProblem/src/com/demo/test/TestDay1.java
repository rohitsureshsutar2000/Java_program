package com.demo.test;

import java.util.Scanner;

import com.demo.service.Addition;

public class TestDay1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Enter how many number do you want add");
		int a=sc.nextInt();
		System.out.println(Addition.add(i,a));
		

	}

}
