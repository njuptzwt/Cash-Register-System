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
<frameset rows="10,80,10">
<frame name="top" src="${pageContext.request.contextPath }/frame/top.jsp"></frame>
<frameset cols="20,80">
<frame name="left" src="${pageContext.request.contextPath }/frame/left.jsp"></frame>
<frame name="right" src="${pageContext.request.contextPath }/frame/right.jsp"></frame>
</frameset>
<frameset>
<frame name="bottom" src="${pageContext.request.contextPath }/frame/buttom.jsp">
</frameset>

</frameset>
<body></body>
</html>