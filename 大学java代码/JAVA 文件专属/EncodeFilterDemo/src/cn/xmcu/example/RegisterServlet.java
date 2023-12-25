package cn.xmcu.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/register.do","/register.html"})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/html/register.html").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String encode = "utf-8";
//		request.setCharacterEncoding(encode);
//		response.setContentType("text/html;charset="+encode);
		PrintWriter out = response.getWriter();
		out.println("姓名: "+request.getParameter("username"));
		out.println("密码: "+request.getParameter("password"));
		out.println("地址: "+request.getParameter("address"));
	}

}
