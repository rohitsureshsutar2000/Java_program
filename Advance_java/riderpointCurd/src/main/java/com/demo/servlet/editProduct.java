package com.demo.servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class editProduct
 */
@WebServlet("/editpd")
public class editProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
		System.out.println(pid);
		Service srv=new ServiceImpl();
		Product p=srv.editProduct(pid);
		System.out.println(p);
		request.setAttribute("seletedpd", p);
		RequestDispatcher rd=request.getRequestDispatcher("editproduct2.jsp");
		rd.forward(request, response);
		
	}


	

}
