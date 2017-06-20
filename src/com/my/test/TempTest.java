package com.my.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.alibaba.fastjson.JSON;
import com.my.domain.model.Teacher;
import com.my.util.AppHelper;

public class TempTest {
	public static void main(String[] args) {
		/*String str = "[Teacher [id=1, name=王老师, password=, teachCourse=, isTutor=false, leadClassId=0], Teacher [id=2, name=曹老师, password=qwer1234, teachCourse=, isTutor=false, leadClassId=0], Teacher [id=3, name=米老师, password=qwer1234, teachCourse=, isTutor=false, leadClassId=0]]";
		String str2 = "[{\"name\":\"李明\",\"age\":19},{\"name\":\"张三\",\"age\":12}]";
		String str3 = "[{password=, leadClassId=null, name=王老师, id=1, teachCourse=, isTutor=false}, {password=qwer1234, leadClassId=null, name=曹老师, id=2, teachCourse=, isTutor=false}, {password=qwer1234, leadClassId=null, name=米老师, id=3, teachCourse=, isTutor=false}]";
		String str4 = "[myProjPage, [{status=发运, focusOn=国家层面间合作项目}, {status=立项, focusOn=精密公司}]]";
		String abcString = AppHelper.toJsonStringResponse(new Object[] {"abc", str4});
		JSONArray JSONObjectjson = JSONArray.fromObject(new Object[] {"abc", str4});
		System.out.println(JSON.parseArray(abcString));
		System.out.println(JSONObjectjson);
		System.out.println(JSONObjectjson.toString());*/
		
		List<Teacher> list = new ArrayList<Teacher>();
		Teacher t = new Teacher();
		t.setId(1);
		t.setName("王");
		t.setPassword("a123123");
	/*	list.add(t);
		JSONObject jsont = JSONObject.fromObject(t);  
		JSONArray jsonList = JSONArray.fromObject(list);  
        System.out.println(jsont);  
        System.out.println(jsonList);  */
		/*JSONArray jsont = JSONArray.fromObject(new Object[] {"abc", t.toString()});*/
		System.out.println(t);
		
		
	}
}
