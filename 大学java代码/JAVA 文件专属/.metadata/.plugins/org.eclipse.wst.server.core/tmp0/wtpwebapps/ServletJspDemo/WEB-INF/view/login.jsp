<%@page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%> 
<%@page import="cn.xmcu.utils.Constants" %>
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
	Object oUsername = request.getAttribute(Constants.USERNAME);
	String $username = "";
	if(oUsername != null){
		$username = (String)oUsername;
		out.print("<h4>用户名或密码错误!</h4>");
	}
%>
<form action="login.html" method="post">
	<p>用户<input type="text" name="username"  value="<%=$username%>"/></p>
	<p>密码<input type="text" name="password"  value=""/></p>
	<p><input type="submit" value="提交"/></p>
</form>		
</body> 
</html> 