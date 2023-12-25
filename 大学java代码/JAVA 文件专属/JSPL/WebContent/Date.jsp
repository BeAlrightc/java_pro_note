<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>输出当前时间</title>
</head>
	<body>
	 <%@ page import = "java.util.*" %>
	 <!-- 先不要加上面那句话-->
	 <%
	 Date d = new Date();
	 out.println(d.toLocaleString());
	 %>
	</body>
</html>