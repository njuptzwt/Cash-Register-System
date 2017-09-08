<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- 需要书来你掌握S标签的用法 -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工收银界面</title>
</head>
<frameset  rows="20,80">
<frame name="employeetop" src="${pageContext.request.contextPath }/frame/employeetop.jsp"></frame>
<frameset cols="30,70">
<frame name="employeeleft" src="${pageContext.request.contextPath }/frame/employeeleft.jsp"></frame>
<frame name="right" src="${pageContext.request.contextPath }/frame/employeeright.jsp"></frame>
</frameset>

</frameset>
<body></body>
</html>