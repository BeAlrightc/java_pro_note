package cn.xmcu.excample;

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
import javax.servlet.http.HttpSession;

/**
 * 在登录的状态下进行问卷作答，向浏览器输出用户的选择。
 *   1)登录成功后才能获取问卷
 *   2)登录成功后才能作答问卷
 */
@WebServlet(urlPatterns={"/login.html","/question.html","/logout.html"})
public class SessionCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final String USERNAME="username";   
    
    public SessionCookieServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String servletPath = request.getServletPath();
		if(servletPath.equals("/login.html")) {
			//输出登录表单
			outLoginForm(request,response);
		}else if(servletPath.equals("/question.html")) {
			String username = (String)request.getSession(false).getAttribute(USERNAME);
			//输出问卷
			outPage(username,response.getWriter());
		}else if(servletPath.equals("/logout.html")) {//退出登录
			HttpSession session = request.getSession();//将对象获取出来
			session.invalidate();//销毁对象
			//再次重定向到登录表单页面
			response.sendRedirect(request.getContextPath()+"/index.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String servletPath = request.getServletPath();
		//判断url中的资源路径
		if(servletPath.equals("/login.html")) {
			//验证用户名，密码
			login(request,response);
		}else if(servletPath.equals("/question.html")) {
			outResult(request,response);
		}
		
	}
	/**
	 * 输出登录表单
	 *   1)获取cookie的值自动
	 *   2)登录失败显示提示信息
	 *   @param request
	 *   @param response
	 *   @param username
	 *   @param IOException
	 */
	private void outLoginForm(HttpServletRequest request,HttpServletResponse response)
			throws IOException{
		response.setContentType("text/html;charset =utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>登录</title></head><body>");
		out.println("<form action=\"login.html\" method = \"post\">");
		if(request.getParameter("status")!=null) {//判断字段值是否为空
			out.println("<p>用户名或者密码错误！</p>");
		}
		out.println("<p>用户<input type=\"text\"name=\"username\" "
				+ "value=\""+getCookie(request)+"\"/></p>");
		out.println("<p>密码<input type=\"password\"name=\"password\" "
				+ "value=\"\"/></p>");
		out.println("<input type=\"hidden\" name=\"action\" "
				+"value=\"login\"/>");
		out.println("<p><input type=\"submit\"value=\"提交\"/></p>");
		out.println("</form>");
		out.println("</body></html>");
	}
	
	/**
	 * 输出问卷
	 * @param username
	 * @param out
	 */
	private void outPage(String username,PrintWriter out) {
		out.println("<html><head><title>问卷</title></head><body>");
		out.println("<h4>"+username+",请选择你喜欢的城市：<h4>");
		out.println("<form action=\"question.html\"method=\"post\">");
		out.println("<p><input type=\"checkbox\"name=\"city\""
		+"value=\"福州\"/>福州</p>");
		out.println("<p><input type=\"checkbox\"name=\"city\""
				+"value=\"厦门\"/>厦门</p>");
		out.println("<p><input type=\"checkbox\"name=\"city\""
				+"value=\"漳州\"/>漳州</p>");
		out.println("<input type=\"hidden\" name=\"action\""
				+"value=\"question\"/>");
		out.println("<p><input type=\"submit\"value=\"提交\"/></p>");
		out.print("</form");
		out.println("</body></html>");
	}
	/**
	 * 输出问卷作答结果
	 */
	private void outResult(HttpServletRequest request,HttpServletResponse response)
			throws IOException{
		PrintWriter out =response.getWriter();
		String[] cities = request.getParameterValues("city");
		if(cities ==null) {
			cities = new String[] {"无！"};			
		}
		String username =(String)request.getSession().getAttribute(USERNAME);
		out.println("<html><head><title>问卷结果</title></head><body>");
		out.println("<h4>"+username+", 你选择的城市: </h4>");
		for(String str:cities) {
			out.println(str);
		}
		out.println("<p><a href=\"logout.html\">退出登录</a></p>");
		out.println("</body></html>");
	}
	/**
	 * 验证用户名密码
	 * @param request
	 * @param response
	 * @param IOException
	 * @throws ServletException
	 */
		private void login(HttpServletRequest request,HttpServletResponse response) throws
		IOException{
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			if(!username.isEmpty()&&password.equals("000000")) {
				//创建Session
				HttpSession session = request.getSession(); //sessionid
				//将username与HttpSession 绑定
				session.setAttribute(USERNAME, username);
				//输出问卷，GET请求
				response.sendRedirect("question.html");
			}else {
				this.setCookie(username,response);
				response.sendRedirect("login.html?status=false");
			}
		}
		/**
		 * 获取从浏览器发送的cookie
		 */
		private String getCookie(HttpServletRequest request )throws UnsupportedEncodingException{
			Cookie[] cookies = request.getCookies();
			String username = "";
			if(cookies !=null) {
				for(Cookie cookie:cookies) {
					if(cookie.getName().equals(USERNAME)) {
						//处理中文
						username= URLDecoder.decode(cookie.getValue(),"UTF-8");
					}
				}
			}
			return username;
		}
		
		/**
		 * 创建Cookie,将用户名写入浏览器端
		 */
		private void setCookie(String username,HttpServletResponse response) throws
		UnsupportedEncodingException{
			username = URLEncoder.encode(username,"UTF-8");//转码中文
			Cookie cokUsername = new Cookie(USERNAME,username);
			response.addCookie(cokUsername);
		}

}
