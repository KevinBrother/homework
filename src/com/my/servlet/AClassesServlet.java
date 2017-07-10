package com.my.servlet;

import java.io.IOException;

import static com.my.util.AppHelper.toJsonStringResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.my.domain.model.Classes;
import com.my.domain.service.AClasseService;
import com.my.domain.service.TeacherService;
import com.my.exception.BaseException;
import com.my.util.BaseServlet;

public class AClassesServlet extends BaseServlet{
	
	private static final long serialVersionUID = 1L;

	AClasseService aClasseService = new AClasseService();
	
	TeacherService teacherService = new TeacherService();
	
	//创建和修改
	public void makeClass(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, BaseException {
		String name = req.getParameter("name");
		int id = Integer.valueOf(req.getParameter("id"));
		int teacherId = Integer.valueOf(req.getParameter("teacherId"));
		
		Classes classes = new Classes();
		classes.setId(id);
		classes.setName(name);
		classes.setTeacherId(teacherId);
		
		aClasseService.makeClass(classes);
		
		//req.getRequestDispatcher("/success.jsp").forward(req, resp);
	}
	
	
	/*http://localhost:8091/homework/aClasses?method=teachPage*/	
	public void teachPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print(toJsonStringResponse(new Object[] {"teachPage", teacherService.jsonTeachPage()}));
		/*resp.getWriter().print(JSON.toJSONString(teacherService.jsonTeachPage()));*/
	}
	
	
	
}








