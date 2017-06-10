package com.my.domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.my.domain.model.Admin;
import com.my.util.DBHelper;

public class AdminDao {
	
	protected static final Logger logger = LoggerFactory.getLogger(AdminDao.class);
	
	public Admin login(Admin admin) {
		PreparedStatement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		Admin returnAdmin = new Admin();
		try {
			//获取链接
		    conn = DBHelper.getConnection();
		    logger.info("===>>>>>====" + admin);
			String sql = "select * from admin "
					+ "where name='" + admin.getName() + "' and password='" + admin.getPassword() + "'";
			//得到运行环境，并且执行sql
			stmt = conn.prepareStatement(sql);
	        //获得结果
			rs = stmt.executeQuery();
			//处理结果
			while(rs.next()) {
				returnAdmin.setId(rs.getInt("id"));
				returnAdmin.setName(rs.getString("name"));
				returnAdmin.setPassword(rs.getString("password"));
				returnAdmin.setRole(rs.getString("role"));
			}
			logger.info("===<<<<<=====" + returnAdmin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			//释放数据集对象
			if(rs != null){
				try {
					rs.close();
					rs = null;
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
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
		return returnAdmin;
	}
}
