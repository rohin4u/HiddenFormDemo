package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class HiddenServlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		String name=req.getParameter("uname");
		out.println("<h1>Welcome "+name+"<br>");
		out.println("Please provide your age<br>");
		out.println("<form action='/HiddenFormDemo/test2'>");
		out.println("<input type='hidden' name='uname' value='"+name+"'>");
		out.println("Enter Age:<input type='text' name='age'><br>");
		out.println("<input type='submit' value='submit age'>");
		out.println("</form>");
	}

}
