<%--
  Created by IntelliJ IDEA.
  User: CHUAN GE PALY
  Date: 2021/12/28
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="index.css">
    <title>首页</title>
</head>
<body>
     <div class="main">
         <h2>欢迎登陆</h2>
         <form action="/test" method="post">
             <input type="text" name="name" placeholder="用户名">
             <input type="text" password="password" placeholder="密码">
             <input type="submit" name="submit" value="登录">
         </form>
     </div>

</body>
</html>
