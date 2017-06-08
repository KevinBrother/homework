package com.my.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.domain.model.Admin;
import com.my.domain.service.AdminService;

public class Login extends HttpServlet{
	
	AdminService adminService = new AdminService();
	
	Admin admin = new Admin();
	
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
		
		admin.setName(req.getParameter("name"));
		String job = req.getParameter("job");
		admin.setPassword(req.getParameter("password"));

		AdminService adminService = new AdminService();
		
		if(job.length() < 0 ) 
			System.out.println("请输入职业");	
		if(job.equals("管理员")) {
			admin = adminService.login(admin, resp);
			req.setAttribute("admin", admin);
			req.setAttribute("abc", "abcd");
			req.getRequestDispatcher("/admin/welcome.jsp").forward(req, resp);
		}
	}
}
