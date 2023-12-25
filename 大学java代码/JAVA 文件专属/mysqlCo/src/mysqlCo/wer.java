package mysqlCo;
import java.sql.*;
public class wer {
   static Connection con;
   static Statement sql;
   static ResultSet res;
    public Connection getConnection() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");System.out.println("数据库加载成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			con = DriverManager.getConnection("jdbc:mysql:"+
			"//localhost:3306/jhdatabase","root","000000");
			System.out.println("数据库加载成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
    	
    }
public static void main(String[] args) {
		wer c = new wer();
		con = c.getConnection();
		try {
			sql = con.createStatement();
			res  = sql.executeQuery("select * from tb_stu ");
			while (res.next()) {
				String id = res.getString(1);
				String name = res.getString("name");
				String sex = res.getString("sex");
				String birthday = res.getString("birthday");
				
				System.out.println("编号："+id);
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
