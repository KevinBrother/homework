package com.my.domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.my.domain.model.Teacher;
import com.my.util.CloseAllDao;
import com.my.util.DBHelper;

public class ClassDao {
	
	protected static final Logger logger = LoggerFactory.getLogger(TeacherDao.class);
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement prepStmt = null;
	ResultSet rs = null;
	
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
			CloseAllDao.close(stmt, prepStmt, rs);
		}
	}

}
