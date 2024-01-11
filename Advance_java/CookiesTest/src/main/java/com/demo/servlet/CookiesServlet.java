package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
	

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String btn=request.getParameter("btn");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		switch (btn) {
			case "add": {
				
				String name=request.getParameter("name");
				String val=request.getParameter("val");
				
				Cookie c=new Cookie(name, val);
				response.addCookie(c);
				out.println("CooKie is add...");
				break;
			}
			case "show": {
					Cookie[] arr=request.getCookies();
					for(Cookie i: arr)
					{
						out.println(i.getName()+"   "+i.getValue());
					}
				break;
			}
			case "delete": {
				String name=request.getParameter("name1");
				Cookie[] arr=request.getCookies();
				for(Cookie i: arr)
				{
					if(i.getName().equals(name))
					{
						i.setMaxAge(0);
						response.addCookie(i);
						out.println("Cookie are deleted...");
					}
					
				}
				break;	
			}
			
			default:
			{
				break;
			}
		}
		
	}

	

}
