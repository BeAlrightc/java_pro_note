/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-12-12 15:24:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.xmcu.domain.User;
import java.util.List;
import cn.xmcu.utils.Constants;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("cn.xmcu.utils.Constants");
    _jspx_imports_classes.add("cn.xmcu.domain.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	User $user = (User)session.getAttribute(Constants.USER);
	List<User> userList = (List<User>)request.getAttribute(Constants.USER_LIST);

      out.write("\r\n");
      out.write("<!DOCTYPE html> \r\n");
      out.write("<html> \r\n");
      out.write("<head> \r\n");
      out.write("<meta charset=\"UTF-8\"> \r\n");
      out.write("<title>浏览数据</title> \r\n");
      out.write("<style>\r\n");
      out.write("*{margin:0; padding:0;}\r\n");
      out.write("h4{width:200px; margin: 0 auto; margin-top:10px;}\r\n");
      out.write("h4 a{margin-left: 50px;}\r\n");
      out.write("div{margin: 0 auto; width:80%;   margin-top: 30px;}\r\n");
      out.write("table{width:80%; border:1px solid #ccc; border-collapse: collapse; margin:0 auto;}\r\n");
      out.write("table{margin-top:20px;}\r\n");
      out.write("table td,table th{border:1px solid #ccc; height: 40px; text-align:center; vertical-align:middle;}\r\n");
      out.write("table input[type=\"text\"]{border-width: 0; text-align:center; font-size:14px; padding:5px; width:100px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head> \r\n");
      out.write("<body> \r\n");
      out.write("<h4>欢迎");
      out.print($user.getUsername());
      out.write("<a href=\"logout.html\">退出</a></h4>\r\n");
      out.write(" <table>\r\n");
      out.write("	<thead>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>ID</th>\r\n");
      out.write("			<th>姓名</th>\r\n");
      out.write("			<th>性别</th>\r\n");
      out.write("			<th>年龄</th>			\r\n");
      out.write("			<th>出生日期</th>\r\n");
      out.write("			<th>email</th>\r\n");
      out.write("			<th>phone</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</thead>\r\n");
      out.write("	<tbody>\r\n");
      out.write("		");
 for(User user : userList) {
      out.write("\r\n");
      out.write("			<tr>				\r\n");
      out.write("					<td>");
      out.print(user.getId() );
      out.write("</td>\r\n");
      out.write("					<td><input type=\"text\" name=\"username\" value=\"");
      out.print(user.getUsername() );
      out.write("\"/></td>\r\n");
      out.write("					<td><input type=\"text\" name=\"sex\" value=\"");
      out.print(user.getSex() );
      out.write("\"/></td>\r\n");
      out.write("					<td><input type=\"text\" name=\"age\" value=\"");
      out.print(user.getAge() );
      out.write("\"/></td>\r\n");
      out.write("					<td><input type=\"text\" name=\"birthday\" value=\"");
      out.print(user.getBirthday() );
      out.write("\"/></td>\r\n");
      out.write("					<td><input type=\"text\" name=\"email\" value=\"");
      out.print(user.getEmail() );
      out.write("\"/></td>\r\n");
      out.write("					<td><input type=\"text\" name=\"phone\" value=\"");
      out.print(user.getPhone() );
      out.write("\"/></td>\r\n");
      out.write("			</tr>			\r\n");
      out.write("		");
} 
      out.write("\r\n");
      out.write("	</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body> \r\n");
      out.write("</html> ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
