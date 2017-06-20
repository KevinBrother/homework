package com.my.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.domain.model.Teacher;
import com.my.domain.service.TeacherService;

public class TeachPageServlet extends HttpServlet{
	
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
		req. setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=GBK");
	  /*resp. setCharacterEncoding("UTF-8"); */
		resp.setHeader("content-type", "text/html;charset=GBK");
		
		req.setAttribute("teachersList", teacherService.teachPage());	
		/*resp.getWriter().print(teacherService.teachPage());*/
		/*req.getRequestDispatcher("/test/teachPage.jsp").forward(req, resp);*/
		req.getRequestDispatcher("/admin/teach/teachPage.jsp").forward(req, resp);
		
	}
}
