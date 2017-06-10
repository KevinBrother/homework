package com.my.domain.service;

import java.util.ArrayList;

import com.my.domain.dao.TeacherDao;
import com.my.domain.model.Teacher;

public class TeacherService {
	
	TeacherDao teacherDao = new TeacherDao();
	
	public void addTeach(Teacher teacher) {
		teacherDao.addTeach(teacher);
	}
	
	public ArrayList<Teacher> teachPage() {
		return teacherDao.teachPage();
	}
	
	public void teachDetail(Teacher teacher) {
		teacherDao.teachDetail(teacher);
	}

	public void modifyTeach(Teacher teacher) {
		//找到后改变属性再修改
		teacherDao.modifyTeach(teacher);
	}

}
