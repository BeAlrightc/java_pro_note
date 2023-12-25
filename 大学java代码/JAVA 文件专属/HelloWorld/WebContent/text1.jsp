<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat "%>

<%
   String url =request.getRequestURL().toString();
   SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
   String curDate = format.format(new Date());
%>
<%int counter=0; %>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=1+2 %><br>
	<%=request.getRequestURL().toString() %><br>
	Current time:<%=new Date() %><br>
	<%=url %><br>
	CurDate:<%=curDate %><br>
	counter:<%=++counter %>
	
	<%request.setCharacterEncoding("utf-8"); %>
	<jsp:include page="text2.jsp">
	  <jsp:param name="username" value="王军"/>
	</jsp:include>
	
	<jsp:forward page="text2.jsp">
	  <jsp:param name="username" value="王军"/>
	</jsp:forward>

</body>
</html>