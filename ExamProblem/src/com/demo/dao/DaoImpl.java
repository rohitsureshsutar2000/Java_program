package com.demo.dao;

import java.util.Date;
import java.time.Month;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


import com.demo.beans.OrderDetails;

public class DaoImpl implements Dao {
	Scanner sc=new Scanner(System.in);
	
	static HashMap<String,Double> map;
	static List<OrderDetails> lst;
	static {
		lst=new ArrayList<>();
		lst.add(new OrderDetails("colgate",100.0,10,LocalDate.of(2012,06, 25)));
		lst.add(new OrderDetails("Harpic",100.0,11,LocalDate.of(2018,01, 27)));
		lst.add(new OrderDetails("peanut",100.0,0,LocalDate.of(2023,11, 9)));
		lst.add(new OrderDetails("soap",100.0,10,LocalDate.of(2018,12, 23)));
		lst.add(new OrderDetails("Detergent",100.0,5,LocalDate.of(2023,11,11)));
		map=new HashMap<>();
		map.put("rice",100.0);
		map.put("wheat",20.0);
		map.put("oil",35.0);
		map.put("tea",65.0);
	}
	
	@Override
	public void addItem() {
		System.out.println("Enter item from rice,wheat,oil,tea \n if list is done then enter 0 ");
		String s=sc.nextLine();
		for (int i=0;i<10;i++)
		{
			if (map.containsKey(s))
			{
				System.out.println("enter Quantity");
				int qty=sc.nextInt();
				Double val=map.get(s);
				LocalDate d=LocalDate.now();
				System.out.println(s+val+qty+d);
				OrderDetails orr=new OrderDetails(s,val,qty,d);
				lst.add(orr);

			}
		}
		
	}

	@Override
	public void updateItem() {
		System.out.println("enter item name ");
		String s=sc.nextLine();
		for(OrderDetails i:lst)
		{
				if (i.getPname().equals(s))
				{
					System.out.println("enter Qty");
					int qty1=sc.nextInt();
					i.setQty(qty1);
					break;
				}
			}
			
		}	

	@Override
	public void displayAll() {
		for(OrderDetails i:lst)
		{
			System.out.println(i);
		}
		
	}

	@Override
	public void removeItem() {
		for(int i=0;i<lst.size();i++)
		{
			if ((lst.get(i).getQty())==0)
			{
				lst.remove(i);
			}
		}
	}

	@Override
	public void updatedData() {
//		LocalDate cd= new LocalDate.parse();
		int dd=LocalDate.now().getDayOfMonth();
		Month MM=LocalDate.now().getMonth();
		int yy=LocalDate.now().getYear();
		System.out.println(dd+" "+MM+" "+yy);
		
		for(OrderDetails i:lst)
		{
			int dd1=i.getOrderDate().getDayOfMonth();
			Month MM1=i.getOrderDate().getMonth();
			int yy1=i.getOrderDate().getYear();
			if ((MM==MM1) & (yy==yy1) & (dd-dd1 <3) )
			{
				System.out.println(i);
			}
			
		}
				
	}
}
