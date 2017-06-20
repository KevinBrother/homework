package com.my.domain.service;

import java.util.List;
import java.util.Map;

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
	
	public List<Map<String, Object>> jsonTeachPage() {
		return teacherDao.jsonTeachPage();
	}
	
	public Teacher teachDetail(String teacherId) {
		Teacher teacher	= 	teacherDao.teachDetail(teacherId);
				return teacher;
	}

	public void modifyTeach(Teacher teacher) {
		//找到后改变属性再修改
		teacherDao.modifyTeach(teacher);
	}

}
