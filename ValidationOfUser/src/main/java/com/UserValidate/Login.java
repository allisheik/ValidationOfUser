package com.UserValidate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.getWriter().append("Served at: ").append(req.getContextPath());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String Username= req.getParameter("uname");
		String Password= req.getParameter("pass");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
	
		
		if(Username.equals("AlliSheik") && Password.equals("alli786"))
		{
			res.sendRedirect("Welcome");
		}
		else if(Username.equals("Ravi") && Password.equals("ravi123")){
			res.sendRedirect("Welcome");
		}
		else if(Username.equals("mahesh") && Password.equals("mbmb")){
			res.sendRedirect("Welcome");
		}
		else if(Username.equals("hemanth") && Password.equals("splh")){
			res.sendRedirect("Welcome");
		}
		else
		{
			out.println("Username or password is incorrect");
		}
	}

}