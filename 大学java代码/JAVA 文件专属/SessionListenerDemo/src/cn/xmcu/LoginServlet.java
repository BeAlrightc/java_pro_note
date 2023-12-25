package cn.xmcu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(value= {"/login","/welcome","/logout"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private static Map<String,String>users = new HashMap<String,String>();
    
    static {
    	users.put("zhang", "000000");
    	users.put("wang", "000000");
    	users.put("li", "000000");
    }
    public LoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getServletPath().equals("/logout")) {
			request.getSession().invalidate();//销毁对象
		}
		welcome(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String page ="login.html";
		if(users.containsKey(username)&& users.get(username).equals(password)) {//进行匹配密码操作
			request.getSession().setAttribute("user", username);//匹配成功时，建立一个session对象，并将用户名与Sessionid绑定
			page = "welcome";
		}
		response.sendRedirect(page);
	}
	
	private void welcome(HttpServletRequest request,HttpServletResponse response) throws
	IOException{
		         response.setContentType("text/html;charset=utf-8");
		         PrintWriter out = response.getWriter();
		         out.println("<html><head><body>");
		         HttpSession session = request.getSession(false);
		         out.println("<h4>目前在线人数："+
		                   SessionListener.getCounter() +"</h4/>");
		         if(session !=null) {//如果session对象不为空时
		        	 out.println("<h4>欢迎："+
		                        session.getAttribute("user")+"</h4>");
		        	 out.println("<a href='logout'>退出</a>");
		         }else {//对象为空时
		        	 out.println("<a href='login.html'>登录</a>");
		         }
		         out.println("</html></head></body>");
		         		         
	}

}
