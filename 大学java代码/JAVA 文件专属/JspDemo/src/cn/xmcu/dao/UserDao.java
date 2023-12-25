package cn.xmcu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.xmcu.domain.User;
public class UserDao {
	/**
	* 对象关系映射
	* @param rs * @return
	* @throws SQLException
	*/
public static User ormap(ResultSet rs) throws SQLException{
	Integer id = rs.getInt(1);
	String username = rs.getString(2);
	String password = rs.getString(3);
	String sex = rs.getString(4);
	byte age = rs.getByte(5);
	Date birthday = rs.getDate(6);
	boolean status = rs.getBoolean(7);
	String addr = rs.getString(8);
	String email = rs.getString(9);
	String phone =rs.getString(10);
	User user = new User(id, username, password, sex, age, birthday, status, addr, email, phone);
	return user;
}
/**
* 获取所有用户数据
* @return
*/
public static List<User> getUserList(){
	List<User> userList = new ArrayList<User>();
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
try {
		conn = DBHelper.getConnection();
		String sqlStr ="select * from user";
		stmt = conn.prepareStatement(sqlStr);
		rs = stmt.executeQuery();
		while(rs.next()){
		userList.add(ormap(rs));
		}
} catch (SQLException e) {

  e.printStackTrace();
}finally {
     try {
          DBHelper.close(conn,stmt,rs);
     } catch (SQLException e) {
          e.printStackTrace();
   }
 }
 return userList;
}
/**
* 用户账号、密码验证
* @param username * @param password
* @return
*/
public static User login(String username, String password){
	User user = null;
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
try {
	conn = DBHelper.getConnection();
	String sqlStr ="select * from user where username=? and password=?";
	stmt = conn.prepareStatement(sqlStr);
	stmt.setString(1, username);
	stmt.setString(2, password);
	rs = stmt.executeQuery();
	if(rs.next()){
      user = ormap(rs);
  }
} catch (SQLException e) {
    e.printStackTrace();
}finally {
     try {
          DBHelper.close(conn,stmt,rs);
} catch (SQLException e) {
      e.printStackTrace();
    }
  }
  return user;
 }
}
