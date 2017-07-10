package com.my.domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.my.domain.model.Classes;
import com.my.util.CloseAllDao;
import com.my.util.DBHelper;
import com.my.util.SQLDao;

public class AClassesDao {
	
	protected static final Logger logger = LoggerFactory.getLogger(AClassesDao.class);
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement prepStmt = null;
	ResultSet rs = null;
	
	public void create(Classes classes) {
		try {
			//获取链接
		    conn = DBHelper.getConnection();
		    logger.info("===>>>>>====" + classes.getName(), classes.getTeacherId());
			String sql = "insert into classes (name, teacherId) values ("
					+ "'" + classes.getName() + "','" + classes.getTeacherId() + "')";
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

	public Map<String, Object> find(Classes classes) {
		String sql = "select * from classes where id = " + classes.getId();
		
		Map<String, Object> map = SQLDao.sqlRetMap(sql);
		
		return  map;
	}

	public void modify(Classes oldClass) {
		String sql = "update classes set id= " + oldClass.getId() + 
				", name=" + oldClass.getName() +  
				", teacherId" + oldClass.getTeacherId();
		Integer curNum = SQLDao.sqlRetInt(sql);
		
		
	}
	
}
