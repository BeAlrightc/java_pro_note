package cn.xmuc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertda {
	String url = "jdbc:mysql://localhost:3306/jhdatabase";
	String user = "root";
	String pwd ="000000";
	/**
	 * 插入数据
	 * @param args
	 */
	public void insert() throws SQLException{
		Connection conn= null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelp.getConnection(url, user, pwd);
			System.out.println("数据库连接成功");
			String sql = "insert into class01(id,name,deptcode,class)values(?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1,003);
			stmt.setString(2, "张飞");
			stmt.setString(3, "电子与信息");
			stmt.setString(4, "云计算20B");
			stmt.executeUpdate();
		} finally {
			DBHelp.close(conn, stmt, rs);
		}
	}
	public void select() throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelp.getConnection(url, user, pwd);
			System.out.println("数据库连接成功");
			stmt = conn.createStatement();
			String sql = "select * from class01";
			rs =stmt.executeQuery(sql);//用于执行该语句返回结果集
			while(rs.next()) {
				String id = rs.getString("id");//获取该表的字段值
				String name = rs.getString("name");
				String deptcode =rs.getString("deptcode");
				String classe = rs.getString("class");
				System.out.println("编号："+id);
				System.out.println("名字："+name);
				System.out.println("部门："+deptcode);
				System.out.println("班级："+classe);
			}
		} finally {
			DBHelp.close(conn, stmt, rs);
		}
		
	}
	public void update()throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBHelp.getConnection(url, user, pwd);
			System.out.println("数据库连接成功" + "\n");
			stmt = conn.createStatement();
			String sql = "update class01 set class= '云计算20D' where id = '002'";
			stmt.executeUpdate(sql);
			System.out.println("更新成功");
		} finally {
			DBHelp.close(conn, stmt, rs);
		}
		
	}
	public void delete()throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		conn = DBHelp.getConnection(url, user, pwd);
		stmt = conn.createStatement();
		String sql ="delete from class01 where id =003";
		stmt.executeUpdate(sql);
	}

	public static void main(String[] args) throws SQLException {
		Insertda c = new Insertda();
		//c.insert();//执行插入数据操作
		//c.select();//执行查询操作
		//c.update();
		c.delete();//用于删除操作

	}

}
