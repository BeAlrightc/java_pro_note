<%--
  Created by IntelliJ IDEA.
  User: CHUAN GE PALY
  Date: 2022/1/17
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统主页</title>
</head>
<body>
      当前用户：${USER_SESSION.username}
<a href="${pageContext.request.contextPath}/logout">退出</a>

</body>
</html>
