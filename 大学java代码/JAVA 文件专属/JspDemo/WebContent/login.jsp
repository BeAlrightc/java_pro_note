<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="cn.xmcu.dao.UserDao" %>
<%@page import="cn.xmcu.domain.User" %>
<%
  request.setCharacterEncoding("utf-8");
  String username = request.getParameter("username");
  String password = request.getParameter("password");
  if(username != null && password!=null){
        User user = UserDao.login(username,  password);
        if(user != null){
			pageContext.setAttribute("logined", true) ;
			session.setAttribute("user", user);
			response.sendRedirect("list.jsp");
			return;
      }else{
          pageContext.setAttribute("logined", false) ;
          pageContext.setAttribute("username", username);
      }
   }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
<style>
    h4{color:red;}
</style>
</head>
<body>
<%
	Object oLogined = pageContext.getAttribute("logined");
	if(oLogined != null && !(Boolean)oLogined){
	     out.print("<h4>用户名或密码错误!</h4>");
	}
	String $username = "";
	Object oUsername = pageContext.getAttribute("username");
	if(oUsername != null){
	     $username = (String)oUsername;
	}
%>

<form action="login.jsp" method="post">
	<p>用户<input type="text" name="username" value="<%=$username%>"/></p>
	<p>密码<input type="text" name="password" value=""/></p>
	<p><input type="submit" value="提交"/></p>
</form>
</body>
</html>