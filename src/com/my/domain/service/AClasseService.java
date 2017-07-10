package com.my.domain.service;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.my.domain.dao.AClassesDao;
import com.my.domain.model.Classes;
import com.my.exception.BaseException;

public class AClasseService {
	
	AClassesDao aClassesDao = new AClassesDao();
	
	public void makeClass(Classes classes) throws BaseException {
		
		if(classes.getId() ==  0) {
			aClassesDao.create(classes);
		} else {
			
			Map<String, Object> classMap = aClassesDao.find(classes);
			
			System.out.println(classMap);
			
			if(classMap.size() == 0) {
				throw new BaseException( "请输入正确的用户名");
			} else {
				classMap.put("id", classes.getId());
				classMap.put("name", classes.getName());
				classMap.put("teacherId", classes.getTeacherId());
				
				String jsonStr = JSON.toJSONString(classMap);
				Classes oldClass = JSON.parseObject(jsonStr, Classes.class);
				
				aClassesDao.modify(oldClass);
			}
		}
		
	}
}
