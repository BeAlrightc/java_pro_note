package cn.xmcu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public final class DBHelper {
    private static DataSource dataSource;
    
    static{
          Context ctx;
    try {
        ctx = new InitialContext();
		//通过 JNDI 访问指定的数据源
		dataSource = (DataSource)ctx.lookup("java:comp/env/jdbc/jhdatabase");
      } catch (NamingException e) {
           e.printStackTrace();
     }
}
    
public static Connection getConnection() throws SQLException {
     return dataSource.getConnection();
}

public static void close(Connection conn, Statement stmt, ResultSet rs)
          throws SQLException {
    try {
         if(null!=rs){
               rs.close();
         }
   }finally{
         try{
             if(null!=stmt){
                   stmt.close();
             }
       }finally{
              if(conn != null){
                  conn.close();
              }
       }
   }
 }
}
