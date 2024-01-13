package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;


public class TestOneToOne {

	public static void main(String[] args) {
		Address addr=new Address(1,"main road","atpadi");
		Address addr1=new Address(2,"limbude road","atpadi");
		MyUser u1=new MyUser(1,"rohit",addr);
		MyUser u2=new MyUser(2,"pranav",addr1);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		session.save(addr);
		session.save(addr1);
		session.save(u1);
		session.save(u2);
		
		t.commit();
		session.close();
		
		// display tables
		Session session2=sf.openSession();
		Transaction t2=session2.beginTransaction();
		MyUser u=session2.load(MyUser.class,2);
	
		
		System.out.println("******************************************************");
		System.out.println(u);				//		MyUser [id=1, name=rohit, addr=Address [addrId=1, street=main road, city=atpadi]]
		System.out.println("******************************************************");
		Address a=session2.load(Address.class,2);
		System.out.println(a);	
		
	}

}
