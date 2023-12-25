package cn.xn.cu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/jdbcServlet")
public class jdbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public jdbcServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int age= Integer.parseInt(request.getParameter("age"));
	    Connection conn = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    
	    try {
			conn =DBHelper.getConnection();
			String sqlStr="select id,username,age from user where age>?";
			stmt =conn.prepareStatement(sqlStr);
			stmt.setInt(1, age);
			rs = stmt.executeQuery();
			show(response,rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				DBHelper.close(conn, stmt, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}											
		}
	
	}

	private void show(HttpServletResponse response,ResultSet rs) throws SQLException,
	IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		while(rs.next()) {
			out.println(rs.getString(2)+"\t"+rs.getByte("age")+"<br/>");
		}
	}

}
