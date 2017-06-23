package com.my.domain.service;

import com.my.domain.dao.AClassesDao;

public class AClasseService {
	
	AClassesDao aClassesDao = new AClassesDao();
	
	public void add(String name, int teacherId) {
		aClassesDao.add(name, teacherId);
	}
}
