package com.my.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.my.domain.model.Admin;
import com.my.util.DBHelper;

public class ConTest {
	
	private static final Logger logger = LoggerFactory.getLogger(ConTest.class);
	//查询管理员列表
	@Test
	public void allAdmin() {
		ArrayList<Admin> list = new ArrayList<Admin>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			//获取链接
		    conn = DBHelper.getConnection();
		    
			String sql = "select * from admin";
			//得到运行环境，并且执行sql
			stmt = conn.prepareStatement(sql);
	        //获得结果
			rs = stmt.executeQuery();
			//处理结果
			while(rs.next()) {
				Admin admin = new Admin();
				admin.setId(rs.getInt("id"));
				admin.setName(rs.getString("name"));
				admin.setPassword(rs.getString("password"));
				admin.setRole(rs.getString("role"));

				list.add(admin);
			}
			logger.info("==================" + list);
			/*	for(Admin admin : list) {
				System.out.println(admin.toString());
			}*/
			
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
	}
	
	
	
	//插入一条管理员记录
	@Test
	public void addAdmin() {
		
		Admin admin = new Admin();
		admin.setName("王潇洒");
		admin.setPassword("qaz123");
		admin.setRole("管理员");

		Connection conn = null;
		Statement stmt = null;
		try {
			
		    conn = DBHelper.getConnection();
			
		    String sql = "insert into admin(name, password, role) value('" 
		    + admin.getName() + "','" + admin.getPassword() + "','" + admin.getRole() + "')";
		    //得到运行环境
			stmt = conn.createStatement();
			//执行sql
			int re = stmt.executeUpdate(sql);
			if(re > 0) 
				System.out.println("操作成功");       
			else                                      
				System.out.println("操作失败"); 
			
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
	
	//更新管理员
	@Test
	public void updateAdmin() {
		Admin admin = new Admin();
		admin.setId(2);
		admin.setName("王潇洒");
		admin.setPassword("qwer1234");
		admin.setRole("管理员");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
		    conn = DBHelper.getConnection();
			
		    String sql = "update admin set name='"
		    + admin.getName() + "',password='" + admin.getPassword() + "',role='" + admin.getRole() 
		    + "'where id = " + admin.getId(); 
		    //得到运行环境
			stmt = conn.createStatement();
			//执行sql
			int re = stmt.executeUpdate(sql);
			if(re > 0) 
				System.out.println("操作成功");       
			else                                      
				System.out.println("操作失败"); 
			
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
	}
	
	
	//删除管理员
	@Test
	public void deleteAdmin() {
		Admin admin = new Admin();
		admin.setId(2);

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
		    conn = DBHelper.getConnection();
			
		    String sql = "delete from  admin where id = " + admin.getId(); 
		    //得到运行环境
			stmt = conn.createStatement();
			//执行sql
			int re = stmt.executeUpdate(sql);
			if(re > 0) 
				System.out.println("操作成功");       
			else                                      
				System.out.println("操作失败"); 
			
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
	}
	
	public static void main(String[] args) {
		
	}
}
