package com.gamehub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String message = "called SquareServlet's doGet()";
		
		//used in RequestDispatcher
		//int sum = (int) req.getAttribute("sum"); //fetching sum attribute from request object from AddServlet
		
		
		//used in sendRedirect
		int sum = Integer.parseInt(req.getParameter("sum")); //fetch sum parameter from  request object from client
		
		int result = sum * sum; //square the sum
		
		System.out.println(message); //prints to console
		PrintWriter out= res.getWriter();
		out.println(message);		 //prints to browser
		
		out.println("the result of squaring is: " + result);
		
		
	}

}
