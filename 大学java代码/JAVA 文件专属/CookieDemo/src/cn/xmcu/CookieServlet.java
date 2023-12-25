package cn.xmcu;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






@WebServlet(value={"/cookie","/index.html"})
public class CookieServlet extends HttpServlet {
	private final String USERNAME ="username";
	private static final long serialVersionUID = 1L;
       
    
    public CookieServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>登录</title></head><body>");
		out.println("<form action=\"cookie\"method=\"post\">");
		out.println("<p>用户<input type=\"text\"name=\"username\" "
		+"value=\"\"/></p>");
		out.println("<p>密码<input type=\"password\"name=\"password\" "
		+"value=\"\"/></p>");
		out.println("<input type=\"hidden\" name=\"action\" "
		+"value=\"login\"/>");
		out.println("<p><input type=\"submit\"value=\"提交\"/></p>");
		out.println("</form>");
		out.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getParameter("action");
		
		if(action.equals("login")) {
			login(request,response);
		}else {
			outResult(request,response.getWriter());
		}
	}
	
	/**
	 * 获取从浏览器发送的Cookie
	 *
	 * 
	 * 
	 * 
	 */
	private String getCookie(HttpServletRequest request)throws UnsupportedEncodingException{
		Cookie[]cookies = request.getCookies();
		String username="";
		if(cookies != null) {
			for(Cookie cookie: cookies) {
				if(cookie.getName().equals(USERNAME)) {
					//处理中文
				 username = URLDecoder.decode(cookie.getValue(), "UTF-8");
				}
			}
			
		}
		return username;
	}
	
	/**
	 * 创建Cookies,将其写入浏览器
	 * 
	 *
	 * 
	 * 
	 */
	private void setCookie(String username,HttpServletResponse response)throws
	UnsupportedEncodingException{
		username=URLEncoder.encode(username, "UTF-8");//转码中文 %xx
		Cookie cokUsername = new Cookie(USERNAME,username);
		cokUsername.setMaxAge(60 * 2);//设置Cookies在客户端存活2分钟
		response.addCookie(cokUsername);
	}
	/**
	 * 验证用户名，密码
	 * 
	 *
	 * 
	 * 
	 */
	
	private void login(HttpServletRequest request,HttpServletResponse response) throws
	ServletException,IOException{
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		out.println("<html><head><title>问卷</title></head><body>");
		if(!username.isEmpty() && !password.isEmpty()) {
			//创建Cookie,将其写入客户端
			setCookie(username,response);
			//输出问卷
			outPaper(username,out);
		}else {
			out.println("<h4>用户名或密码错误！</h4>");
		}
		out.println("</body></html>");
	}
	/**
	 * 输出问卷
	 * @param username
	 * @param out
	 */
	private void outPaper(String username,PrintWriter out) {
		out.println("<h4>"+username+",请选择你喜欢的城市：</h4>");
		out.println("<form action=\"cookie\"method=\"post\">");
		out.println("<p><input type=\"checkbox\"name=\"city\" "
				+ "value=\"福州\"/>福州</p>");
		out.println("<p><input type=\"checkbox\"name=\"city\" "
				+ "value=\"厦门\"/>厦门</p>");
		out.println("<p><input type=\"checkbox\"name=\"city\" "
				+ "value=\"漳州\"/>漳州</p>");
		out.println("<input type=\"hidden\" name=\"action\""
				+"value=\"question\"/>");
		out.println("<p><input type=\"submit\"value=\"提交\"/></p>");
		out.println("</form>");
	}
	private void outResult(HttpServletRequest request,PrintWriter out) throws 
	UnsupportedEncodingException{
		String[] cities = request.getParameterValues("city");
		//获取cookie
		String username = getCookie(request);		
		out.println("<html><head><title>问卷结果</title></head><body>");
		out.println("<h4>"+username+",你选择的城市：</h4>");
		for(String str:cities) {
			out.println(str);
			
		}
		out.println("</body></html>");
	}
	

}
