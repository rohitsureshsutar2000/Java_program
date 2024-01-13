package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class MyUser {
	@Id
	private int id;
	private String name;
//	@OneToOne						//get single table no join query 
	@OneToOne(fetch=FetchType.LAZY)			//display  two tables using join query 
	private Address addr;
	public MyUser() {
		super();
	}
	public MyUser(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
}
