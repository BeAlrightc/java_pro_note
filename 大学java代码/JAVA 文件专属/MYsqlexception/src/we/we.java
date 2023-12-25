package we;
import java.sql.*;

public class we {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url ="jdbc://mysql://localhost:3306/user";
			String username = "root";
			String password = "000000";
			conn = DriverManager.getConnection(url,username,password);
			if(conn !=null) {
				System.out.println("连接数据库成功！");
			}
			else {
				System.out.println("连接数据库失败！");
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
