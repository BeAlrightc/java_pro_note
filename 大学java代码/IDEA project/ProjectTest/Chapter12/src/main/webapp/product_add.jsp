<%--
  Created by IntelliJ IDEA.
  User: CHUAN GE PALY
  Date: 2022/6/22
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品添加</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-3.6.0.js"></script>
</head>
<body>
  <table id="products" border="1" width="60%">
      <tr align="center">
          <td>黎小凤迎您点击：</td>
          <td id="username"></td>
      </tr>
      <tr align="center">
          <td colspan="2" align="center">
          <input type="button" value="添加多个商品"
                 onclick="addProducts()">
      </tr>
      <tr align="center">
          <td>id</td>
          <td>商品名称</td>
      </tr>
  </table>
<script type="text/javascript">
    window.onload= function (){
        var url="${pageContext.request.contextPath }/getUser";
        $.get(url,function(response){
            $("#username").text(response.username);
        })
    }

    function addProducts(){
        var url ="${pageContext.request.contextPath}/addProducts";
        $.get(url,function(products){
            for(var i=0;i<products.length;i++){
                $("#products").append("<tr><td>"+products[i].proId+"</td>"+
                "<td>"+products[i].proName+"</td><tr >")
            }
        })
    }
</script>
</body>
</html>
