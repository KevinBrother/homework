package com.my.domain.service;

import javax.servlet.http.HttpServletResponse;

import com.my.domain.dao.AdminDao;
import com.my.domain.model.Admin;
import com.my.exception.BaseException;

public class AdminService {
	AdminDao adminDao = new AdminDao();
	
	public Admin login(Admin admin, HttpServletResponse resp) throws Exception {
		
		//不能通过简单的姓名登录  如果两个重名就没法判断了
		if(admin.getName().length() < 2) { 
			System.out.println("请输入正确的用户名");
			throw new BaseException(admin.getName(), "请输入正确的用户名");
			
		}else if(admin.getPassword().length() < 6)
			throw new RuntimeException("请输入正确的密码");
		
		else {
			admin = adminDao.login(admin);
			
 			if(admin.getName() == "" || admin.getName() == null)
 				throw new RuntimeException("请输入正确的用户名或密码");
 			
		}

		return admin;
	}
}
