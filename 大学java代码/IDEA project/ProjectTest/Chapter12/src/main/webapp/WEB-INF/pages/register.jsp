<%--
  Created by IntelliJ IDEA.
  User: CHUAN GE PALY
  Date: 2022/6/13
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/registerUser" method="post">
    用户名: <input type="text" name="username" value="${username}"/><br/>
    密&nbsp;&nbsp;&nbsp;码: <input type="password" name="password" value="$(user.password)"/> <br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
