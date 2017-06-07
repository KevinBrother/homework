package com.my.domain.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.my.domain.dao.AdminDao;
import com.my.domain.model.Admin;

public class AdminService {
	AdminDao adminDao = new AdminDao();
	
	public Admin login(Admin admin, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter(); 
		
		//不能通过简单的姓名登录  如果两个重名就没法判断了
		if(admin.getName().length() < 2) { 
			System.out.println("请输入正确的用户名");
			out.println("请输入正确的用户名");
			/*throw new ErrorHandler();*/
		}else if(admin.getPassword().length() < 6)
			System.out.println("请输入正确的密码");
		else
			admin = adminDao.login(admin);

		return admin;
	}
}
