package com.my.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.util.BaseServlet;

public class AdminClass extends BaseServlet{
	
	private static final long serialVersionUID = 1L;

	public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getParameter("name");
		req.getParameter("teacherId");
		
		System.out.println("进来喽");
		
		req.getRequestDispatcher("/success.jsp").forward(req, resp);
	}
}
