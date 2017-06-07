package com.my.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
	
	private static final String driver = "com.mysql.jdbc.Driver"; //数据库驱动
	//连接数据库的URL地址
	/*private static final String url = "jdbc.mysql://localhost:3306/jspdemo?useUnicode=true&characterEncoding=utf-8";*/
	private static final String url = "jdbc:mysql://localhost:3306/homework?useUnicode=true&characterEncoding=utf-8";
	//数据库的用户名
	private static final String username = "thinking"; //数据库驱动
	//数据库的密码
	private static final String password = "qaz123"; //数据库驱动
	
	private static Connection conn = null;

	//静态代码块负责加载驱动
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception{
		if(conn == null) {
			conn = DriverManager.getConnection(url, username, password);
			return conn;
		}
		return conn;
	}
	
	public static void main(String[] args) {
		try {
			Connection conn = DBHelper.getConnection();
			if(conn != null) {
				System.out.println("连接成功!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
