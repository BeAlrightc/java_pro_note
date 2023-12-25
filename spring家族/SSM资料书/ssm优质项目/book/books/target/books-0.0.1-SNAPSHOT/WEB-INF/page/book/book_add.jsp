<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<link rel="stylesheet" type="text/css" href="css/styles.css">
<link rel="stylesheet" type="text/css" href="css/admin.css">

<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="js/admin.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		//重新绑定表单提交
		$("#add_btn").bind("click", function() {
			$('form').submit();
		});
	});
</script>

</head>
  
  <body>
  <div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>添加图书</strong></div>
  <div class="body-content">
    <form id="form-addrole" method="post" class="form-x" action="<%=path%>/book/addBook">
      <div class="form-group">
        <div class="label">
          <label>图书名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="bookname" placeholder="请输入图书名称"/>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>作者：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="author" placeholder="请输入作者"/>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>出版：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="publish" placeholder="请输入出版"/>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>页数(整数)：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="pages" placeholder="请输入页数"/>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>价格：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="price" placeholder="请输入价格"/>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>类别：</label>
        </div>
        <div class="field">
          <select class="input w50 " name="categoryid">
            <c:forEach items="${category}" var="category">
              <option value="${category.categoryid}">${category.categoryname}</option>
            </c:forEach>
          </select>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button id="add_btn" class="button bg-main icon-check-square-o" type="button"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
  
  </body>
</html>
