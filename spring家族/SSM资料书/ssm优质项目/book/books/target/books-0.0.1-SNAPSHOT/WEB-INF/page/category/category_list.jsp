<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
<base href="<%=basePath%>">

<title>图书分类列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<link rel="stylesheet" href="<%=path%>/css/styles.css">
<link rel="stylesheet" href="<%=path%>/css/admin.css">
<script src="<%=path%>/js/jquery-1.4.4.min.js"></script>
<script src="<%=path%>/js/admin.js"></script>
</head>
<body>
	
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 图书分类信息列表</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search" style="padding-left:10px;">
					<li><a class="button border-main icon-plus-square-o"
						href="<%=path%>/category/category_add"> 添加图书分类信息</a></li>
					<li>
					<form action="<%=path%>/category/category_list" method="post" class="navbar-form navbar-right" role="search">
						<div class="input-group" method="post" style="margin-right: 0">
							<input type="text" class="input" placeholder="请输入关键字搜索" name="context" value="${context}" style="width:250px;line-height:20px;display:inline-block"/>
							<button class="button border-main icon-search" type="submit">搜索</button>
						</div>
					</form>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th width="90" style="text-align:center;">&nbsp;选择</th>
					<th>类别编号</th>
					<th>类别名称</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${category}" var="category">
					<tr>
						<td><input type="checkbox" name="ids" value="" /></td>
						<td>${category.categoryid}</td>
						<td>${category.categoryname}</td>
						<td><div class="button-group">
							<a class="button border-main" href="<%=path%>/category/category_edit/?categoryid=${category.categoryid}"><span class="icon-edit"></span> 修改</a>
							<a class="button border-red" href="<%=path%>/category/deleteCategory/?categoryid=${category.categoryid}"><span class="icon-trash-o"></span> 删除</a>
							</div></td>

					</tr>
				</c:forEach>

			</table>
		</div>

</body>
</html>
