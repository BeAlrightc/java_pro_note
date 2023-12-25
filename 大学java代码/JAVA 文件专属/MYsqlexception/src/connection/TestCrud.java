package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestCrud {

		public void updateImprove() throws SQLException {
			 Connection conn = null;
			 PreparedStatement stmt = null;
			 ResultSet rs = null;
			 try {
				conn = DBHelper.getConnection("jdbc:mysql://localhost:3306/jhdatabase", "root", "000000");
				String sql = "delete from user where id =1001";
				stmt = conn.prepareStatement(sql);
			} finally {
				System.out.println("finally:");
				DBHelper.close(conn, stmt, rs);
			}
		     
		}
}
