package com.demo.beans;

import java.time.LocalDate;

public class OrderDetails {
	
	private String pname;
	private Double price;
	private int qty;
	private LocalDate orderDate;
	public OrderDetails() {
		super();
	}
	public OrderDetails( String pname, Double price, int qty, LocalDate orderDate) {
		super();
		
		this.pname = pname;
		this.price = price;
		this.qty = qty;
		this.orderDate = orderDate;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "OrderDetails [pname=" + pname + ", price=" + price + ", qty=" + qty + ", orderDate="
				+ orderDate + "]";
	}
	
	
	
}
