package com.my.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.domain.model.Teacher;
import com.my.domain.service.TeacherService;

public class TeachPageServlet extends HttpServlet{
	
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
		resp.setContentType("text/html;charset=utf-8");
		resp. setCharacterEncoding("UTF-8");
		resp.setHeader("content-type", "text/html;charset=UTF-8"); 
		PrintWriter out = resp.getWriter();
		
/*	    JSONObject jsonObject = new JSONObject();  
        jsonObject.put("categorys", teacherService.teachPage()); 
        
        JSONArray jsonArray = new JSONArray();  
        jsonArray.add(jsonObject);  */
		List<Teacher> teachersList = teacherService.teachPage();
		
		req.setAttribute("teachersList", teachersList);		
		
		req.getRequestDispatcher("/admin/teach/teachPage.jsp").forward(req, resp);
		
	}
}
