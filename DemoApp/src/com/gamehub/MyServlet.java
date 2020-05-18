package com.gamehub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("Hi<br>");
		
		//Servlet Context
		//ServletContext ctx = getServletContext();
		//String str = ctx.getInitParameter("name");
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		out.println(str);
		
		//out.println("<br>");
		//String phoneType = ctx.getInitParameter("phone");
		//out.println("I have an " + phoneType);
	}

}
