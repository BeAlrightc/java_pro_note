package connection;
import java.sql.*;
public class jdbcexer {
     Connection conn;
     public Connection getConnection() {
    	 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 try {
			conn =DriverManager.getConnection("jbdc:mysql://localhost:3306/test","root","000000");
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return conn;
     }
	public static void main(String[] args) {
		jdbcexer c = new jdbcexer();
		c.getConnection();
		

	}

}
