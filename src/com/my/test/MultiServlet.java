package com.my.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.domain.model.Teacher;
import com.my.domain.service.TeacherService;
import com.my.util.BaseServlet;

public class MultiServlet extends BaseServlet{
	
	private static final long serialVersionUID = 1L;

	TeacherService teacherService = new TeacherService();
	
	Teacher teacher = new Teacher();
	
	/*http://localhost:8091/homework/multiServlet?method=add */	
	
	public void add(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(teacherService.teachDetail("1"));
	}
	
}
