package jdbcexperiment;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class sqlt {
	
	public void updateImprove() throws SQLException {
		
		

		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = JDBHelper.getConnecton("jdbc:mysql://localhost:3306/jhdatabase", "root", "000000");
			String sql = "insert into user(username,password,sex,age,"
					+ "birthday,addr,email,phone)values(?,?,?,?,?,?,?,?)";
			stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, "陈1");
			stmt.setString(2, "123456");
			stmt.setString(3, "女");
			stmt.setByte(4, (byte) 19);
			stmt.setDate(5, java.sql.Date.valueOf("2009-10-05"));
			stmt.setString(7, "cheng@tom.com");
			stmt.setString(8, "13840186723");
			int rows = stmt.executeUpdate();
			System.out.println("受影响的行数：" + rows);
			rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				int key = rs.getInt(1);
				System.out.println("key:" + key);
			} 
		} finally {
			JDBHelper.close(conn, stmt, rs);
		}
						
	}

		
	

}
