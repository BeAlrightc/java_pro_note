<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@page import="cn.xmcu.domain.User" %>
<%@page import="java.util.List" %>
<%@page import="cn.xmcu.utils.Constants" %>

<%
	User $user = (User)session.getAttribute(Constants.USER);
	List<User> userList = (List<User>)request.getAttribute(Constants.USER_LIST);
%>
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title>浏览数据</title> 
<style>
*{margin:0; padding:0;}
h4{width:200px; margin: 0 auto; margin-top:10px;}
h4 a{margin-left: 50px;}
div{margin: 0 auto; width:80%;   margin-top: 30px;}
table{width:80%; border:1px solid #ccc; border-collapse: collapse; margin:0 auto;}
table{margin-top:20px;}
table td,table th{border:1px solid #ccc; height: 40px; text-align:center; vertical-align:middle;}
table input[type="text"]{border-width: 0; text-align:center; font-size:14px; padding:5px; width:100px;}
</style>
</head> 
<body> 
<h4>欢迎<%=$user.getUsername()%><a href="logout.html">退出</a></h4>
 <table>
	<thead>
		<tr>
			<th>ID</th>
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>			
			<th>出生日期</th>
			<th>email</th>
			<th>phone</th>
		</tr>
	</thead>
	<tbody>
		<% for(User user : userList) {%>
			<tr>				
					<td><%=user.getId() %></td>
					<td><input type="text" name="username" value="<%=user.getUsername() %>"/></td>
					<td><input type="text" name="sex" value="<%=user.getSex() %>"/></td>
					<td><input type="text" name="age" value="<%=user.getAge() %>"/></td>
					<td><input type="text" name="birthday" value="<%=user.getBirthday() %>"/></td>
					<td><input type="text" name="email" value="<%=user.getEmail() %>"/></td>
					<td><input type="text" name="phone" value="<%=user.getPhone() %>"/></td>
			</tr>			
		<%} %>
	</tbody>
</table>

</body> 
</html> 