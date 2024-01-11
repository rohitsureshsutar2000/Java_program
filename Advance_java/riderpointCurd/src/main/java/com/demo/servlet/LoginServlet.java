package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Rider;
import com.demo.service.LoginServise;
import com.demo.service.LoginServiseImpl;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("userN");
		String pass=request.getParameter("passN");
		
		
		LoginServise ls=new LoginServiseImpl();
		Rider rider=ls.validUser(uname,pass);
		
		if(rider!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("rider", rider);
			RequestDispatcher rd=request.getRequestDispatcher("Product");
			rd.forward(request, response);
		}
		else
		{
			
			out.println("Invalid credantial!!");
		}
	}

}
