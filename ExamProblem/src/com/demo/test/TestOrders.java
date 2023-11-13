package com.demo.test;

import java.util.Scanner;

import com.demo.service.Service;
import com.demo.service.ServiceImpl;

public class TestOrders {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Service eservice=new ServiceImpl();
		int ch;
		do {
			System.out.println("1. add item in grocery\n2. update the quantity of Grocery\n3. Display All Grocery list\n4. remove all empty stock item\n5. Display all product for which stock updated in last 3 days\n6. exit");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				eservice.addItem();
				break;
			case 2:
				eservice.updateItem();
				break;
			case 3:
				eservice.displayAll();
				break;
			case 4:
				eservice.removeItem();
				
				break;
			case 5:
				eservice.updatedData();
				
				break;
			case 6:
				sc.close();
				System.out.println("thank you...");
				break;
			default:
				break;
			}
		}while(ch!=6);

	}

}
