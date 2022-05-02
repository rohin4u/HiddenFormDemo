package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test2")
public class HiddenServlet2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		String name = req.getParameter("uname");
		String age = req.getParameter("age");
		out.println("<h1>Hi "+name+" Plz enter your Girl Friend Name...");
		out.println("<form action='/HiddenFormDemo/test3'>");
		out.println("<input type='hidden' name='uname' value='"+name+"'>");
		out.println("<input type='hidden' name='uage' value='"+age+"'>");
		out.println("Enter Girl Friend Name:<input type='text' name='ugfriend'><br>");
		out.println("<input type='submit' value='submit Girl Friend Name'>");
		out.println("</form>");
	}

}
