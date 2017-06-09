package com.my.domain.service;

import com.my.domain.dao.TeachersDao;
import com.my.domain.model.Teacher;

public class TeachersService {
	
	TeachersDao teachersDao = new TeachersDao();
	
	public void addTeach(Teacher teacher) {
		teachersDao.addTeach(teacher);
	}

	public void modifyTeach(Teacher teacher) {
		//找到后改变属性再修改
		teachersDao.modifyTeach(teacher);
	}

}
