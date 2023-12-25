<%--
  Created by IntelliJ IDEA.
  User: CHUAN GE PALY
  Date: 2022/6/15
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交商品</title>
</head>
<body>

 <form action="${pageContext.request.contextPath}/getProducts"
       method="post">
     <table width="220px" border="1">
         <tr>
             <td>选择</td>
             <td>商品名称</td>
         </tr>
         <tr>
             <td>
                 <input name="proIds" value="1" type="checkbox">
             </td>
             <td>java基础教程</td>
         </tr>
         <tr>
             <td>
                 <input name="proIds" value="2" type="checkbox">
             </td>
             <td>javaweb案例</td>
         </tr>
         <tr>
             <td>
                 <input name="proIds" value="3" type="checkbox">
             </td>
             <td>ssm实战框架</td>
         </tr>


     </table>
     <input type="submit" value="提交商品">
 </form>

</body>
</html>
