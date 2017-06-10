package com.my.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseException extends Exception{
	
	private static final Logger logger = LoggerFactory.getLogger(BaseException.class);
	
	private String name;
	
	private String message;
	
	public BaseException(String name, String message){
		this.name = name;
		this.message = String.format(message);
	}
	
	public BaseException(String message){
		this.message = message;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return "BaseException [name=" + name + ", message=" + message + "]";
	}
	
	public static void main(String[] args) {
		BaseException e = new BaseException("密码不对", "赶紧去重输密码吧！");
		logger.info("{},{}", e.getName(), e.getMessage());
		
	}
	
}
