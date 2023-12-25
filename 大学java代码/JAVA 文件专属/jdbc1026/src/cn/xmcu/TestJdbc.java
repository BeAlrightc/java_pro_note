package cn.xmcu;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class TestJdbc {
	/*
	 * 显示用户表user中的userid,username,birthday,email:
	 */

	@Test
	public void test() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取数据库连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JHDatabase","root","000000");
			//3.创建SQL语句
			stmt = conn.createStatement();
			//4.执行SQL语句
			rs = stmt.executeQuery("select * from user");
			//5.处理执行结果
			while(rs.next()) {
				System.out.println("id:"+rs.getInt(1)+"\tname:"+rs.getString(2)+
						"\t\t birthday:"+rs.getString(6)+
						"\temail:"+rs.getString(9));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//6.释放资源
//			if(rs !=null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(stmt !=null) {
//				try {
//					stmt.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(conn !=null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			try {
				DBHelper.close(conn, stmt, rs);//此类对上面所注释的代码进行了一个简洁处理
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
	
	


