<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Object username =(String)application.getAttribute("username");
System.out.println("application.jsp ==>"+(String)username);
%>