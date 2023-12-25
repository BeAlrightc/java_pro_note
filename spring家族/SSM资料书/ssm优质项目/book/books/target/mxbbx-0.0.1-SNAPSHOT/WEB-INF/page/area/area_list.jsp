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

<title>行政区域列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<link rel="stylesheet" href="<%=path%>/css/styles.css">
<link rel="stylesheet" href="<%=path%>/css/admin.css">
<script src="<%=path%>/js/jquery-1.4.4.min.js"></script>
<script src="<%=path%>/js/admin.js"></script>

<!-- 引入zTree插件 -->
<link rel="stylesheet" type="text/css" href="<%=path%>/third/zTree_v3/css/zTreeStyle/zTreeStyle.css" >
<script type="text/javascript" src="<%=path%>/third/zTree_v3/js/jquery.ztree.core.js"></script>
<script type="text/javascript" src="<%=path%>/third/zTree_v3/js/jquery.ztree.excheck.js"></script>
</head>
<body>
        
	
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 行政区域信息列表</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search" style="padding-left:10px;">
					<li><a class="button border-main icon-plus-square-o"
						href="<%=path%>/area/openAdd"> 添加内容</a></li>
					<li>搜索：</li>
					<li>
					    <form method="post" action="<%=path%>/area/getAreaList">
						    <input type="text" placeholder="请输入搜索关键字" name="context" value="${context }" class="input" style="width:250px; line-height:17px;display:inline-block" />
						    <input type="submit" class="button border-main icon-search" value="搜索">
						
						</form>
					</li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th width="90" style="text-align:center;">&nbsp;</th>
					<th>区域编号</th>
					<th>区域名称</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${pageInfo.list }" var="area">
					<tr>

						<td><input type="checkbox" name="ids" value="" /></td>
						<td>${area.areaId }</td>
						<td>${area.areaName }</td>
						<td><div class="button-group">
								<a class="button border-main" href="<%=path%>/area/openEdit?id=${area.id }"><span
									class="icon-edit"></span> 修改</a> <a class="button border-red"
									href="<%=path%>/area/delete?id=${area.id }"><span class="icon-trash-o"></span> 删除</a>
							</div></td>

					</tr>
				</c:forEach>

			</table>
			<!-- 分页组件 -->
			<div class="pagelist">
			    <c:if test="${pageInfo.isFirstPage}">
				    <a href="<%=path%>/user/getAreaList?currentPage=1&limit=${pageInfo.pageSize}&context=${context}">首页</a>
				</c:if>
				<c:if test="${!pageInfo.isFirstPage}">
				    <a href="javascript:void(0)">首页</a>
				</c:if>
				<c:if test="${pageInfo.hasPreviousPage}">
					<a href="<%=path%>/user/getAreaList?currentPage=${pageInfo.pageNum - 1}&limit=${pageInfo.pageSize}&context=${context}">上一页</a>
				</c:if>
				<c:if test="${ !pageInfo.hasPreviousPage}">
				    <a href="javascript:void(0)">上一页</a>
				</c:if>
				
				<span class="current">${pageInfo.pageNum}</span>
				
				<c:if test="${pageInfo.hasNextPage}">
				    <a href="<%=path%>/user/getAreaList?currentPage=${pageInfo.pageNum + 1}&limit=${pageInfo.pageSize}&context=${context}">下一页</a>
				</c:if>
				<c:if test="${!pageInfo.hasNextPage}">
				    <a href="javascript:void(0)">下一页</a>
				</c:if>
				<c:if test="${!pageInfo.isLastPage}">
				    <a href="<%=path%>/user/getAreaList?currentPage=${pageInfo.pages}&limit=${pageInfo.pageSize}&context=${context}">尾页</a>
				</c:if>
				<c:if test="${pageInfo.isLastPage}">
				    <a href="javascript:void(0)">尾页</a>
				</c:if>
			</div>
		</div>

</body>
</html>
