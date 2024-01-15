package com.demo.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.User;

public class testUserWireBdg {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		User u1=(User) ctx.getBean("u");
		System.out.println(u1);
		
	}

}
