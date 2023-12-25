<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	 //将过期日期设置为一个过去时间
	 response.setHeader("Expires","Sat,6 May 1995 12:00GMT");
	//设置HTTP/1.1 no cache头
	response.setHeader("Cache-Control","no-store,no-cache,must-revalidate");
	//设置IE拓展HTTP/1.1 no-cache headers,用户已添加
	response.addHeader("Cache-Control", "post-check=0,pre-check=0");
	//设置标准HTTP/1.0 no cache header
	response.setHeader("Pragma", "No-cache");
%>
<!DOCTYPE >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Response.jsp</h1> 
<h2><%out.println("这是out对象的输出");%></h2>
</body>
</html>