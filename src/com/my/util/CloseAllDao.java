package com.my.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseAllDao {
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement prepStmt = null;
	ResultSet rs = null;
	
	public static void close(Statement stmt, PreparedStatement prepStmt, ResultSet rs) {
		
		//释放数据集对象
		if(rs != null){
			try {
				rs.close();
				rs = null;
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		if(stmt != null){
			try {
				stmt.close();
				stmt = null;
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		if(prepStmt != null){
			try {
				prepStmt.close();
				prepStmt = null;
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
	}
}
