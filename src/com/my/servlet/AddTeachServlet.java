package com.my.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.domain.model.Teacher;
import com.my.domain.service.TeachersService;

public class AddTeachServlet extends HttpServlet{
	
	TeachersService teachersService = new TeachersService();
	
	Teacher teacher = new Teacher();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		this.doPost(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/*PrintWriter out = resp.getWriter(); */
		req. setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		resp. setCharacterEncoding("UTF-8");
		resp.setHeader("content-type", "text/html;charset=UTF-8"); 
		
		teacher.setName(req.getParameter("name"));
		teachersService.addTeach(teacher);
		
		req.getRequestDispatcher("/success.jsp").forward(req, resp);
	}
}
