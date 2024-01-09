package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface dao {

	List<Product> getProduct();

	Product editProduct(int pid);

	void updatepro(Product p);

	void addPro(Product p);

	void deletepro(int pid);



}
