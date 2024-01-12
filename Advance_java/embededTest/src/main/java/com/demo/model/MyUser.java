package com.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="enbaddedtabletest")

public class MyUser {
	@Id
	private int id;
	private String name;
	@Embedded
	private Address addrId;
	public MyUser() {
		super();
	}
	public MyUser(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addrId = addr;
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
		return addrId;
	}
	public void setAddr(Address addr) {
		this.addrId = addr;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", addr=" + addrId + "]";
	}
	
	
}
