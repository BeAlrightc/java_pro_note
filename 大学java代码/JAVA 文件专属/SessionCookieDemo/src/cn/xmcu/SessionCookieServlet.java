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
import javax.servlet.http.HttpSession;

/**
 * 在登录状态下进行问卷作答，向浏览器输出用户的选择。
 *    1）登陆成功后才能获取问卷
 *    2）登录成功后才能作答问卷
 * @author CHUAN GE PALY
 *
 */
//这个Servlet有三种不同url资源
@WebServlet(urlPatterns={"/login.html","/question.html","/logout.html"})
public class SessionCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String USERNAME ="username";
       
    
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
			if(isLogined(request)) {
				String username = (String)request.getSession(false).getAttribute(USERNAME);
				//输出问卷
				outPaper(username,response.getWriter());
			}else {
				//输出登录表单
				outLoginForm(request,response);
			}
		}else if(servletPath.equals("/logout.html")) {
			HttpSession session = request.getSession();//获取session对象
			session.invalidate();//消灭HtttpSession就是注销登录结束会话
			//跳转至index.html表单登录页面
			response.sendRedirect(request.getContextPath()+"/index.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String servletPath = request.getServletPath();
		
		if(servletPath.equals("/login.html")) {
			//验证用户名，密码
			login(request,response);
		}else if(servletPath.equals("/question.html")) {
			if(isLogined(request)) {
				//输出问卷作答结果
				outResult(request,response);
			}else {
				//提交问卷是，Session失效
				response.sendRedirect("login.html");
			}
		}
	}
	/**
	 * 输出登录表单
	 * 1）获取cookie的值自动填充到表单文本框
	 * 2)登录失败显示提示信息
	 * @param request
	 * @param response
	 * @param username
	 * @throws IOException
	 * 
	 */
	private void outLoginForm(HttpServletRequest request,HttpServletResponse response)throws
	IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out =response.getWriter();
		out.println("<html><head><title>登录</title></head><body>");
		out.println("<form action=\"login.html\"method=\"post\">");//url为登录
		if(request.getParameter("status")!=null) {
			out.println("<p>用户名或密码错误</p>");
		}
		out.println("<p>用户<input type=\"text\"name=\"username\" "
		+"value=\""+ getCookie(request)+"\"/></p>");
		out.println("<p>密码<input type=\"password\"name=\"password\" "
				+"value=\"\"/></p>");
		out.println("<input type=\"hidden\" name=\"action\" "
				+"value=\"login \"/>");
		out.println("<p><input type=\"submit\"value=\"提交\"</p>");
		out.println("</form>");
		out.println("</body></html>");
		
	}
	/**
	 * 输出问卷
	 * @param username
	 * @param out
	 * @throws IOException
	 */
	private void outPaper(String username,PrintWriter out)throws IOException{
		out.println("<html><head><title>问卷</title></head><body>");
		out.println("<h4>"+username+",请选择你喜欢的城市：</h4>");
		out.println("<form action=\"question.html\"method=\"post\">");//url为问卷
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
		out.println("</body></html>");
	}
	/**
	 * 输出问卷作答结果
	 */
	private void outResult(HttpServletRequest request,HttpServletResponse response)throws
	IOException,ServletException{
		clearBuffer(response);
		PrintWriter out = response.getWriter();
		String[] cities = request.getParameterValues("city");//将获取到打钩的城市的值加入数组当中
		if(cities == null) {
			cities = new String[] {"无!"};
			
		}
		String username = (String)request.getSession().getAttribute(USERNAME);
		out.println("<html><head><title>问卷结果</title></head><body>");
		out.print("<h4>"+username+",你选择的城市:</h4>");
		for(String str : cities) {
			out.println(str);
		}
		out.println("<p><a href=\"logout.html\">退出登录</a></p>");
		out.println("</body></html>");
	}
	/**
	 * 验证用户名，密码
	 * @param request
	 * @param response
	 * @param IOException
	 * @param ServletException
	 */
	private void login(HttpServletRequest request,HttpServletResponse response)throws
	IOException,ServletException{
		String username = request.getParameter("username");//获取username
		String password = request.getParameter("password");//获取password
		
		if(!username.isEmpty() && password.equals("000000") ) {//用于判断密码是否符合条件
			//创建HttpSession
			HttpSession session = request.getSession();//建立一个session对象
			//将username与HttpSession绑定
			session.setAttribute(USERNAME, username);
			//输出问卷，GET登录，重定向至问卷表单页面
			response.sendRedirect("question.html");
		}else {//当匹配不正确的时候
			this.setCookie(username,response);
			response.sendRedirect("login.html?status=false");//密码不正确所用
		}
	}
	/**
	 * 判断是否登录,其实也是判断里面的sessionID是否与服务器的一致
	 * @param request
	 * @return
	 */
	private boolean isLogined(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		return session == null ? false : true;
		/**
		 * 在JavaWeb项目中，request.getSession()一般是被用来存储当前用户对象到session中，或者从session中获取当前用户对象。 
分为无参和有参两种写法： 
1. 无参： request.getSession() 

    从当前request中获取session，如果获取不到session，则会自动创建一个session，并返回新创建的session；如果获取到，则返回获取到的session; 


2. 有参： request.getSession(boolean var1) 

    2.1  request.getSession(true) 
           这种方式和无参时一样，只是增家了一个true参数，明确告诉它在获取不到的时候自动创建session; 
    2.2. request.getSession(false) 
           这种方式与上两种的区别，就是在获取不到session的时候，不会自动创建session，而是会返回null。

各方式的应用场景：

    如果想要存储信息到session中时，使用request.getSession()， 
如果想要获取session中的信息时，使用request.getsession(false)，并在获取后对session变量进行是否为null的判断，再进行下一步操作。
 
————————————————
版权声明：本文为CSDN博主「dev_hui」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/HSH205572/article/details/83896989
		 */
	}
	
	/**
	 * 获取从浏览器发送的Cookie
	 */
	@SuppressWarnings("unused")
	private String getCookie(HttpServletRequest request)throws UnsupportedEncodingException{
		Cookie[] cookies = request.getCookies();
		String username="";
		if(cookies != null) {
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals(USERNAME)) {
					//处理中文
					username = URLDecoder.decode(cookie.getValue(),"UTF-8");
				}
			}
		}
		return username;
	}
	/**
	 * 创建Cookie,将用户名写入浏览端
	 * 
	 */
	private void setCookie(String username,HttpServletResponse response) throws
	UnsupportedEncodingException{
		username = URLEncoder.encode(username,"UTF-8");//转码中文 %xx
		Cookie cokUsername = new Cookie(USERNAME,username);
		//cokUsername.setMaxAge(60*2)//设置Cookie在客户端存活两分钟
		response.addCookie(cokUsername);//发送给客户端
	}
	/**
	 * 不缓存页面
	 * @param response
	 */
	private void clearBuffer(HttpServletResponse response) {
		//将过期日期设置为一个过期的时间
		response.setHeader("Expires", "Sat,6 May 1995 12:00:00 GMT");
		//设置Http/1.1 no-cache头
		response.setHeader("Cache-Control", "no-store,no-cache,must-revalidate");
		//设置IE扩展Http/1.1no-cache headers, 用户自己添加
		response.addHeader("Cache-Control", "post-check=0,pre-check=0");
		//设置标准 Http/1.0 no-Cache header
		response.setHeader("Pragma", "No-cache");
	}

}
