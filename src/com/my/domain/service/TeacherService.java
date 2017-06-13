package com.my.domain.service;

import java.util.List;

import com.my.domain.dao.TeacherDao;
import com.my.domain.model.Teacher;

public class TeacherService {
	
	TeacherDao teacherDao = new TeacherDao();
	
	public void addTeach(Teacher teacher) {
		teacherDao.addTeach(teacher);
	}
	
	public List teachPage() {
		return teacherDao.teachPage();
	}
	
	public Teacher teachDetail(String teacherId) {
		return teacherDao.teachDetail(teacherId);
	}

	public void modifyTeach(Teacher teacher) {
		//找到后改变属性再修改
		teacherDao.modifyTeach(teacher);
	}

}
