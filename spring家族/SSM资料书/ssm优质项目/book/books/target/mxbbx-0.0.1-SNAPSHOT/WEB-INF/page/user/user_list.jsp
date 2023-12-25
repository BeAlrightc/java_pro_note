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

<title>用户列表</title>
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
				<strong class="icon-reorder"> 用户信息列表</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search" style="padding-left:10px;">
					<li><a class="button border-main icon-plus-square-o"
						href="<%=path%>/user/openAdd"> 添加内容</a></li>
					<li>搜索：</li>
					<li>
					    <form method="post" action="<%=path%>/user/getUserList">
						    <input type="text" placeholder="请输入搜索关键字" name="context" value="${context }" class="input" style="width:250px; line-height:17px;display:inline-block" />
						    <input type="submit" class="button border-main icon-search" value="搜索">
						
						</form>
					</li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th width="90" style="text-align:center;">&nbsp;</th>
					<th>用户编号</th>
					<th>用户名称</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${pageInfo.list }" var="user">
					<tr>

						<td><input type="checkbox" name="ids" value="" /></td>
						<td>${user.userId }</td>
						<td>${user.userName }</td>
						<td><div class="button-group">
								<a class="button border-main" href="<%=path%>/user/openEdit?id=${user.id }"><span
									class="icon-edit"></span> 修改</a> <a class="button border-red"
									href="<%=path%>/user/delete?id=${user.id }"><span class="icon-trash-o"></span> 删除</a>
							</div></td>

					</tr>
				</c:forEach>

			</table>
			<div class="pagelist">
			    <c:if test="${pageInfo.isFirstPage}">
				    <a href="<%=path%>/user/getUserList?currentPage=1&limit=${pageInfo.pageSize}&context=${context}">首页</a>
				</c:if>
				<c:if test="${!pageInfo.isFirstPage}">
				    <a href="javascript:void(0)">首页</a>
				</c:if>
				<c:if test="${pageInfo.hasPreviousPage}">
					<a href="<%=path%>/user/getUserList?currentPage=${pageInfo.pageNum - 1}&limit=${pageInfo.pageSize}&context=${context}">上一页</a>
				</c:if>
				<c:if test="${ !pageInfo.hasPreviousPage}">
				    <a href="javascript:void(0)">上一页</a>
				</c:if>
				
				<span class="current">${pageInfo.pageNum}</span>
				
				<c:if test="${pageInfo.hasNextPage}">
				    <a href="<%=path%>/user/getUserList?currentPage=${pageInfo.pageNum + 1}&limit=${pageInfo.pageSize}&context=${context}">下一页</a>
				</c:if>
				<c:if test="${!pageInfo.hasNextPage}">
				    <a href="javascript:void(0)">下一页</a>
				</c:if>
				<c:if test="${!pageInfo.isLastPage}">
				    <a href="<%=path%>/user/getUserList?currentPage=${pageInfo.pages}&limit=${pageInfo.pageSize}&context=${context}">尾页</a>
				</c:if>
				<c:if test="${pageInfo.isLastPage}">
				    <a href="javascript:void(0)">尾页</a>
				</c:if>
			</div>
		</div>

</body>
</html>
