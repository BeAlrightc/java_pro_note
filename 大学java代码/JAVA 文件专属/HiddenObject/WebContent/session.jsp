<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 Object username =(String)session.getAttribute("username");
 System.out.println("session.jsp ==>"+(String)username);
 session.invalidate();//将session进行销毁
%>