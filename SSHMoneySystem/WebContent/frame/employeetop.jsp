<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>超市收银系统</title>
</head>
<style type="text/css">    
 body{    
      background-image: url(${pageContext.request.contextPath }/Images/top.jpg);    
      background-repeat: no-repeat;
      background-size:100%,100%;
 } 
 .head
 {
      font-family : 微软雅黑,宋体;
      font-size : 1em;
      color : #f0f;
 }
 .Info
 {
      font-family : 微软雅黑,宋体;
      font-size : 1em;
      color : #f00;
 }
 </style>
<body>
<div class="head">
<h2 align="center">超市收银系统</h2>
</div>
<div class="Info">
<h3 align="center">欢迎登录：<s:property value="#session.Employee.ename"/>&nbsp;&nbsp;
<s:property value="#session.Employee.role"/>&nbsp;&nbsp;&nbsp;&nbsp;
<!-- 通过JS控件,简单的实现网页跳转 -->
<a href="javascript:window.parent.location.href='${pageContext.request.contextPath }/Employee/EmployeeLogin.jsp';">注销</a></h3>
</div>
</body>
</html>