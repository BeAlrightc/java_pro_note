package one;
/*
 * 此类用于查询数据库中的表信息
 */
import java.sql.*;
public class SSD {
	static Connection conn;//声明Connection对象
	static Statement sql;//声明Statement对象
	static ResultSet rs;//声明ResultSet对象
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//加载驱动包
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {//通过访问数据库的URL，获取数据库的连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost/jhdatabase","root","000000");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	

	public static void main(String[] args) {
		SSD c = new SSD();//建立一个对象
		c.getConnection();//连接
		try {
			sql =conn.createStatement();//实例化Statement对象
			rs = sql.executeQuery("select * from tb_stu");//sql语句
			while(rs.next()) {
				String id = rs.getString("id");//获取字段值
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String birthday = rs.getString("birthday");
				System.out.println("编号："+id);//输出字段值
				System.out.println("姓名："+name);
				System.out.println("性别："+sex);
				System.out.println("生日："+birthday);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
