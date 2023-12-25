package ysqljava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	public void insert()throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBHelper.getConnection("jdbc:mysql:/localhost:3306/JHDatabase", "root", "000000");
			stmt = conn.createStatement();
			String sql="insert into user(usernmae,password,sex,age,"+""
			+"birthday,addr,email,phone)values("+
			"'陈晓','1234456','女','19','2009-10-15',"+
			"'福建省厦门市思明区故宫路11号202',"+
			"'cheng@tomgkcnd','1387799767')";
			stmt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
			rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				int key = rs.getInt(1);
				System.out.println("key:"+key);
			}
		} finally {
			DBHelper.close(conn,stmt,rs);
		}
		
	}
	
	public void update()throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			conn = DBHelper.getConnection("jdbc:mysql://localhost:3306/JHDatabase", "root", "errt");
			stmt = conn.createStatement();
			String sql = "update user set phone='1354323' where id = 1003";
			stmt.executeUpdate(sql);
		} finally {
			DBHelper.close(conn, stmt, rs);
		}
		
		
	}
	public void delete() throws SQLException{
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs =null;
		
		try {
			conn = DBHelper.getConnection("jdbc:mysql://localhost:3306/JHDatabase", "root", "000000");
			stmt = conn.createStatement();
			String sql = "delete from user where id = 1003";
			stmt.executeUpdate(sql);
		} finally {
			DBHelper.close(conn, stmt, rs);
		}
	}
   public void insertimprove() throws SQLException{
	   Connection conn = null;
	   PreparedStatement stmt = null;
	   ResultSet rs = null;
	   
	   try {
		conn = DBHelper.getConnection("jbdc:mysql://localhost:3306/JDatabase", "root", "00000");
		String sql = "insert into user(username,password,sex,age,"
				+ "birthday,addr,email,phone)values(?,?,?,?,?,?,?,?)";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, "陈小飞");
		stmt.setString(2, "123456");
		stmt.setString(3, "女");
		stmt.setByte(4, (byte) 19);
		stmt.setDate(5, java.sql.Date.valueOf("2009-10-15"));
		stmt.setString(6, "福建省厦门市思明区故宫路11号202");
		stmt.setString(7, "cheng@tom.com");
		stmt.setString(8, "13840186723");
		stmt.executeUpdate();
	} finally {
		DBHelper.close(conn, stmt, rs);
	}
	   
   }
   public void updateImprove() throws SQLException{
	   Connection conn = null;
	   PreparedStatement stmt = null;
	   ResultSet rs = null;
	   try {
		conn = DBHelper.getConnection("jbdc:mysql://localhost:3306/JHDatabase", "root", "00000");
		String sql = "update user set password ='000000'";
		stmt = conn.prepareStatement(sql);
		int rows = stmt.executeUpdate();
		System.out.println("受影响的行数：" + rows);
	} finally {
		DBHelper.close(conn, stmt, rs);
	}
   }
   
   public void deleteImprove() throws SQLException{
	   Connection conn = null;
	   PreparedStatement stmt = null;
	   ResultSet rs = null;
	   
	   try {
		conn = DBHelper.getConnection("jdbc:mysql://localhost:3306/JHDatabase", "root", "000000");
		String sql = "delete from user where id = 1004";
		stmt = conn.prepareStatement(sql);
		stmt.executeUpdate();
	} finally {
		DBHelper.close(conn, stmt, rs);
	}
   }
}
