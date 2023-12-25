<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="text" name="uname"/><br>
        密码：<input type="password" name="password">
        <input type="submit" value="登录">
    </form>
</body>
</html>
