package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test3")
public class HiddenServlet3 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		String name = req.getParameter("uname");
		String age = req.getParameter("uage");
		String gfriend = req.getParameter("ugfriend");
		out.println("<h1>Your Total Information is:<br>");
		out.println("Name:"+name+"<br/>");
		out.println("Age:"+age+"<br/>");
		out.println("Girl Friend Name:"+gfriend+"<br/>");
		out.println("Thanks for providing Complete information</h1>");
	}

}
