package com.immoc.db;
import java.sql.*;


public class DButil {
	private static final String URL="jdbc:mysql://127.0.0.1:3306/imooc?useUnicode=true&characterEncoding=UTF-8"
			+ "&serverTimezone=Asia/Shanghai";
	
	private static final String USER="root";
	private static final String PASSWORD="root";
	public static void main(String[] args) throws Exception {

		
		//1:加载驱动程序
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2:获得数据库的链接
		Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
		//通过数据库的链接操纵数据库，实现增删改查
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select user_name, age from imooc_goddess");
		while(rs.next()) {
			System.out.println(rs.getString("user_name")+","+rs.getString("age"));
		}
		
	}
}
