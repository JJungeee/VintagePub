package com.java.bean;

import java.sql.*;

public class JDBCutil {
	final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	//final static String JDBC_URL = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=utf-8";
	final static String JDBC_URL = "jdbc:mysqldb.cdig4akeqj9g.ap-northeast-2.rds.amazonaws.com=true&useUnicode=true&characterEncoding=utf-8";
	final static String DBUSER = "admin";
	final static String DBPASS = "admin123";
	
	public static Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			return DriverManager.getConnection(JDBC_URL, DBUSER, DBPASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void close(PreparedStatement pstmt, Connection conn) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
	}
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
	}
	public static void close(ResultSet rs, PreparedStatement pstmt) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
	}
}
