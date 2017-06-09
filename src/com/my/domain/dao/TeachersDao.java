package com.my.domain.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.my.domain.model.Teacher;
import com.my.util.DBHelper;

public class TeachersDao {
	
	protected static final Logger logger = LoggerFactory.getLogger(TeachersDao.class);
	Connection conn = null;
	Statement stmt = null;
	
	public void addTeach(Teacher teacher) {
		try {
			//获取链接
		    conn = DBHelper.getConnection();
		    logger.info("===>>>>>====" + teacher);
			String sql = "insert into teacher (name, password) values ("
					+ "'" + teacher.getName() + "','qwer1234')";
			//得到运行环境，并且执行sql
			stmt = conn.createStatement();
	        //获得结果
			int re  = stmt.executeUpdate(sql);
			//处理结果
			logger.info("===<<<<<=====" + re);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			//释放语句对象
			if(stmt != null){
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
	}

	public void modifyTeach(Teacher teacher) {
		try {
			//获取链接
		    conn = DBHelper.getConnection();
		    logger.info("===>>>>>====" + teacher);
			String sql = "update table teacher "
		    + "set name='" + teacher.getName() + ", password='" + teacher.getPassword() + "'";
			//得到运行环境，并且执行sql
			stmt = conn.createStatement();
	        //获得结果
			int re  = stmt.executeUpdate(sql);
			//处理结果
			logger.info("===<<<<<=====" + re);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			//释放语句对象
			if(stmt != null){
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
	}
}
