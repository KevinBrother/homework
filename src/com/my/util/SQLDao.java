package com.my.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.my.domain.dao.AClassesDao;

public class SQLDao {
	
	protected static final Logger logger = LoggerFactory.getLogger(AClassesDao.class);
	static Connection conn = null;
	static Statement stmt = null;
	static PreparedStatement prepStmt = null;
	static ResultSet rs = null;
	
	public static int sqlRetInt(String sql) {
		try {
			//获取链接
		    conn = DBHelper.getConnection();
			
			//得到运行环境，并且执行sql
			stmt = conn.createStatement();

			//获得结果
			int re  = stmt.executeUpdate(sql);
			//处理结果
			logger.info("===<<<<<=====" + re);
			
			return re;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			CloseAllDao.close(stmt, prepStmt, rs);
		}
		
		return 0;
	}
	
	//返回list类型的数据
	public static List<Map<String, Object>> sqlRetList(String sql) {
		try {
			//获取链接
		    conn = DBHelper.getConnection();
			//得到运行环境，并且执行sql
			prepStmt = conn.prepareStatement(sql);
	        //获得结果
			rs  = prepStmt.executeQuery();
			//处理结果
			
			List<Map<String, Object>>  list =  ModelConvert.convertList(rs);
			
			logger.info("===<<<<<=====" + list);
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//返回map类型的数据
	public static Map<String, Object> sqlRetMap(String sql) {
		try {
			//获取链接
			conn = DBHelper.getConnection();
			//得到运行环境，并且执行sql
			prepStmt = conn.prepareStatement(sql);
			//获得结果
			rs  = prepStmt.executeQuery();
			//处理结果
			
			Map<String, Object>  map =  ModelConvert.convertMap(rs);
			
			logger.info("===<<<<<=====" + map);
			
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
