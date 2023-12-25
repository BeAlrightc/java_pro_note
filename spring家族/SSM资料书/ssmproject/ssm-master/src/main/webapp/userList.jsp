<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    用户信息<br>
    <c:forEach items="${userList}" var="user">
        ${user.uid} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ${user.uname} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ${user.usex}<br>
    </c:forEach>
</body>
</html>
