package one;
import java.sql.*;
public class PrepareStatwment {
	static Connection con;
	static PreparedStatement sql;
	static ResultSet rs;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","000000");
			System.out.println("数据库连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	

	public static void main(String[] args) {
		PrepareStatwment  c = new PrepareStatwment();
		c.getConnection();
		try {//查询操作
			sql = con.prepareStatement("select * from tb_stu where id =?");
			sql.setInt(1, 19);
			rs = sql.executeQuery();
			//插入操作
			sql = con.prepareStatement("insert into tb_stu values(?,?,?)");
			sql.setString(1, "张怡");
			sql.setString(2, "女");
			sql.setString(1, "2009-01-04");
			sql.executeQuery();
			//更新操作
			sql = con.prepareStatement("update tb_stu set birthday=?"
					+ "where id =(select min(id) from tb_stu)");
			sql.setString(1, "2012-01-01");
			sql.executeQuery();
			//删除操作
			sql = con.prepareStatement("delete tb_stu where id=?"
					+ "where id =(select min(id) from tb_stu)");
			sql.executeQuery();
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
