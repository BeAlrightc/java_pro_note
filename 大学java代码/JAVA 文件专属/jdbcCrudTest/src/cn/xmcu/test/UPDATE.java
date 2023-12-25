package cn.xmcu.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class UPDATE {

	@Test
	/*
	 * 更新数据
	 */
    
   public void update() throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelper.getConnection("jdbc:mysql://localhost:3306/JHDatabase","root","000000");
			stmt = conn.createStatement();
			String sql = "update user set phone = '1210' where id = 1002";
			stmt.executeUpdate(sql);
		} finally {
			DBHelper.close(conn, stmt, rs);
		}
	}
}
