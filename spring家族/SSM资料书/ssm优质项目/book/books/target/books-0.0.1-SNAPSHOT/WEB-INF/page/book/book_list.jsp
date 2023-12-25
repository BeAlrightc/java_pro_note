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

<title>图书列表</title>
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
				<strong class="icon-reorder"> 图书信息列表</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search" style="padding-left:10px;">
					<li><a class="button border-main icon-plus-square-o"
						href="<%=path%>/book/book_add"> 添加图书信息</a></li>
					<li>搜索：</li>
					<li>
					    <form method="get" action="<%=path%>/book/book_list">
						    <input type="text" placeholder="请输入搜索关键字" name="context" value="${context}" class="input" style="width:250px; line-height:17px;display:inline-block" />
						    <input type="submit" class="button border-main icon-search" value="搜索">
						</form>
					</li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th width="90" style="text-align:center;">&nbsp;选择</th>
					<th>图书编号</th>
					<th>图书名称</th>
					<th>作者</th>
					<th>出版</th>
					<th>页数</th>
					<th>价格</th>
					<th>类别</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${book}" var="book">
					<tr>
						<td><input type="checkbox" name="ids" value="" /></td>
						<td>${book.bookid}</td>
						<td>${book.bookname}</td>
						<td>${book.author}</td>
						<td>${book.publish}</td>
						<td>${book.pages}</td>
						<td>${book.price}</td>
						<td>${book.category.categoryname}</td>
						<td><div class="button-group">
							<a class="button border-main" href="<%=path%>/book/book_edit/?bookid=${book.bookid}"><span class="icon-edit"></span> 修改</a>
							<a class="button border-red" href="<%=path%>/book/deleteBook/?bookid=${book.bookid}"><span class="icon-trash-o"></span> 删除</a>
							</div></td>

					</tr>
				</c:forEach>

			</table>
		</div>

</body>
</html>
