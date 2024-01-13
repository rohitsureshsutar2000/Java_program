package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Sayhello;
import com.demo.model.User;

public class testHello {

	public static void main(String[] args) {
		ApplicationContext stx= new ClassPathXmlApplicationContext("springconfig.xml");
		Sayhello hlo=(Sayhello) stx.getBean("hi");
		System.out.println();
		hlo.hello();
		
		User u=(User) stx.getBean("u1");
		System.out.println(u);
		
		User u2=(User) stx.getBean("u2");
		System.out.println(u2);
	}

}
