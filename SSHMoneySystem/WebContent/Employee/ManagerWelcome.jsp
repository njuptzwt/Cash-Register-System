<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- 需要书来你掌握S标签的用法 -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<frameset  rows="20,70,10">
<frame name="top" src="${pageContext.request.contextPath }/frame/top.jsp" frameborder="0"></frame>
<frameset cols="20,80">
<frame name="left" src="${pageContext.request.contextPath }/frame/left.jsp" frameborder="0"></frame>
<frame name="right" src="${pageContext.request.contextPath }/frame/right.jsp" frameborder="0"></frame>
</frameset>
<frameset>
<frame name="bottom" src="${pageContext.request.contextPath }/frame/buttom.jsp" frameborder="0">
</frameset>

</frameset>
<body></body>
</html>