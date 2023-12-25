<%--
  Created by IntelliJ IDEA.
  User: CHUAN GE PALY
  Date: 2022/6/15
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单信息</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/findOrderWithUser"method="post">
      所属用户:<input type="text" name="username"/><br/>
      订单编号:<input type="text" name="order.orderId"/><br/>
      <input type="submit" value="查询"/>
  </form>
</body>
</html>
