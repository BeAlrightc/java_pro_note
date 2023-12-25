package cn.xmcu.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class TestCrud {
	/*
	 * 插入数据
	 */

	@Test
	public void insert() throws SQLException {
		Connection conn = null; 
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
//			conn = DBHelper.getConnection("jdbc:mysql://localhost:3306/JHDatabase", "root", "000000");
//			stmt = conn.createStatement();
//			String sql = "insert into user(username,password,sex,age," + "" + "birthday,addr,email,phone)values("
//					+ "'陈yi','123456','女','19','2009-10-05'," + "'福建省厦门市思明区故宫路11号202',"
//					+ "'cheng@tom.com','12840186723')";
//			//JDBC 3.0API 设置返回值的key
//			stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
//			rs.getStatement().getGeneratedKeys();
//			if (rs.next()) {
//				int key = rs.getInt(1);
//				System.out.println("key:" + key);
//			} 
			conn = DBHelper.getConnection("jdbc:mysql://localhost:3306/JHDatabase", "root", "000000");
			
			String sql = "insert into user(username,password,sex,age,birthday,addr,email,phone)"
					+ "values(?,?,?,?,?,?,?,?)";
			//设置IN参数值
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "陈晓");
			stmt.setString(2, "123456");
			stmt.setString(3, "女");
			stmt.setByte(4, (byte)19);
			stmt.setDate(5, java.sql.Date.valueOf("2009-10-05"));
			stmt.setString(6, "福建省厦门市思明区故宫路11号202");
			stmt.setString(7, "cheng@tom.com");
			stmt.setString(8, "120");
			stmt.executeUpdate();
		} finally {
			DBHelper.close(conn, stmt, rs);
		}
				
	}


	
	
	

}
