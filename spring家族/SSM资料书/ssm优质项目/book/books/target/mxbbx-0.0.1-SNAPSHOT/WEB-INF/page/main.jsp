<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="p" uri="com.gxuwz.permissions"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>慢性病报销系统V1.0</title>
    <base href="<%=basePath%>">  
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <link rel="stylesheet" href="<%=path %>/css/styles.css">
    <link rel="stylesheet" href="<%=path %>/css/admin.css">
    <script src="<%=path %>/js/jquery-1.4.4.min.js"></script>   
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="<%=path %>/images/logo.jpg" class="radius-circle rotate-hover" height="50" alt="" />慢性病报销系统</h1>
  </div>
  <div class="head-l" ><a href="" target="_blank" style="color:#FFF" ><span class="icon-user"></span> 欢迎 xx</a>&nbsp;&nbsp;<a class="button button-little bg-green" href="" target="_blank" ><span class="icon-home"></span> 首页</a> &nbsp;&nbsp;<a class="button button-little bg-red" href="LogoutServlet"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
  
  <p:permissions menu="userManagement,roleManagement,rightManagement,systemManagement">
	  <h2><span class="icon-user"></span>系统设置</h2>
	  <ul style="display:block">
	    <p:permissions right="roleManagement">
	        <li><a href="#" target="right"><span class="icon-caret-right"></span>角色管理</a></li>
	    </p:permissions>
	    <p:permissions right="userManagement">
	    	<li><a href="<%=path %>/user/getUserList" target="right"><span class="icon-caret-right"></span>用户管理</a></li>
	    </p:permissions>
	    <p:permissions right="rightManagement">
	        <li><a href="#" target="right"><span class="icon-caret-right"></span>权限管理</a></li>
	    </p:permissions>
	    
	    <li><a href="<%=path %>/area/getAreaList" target="right"><span class="icon-caret-right"></span>行政区域管理</a></li>
	    <li><a href="#" target="right"><span class="icon-caret-right"></span>农合机构管理</a></li>
	    <li><a href="#" target="right"><span class="icon-caret-right"></span>慢病分类管理</a></li>
	    <li><a href="#" target="right"><span class="icon-caret-right"></span>医疗机构管理</a></li>
	    <li><a href="#" target="right"><span class="icon-caret-right"></span>慢病政策设置</a></li>
	  </ul>
  </p:permissions>
     
  <h2><span class="icon-user"></span>业务办理</h2>
  <ul >
    <li><a href="#" target="right"><span class="icon-caret-right"></span>家庭档案管理</a></li>
    <li><a href="#" target="right"><span class="icon-caret-right"></span>农民档案管理</a></li>
    <li><a href="#" target="right"><span class="icon-caret-right"></span>参合缴费登记</a></li>
    <li><a href="#" target="right"><span class="icon-caret-right"></span>慢病证管理</a></li>
    <li><a href="#" target="right"><span class="icon-caret-right"></span>慢病报销</a></li>
    </ul> 
    <h2><span class="icon-user"></span>统计报表</h2>
  <ul >
    <li><a href="#" target="right"><span class="icon-caret-right"></span>慢性病报销情况</a></li>
    </ul>     
  
</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
<ul class="bread">
  <li><a href="{:U('Index/info')}" target="right" class="icon-home"> 首页</a></li>
  <li><a href="##" id="a_leader_txt">欢迎界面</a></li>
  <li><b>当前语言：</b><span style="color:red;">中文</php></span>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;切换语言：<a href="##">中文</a> &nbsp;&nbsp;<a href="##">英文</a> </li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="<%=path %>/openWelcomePage" name="right" width="100%" height="100%"></iframe>
</div>
<div style="text-align:center;">
<p>来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
</div>
</body>
</html>
