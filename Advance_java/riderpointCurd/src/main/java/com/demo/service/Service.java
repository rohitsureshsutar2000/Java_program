package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface Service {
	List<Product> getProduct();

	Product editProduct(int pid);

	void updatepro(Product p);

	void addPro(Product p);

	void deleteProduct(int pid);
}
