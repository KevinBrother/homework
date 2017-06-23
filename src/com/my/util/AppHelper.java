package com.my.util;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class AppHelper {
	
	public static String toJsonStringResponse(Object[]... objArrays) {
		
	    StringBuilder jsonString = new StringBuilder();

		if (objArrays[0][0].equals("err"))
			jsonString.append("{\"status\":\"fail\", \"result\":{");
		else
			jsonString.append("{\"status\":\"succ\", \"result\":{");
		
		for (Object[] objArray : objArrays)
			
			jsonString.append("\"").append(objArray[0]).append("\": ").append( JSON.toJSONString(objArray[1], SerializerFeature.WriteDateUseDateFormat) ).append(", ");

		// delete the end of comma. 
		return jsonString.deleteCharAt(jsonString.length() - 2).append("}}").toString();

	}
	
	public static void main(String[] args) {
		List<? extends Object> list = Arrays.asList("zzz", new Date(),"12311231");
		System.out.println(toJsonStringResponse(new Object[] {"list", list}));
	}
}
