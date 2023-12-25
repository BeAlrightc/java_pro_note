<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 String username=request.getParameter("username");
 out.println(username);
 
 application.setAttribute("username", username);
 session.setAttribute("username", username);
 request.setAttribute("username", username);
 pageContext.setAttribute("username", username);
 
 pageContext.forward("request.jsp");//使其转发
 
 /*
 Object usernam=pageContext.getAttribute("username");
 System.out.println("pageContext.jsp==>"+usernam);
 */
 
 %>