package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.Service;
import com.demo.service.ServiceImpl;

/**
 * Servlet implementation class AddPro
 */
@WebServlet("/addpro")
public class AddPro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Service srv=new ServiceImpl();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		
		Product p=new Product(id,name,price);
		srv.addPro(p);
		RequestDispatcher rd=request.getRequestDispatcher("Product");
		rd.forward(request, response);
		
	}

}
