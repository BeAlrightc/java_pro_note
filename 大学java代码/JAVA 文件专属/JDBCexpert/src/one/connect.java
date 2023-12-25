package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
     Connection conn;
     public Connection getConnection() {
    	 try {
			Class.forName("com.mysql.jdbc.Driver");//加载驱动
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms",
					 "root","000000");
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return conn;
     }
	public static void main(String[] args) {
		connect c = new connect();
		c.getConnection();
		

	}

}
