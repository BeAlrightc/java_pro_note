package cn.xn.cu;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public final class DBHelper {
	private static DataSource dataSource;
	private static final ThreadLocal<Connection> connection= new ThreadLocal<Connection>();
	static {
		Context ctx;
		try {
			ctx = new InitialContext();
			//通过JNDI访问指定的数据源
			dataSource = (DataSource)ctx.lookup("java:comp/env/jdbc/jhdatabase");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection conn = (Connection)connection.get();
		try {
			if(conn == null || conn.isClosed()) {
				conn = dataSource.getConnection();
				connection.set(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn,Statement stmt,ResultSet rs)
	     throws SQLException{
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
				Connection con =(Connection)connection.get();
				connection.set(null);
				if(con !=null) {
				con.close();//此操作是将连接交回连接池，而不是关闭它
				}
			}
		}
	}
}

