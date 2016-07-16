package org.naren.javabrains;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("XML servlet called.");
		response.setContentType("text/html");
		String username = request.getParameter("username");
		PrintWriter out = response.getWriter();		
		out.println("Hello from getMethod! " + username);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("XML servlet called.");
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String fullname = request.getParameter("fullname");
		String profession = request.getParameter("profession");
		String[] location = request.getParameterValues("location");

		PrintWriter out = response.getWriter();		
		out.println("Hello from postMethod! " + username +"  your full name is  "+ fullname+" profession is "+ profession+ " was in location ");
		for(int i=0;i<location.length;i++){
			out.println(location[i]);
		}
	}
}
