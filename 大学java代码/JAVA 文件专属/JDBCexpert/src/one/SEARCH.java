package one;
import java.sql.*;

import com.mysql.jdbc.PreparedStatement;
public class SEARCH {
	static Connection con;
	static java.sql.PreparedStatement sql;
	static ResultSet res;
     public Connection getConnection() {
    	 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 try {
			con =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jhdatabase","root","000000");
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return con;
     }
	public static void main(String[] args) {
		SEARCH c = new SEARCH();//建立一个实例
		con = c.getConnection(); //与数据库建立连接
		try {
			sql = con.prepareStatement("select * from tb_stu");
			res = sql.executeQuery();
			System.out.println("执行增加、修改、删除前数据库");
		} catch (SQLException e) {
			// TODO Auto-generated catch block  
			e.printStackTrace();
		}//实例化Statement对象
		try {
			res = sql.executeQuery("select * from tb_stu");
			while(res.next()) {
				String id =res.getString("id");//获取表里面的字段值
				String name = res.getString("name");
				String sex = res.getString("sex");
				String birthday = res.getString("birthday");
				System.out.println("编号:"+id);
				System.out.println("姓名:"+name);
				System.out.println("性别:"+sex);
				System.out.println("生日:"+birthday);
			}
			sql = con.prepareStatement("insert into tb_stu values(?,?,?,?)");
			sql.setString(1, "6");
			sql.setString(2, "张一");
			sql.setString(3, "女");
			sql.setString(4, "2012-12-1");
			sql.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
