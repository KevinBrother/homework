package com.my.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.my.domain.service.AClasseService;
import com.my.domain.service.TeacherService;
import com.my.util.BaseServlet;

public class AdminClasses extends BaseServlet{
	
	private static final long serialVersionUID = 1L;

	AClasseService aClasseService = new AClasseService();
	
	TeacherService teacherService = new TeacherService();
	public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int teacherId = Integer.valueOf(req.getParameter("teacherId"));
		
		aClasseService.add(name, teacherId);
		
		req.getRequestDispatcher("/success.jsp").forward(req, resp);
	}
	
	public void teachPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print(teacherService.jsonTeachPage());
	}
	
	
}
