package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.RiderStatus;


public class testRiderStatus {

	public static void main(String[] args) {
//		private int rider_id;	
//		private int status_id;
//		private String bike;
//		private String expense;

		
		RiderStatus rs1=new RiderStatus(1,"fz","3526");
		RiderStatus rs2=new RiderStatus(2,"m18","3500");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		s.save(rs1);
		s.save(rs2);
		t.commit();
		
	}

}
