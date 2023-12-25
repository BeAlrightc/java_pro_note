package cn.xmuc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class DBHelp {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection(String url,String user,String pwd) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}	
	
	public static void close(Connection conn,Statement stmt,ResultSet rs) 
		throws SQLException {
		try {
			if (null != rs) {
				rs.close();
			} 
		} finally {
			try {
				if (null != stmt) {
					stmt.close();
				} 
			} finally {
				if(null != conn) {
					conn.close();
				}
			}
		}
		
	}
}
