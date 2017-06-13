package com.my.domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.my.domain.model.Teacher;
import com.my.util.DBHelper;
import com.my.util.ModelConvert;

public class TeacherDao {
	
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
	
/*	public List teachPage() {
		try {
			//获取链接
		    conn = DBHelper.getConnection();
			String sql = "select * from teacher";
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
	}*/
	
	public ArrayList<Teacher> teachPage() {
		ArrayList<Teacher> list = new ArrayList<Teacher>(); 
		try {
			//获取链接
		    conn = DBHelper.getConnection();
			String sql = "select * from teacher";
			//得到运行环境，并且执行sql
			prepStmt = conn.prepareStatement(sql);
	        //获得结果
			rs  = prepStmt.executeQuery();
			//处理结果
			while(rs.next()) {
				Teacher returnTeach = new Teacher();
				returnTeach.setId(rs.getInt("id"));
				returnTeach.setName(rs.getString("name"));
				returnTeach.setPassword(rs.getString("password"));
				returnTeach.setTeachCourse(rs.getString("teachCourse"));
				returnTeach.setIsTutor(rs.getBoolean("isTutor"));
				returnTeach.setLeadClassId(rs.getInt("leadClassId"));
				list.add(returnTeach);
			}
			logger.info("===<<<<<=====" + list);
			
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
			if(prepStmt != null){
				try {
					prepStmt.close();
					prepStmt = null;
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
		
		return list;
	}
	
	public Teacher teachDetail(String teacherId) {
		Teacher returnTeach = new Teacher();
		try {
			//获取链接
		    conn = DBHelper.getConnection();
		    logger.info("===>>>>>====" + teacherId);
			String sql = "select * from teacher where"
		    + " id=" + teacherId;
			//得到运行环境，并且执行sql
			prepStmt = conn.prepareStatement(sql);
	        //获得结果
			rs  = prepStmt.executeQuery();
			//处理结果
			while(rs.next()) {
				returnTeach.setId(rs.getInt("id"));
				returnTeach.setName(rs.getString("name"));
				returnTeach.setPassword(rs.getString("password"));
			}
			logger.info("===<<<<<=====" + rs);
			
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
			if(prepStmt != null){
				try {
					prepStmt.close();
					prepStmt = null;
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}

		return returnTeach;
	}
	
	public void modifyTeach(Teacher teacher) {
		try {
			//获取链接
		    conn = DBHelper.getConnection();
		    logger.info("===>>>>>====" + teacher);
			String sql = "update table teacher "
		    + "set name='" + teacher.getName() + "', password='" + teacher.getPassword() + "' where id=" + teacher.getId();
			//得到运行环境，并且执行sql
			stmt = conn.createStatement();
	        //获得结果
			int re  = stmt.executeUpdate(sql);
			if(re > 0) 
				logger.info("===<<<<<=====" + 1);
			else 
				logger.info("===<<<<<=====" + 0);
			
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
