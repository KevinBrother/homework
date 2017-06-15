package com.my.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.domain.model.Teacher;
import com.my.domain.service.TeacherService;

public class TeachDetailServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	TeacherService teacherService = new TeacherService();
	
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
		
		System.out.println(req.getParameter("id"));
		String teacherId = req.getParameter("id");
		
		req.setAttribute("teacher", teacherService.teachDetail(teacherId));
		
		req.getRequestDispatcher("/admin/teach/teachDetail.jsp").forward(req, resp);
	}
}
