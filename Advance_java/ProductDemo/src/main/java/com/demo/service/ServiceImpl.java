/**
 * 
 */
package com.demo.service;

import java.util.List;

import org.apache.tomcat.util.digester.ServiceBindingPropertySource;

import com.demo.beans.Product;
import com.demo.dao.dao;
import com.demo.dao.daoimpl;



public class ServiceImpl implements Service {
	private dao edao;
	public ServiceImpl()
	{
		super();
		this.edao=new daoimpl();
	}
	
	@Override
	public List<Product> getProduct() {
		
		return edao.getProduct();
	}

	@Override
	public Product editProduct(int pid) {
		
		return edao.editProduct(pid);
	}

	@Override
	public void updatepro(Product p) {
		
		edao.updatepro(p);
	}

	@Override
	public void addPro(Product p) {
		edao.addPro(p);
		
	}

	@Override
	public void deleteProduct(int pid) {
		edao.deletepro(pid);
	}
	
	
}
