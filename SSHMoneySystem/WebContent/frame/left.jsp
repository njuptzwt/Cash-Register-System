<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>后台管理操作</h3>
<ol>
<li>
<!-- namespace的用法-->
<s:url var="findAll" namespace="/Employee" action="Employee_findAll"></s:url>
<s:a href="%{findAll}" target="right">员工管理</s:a>
</li>
<li>
<s:url var="ComfindAll" namespace="/Commodity" action="Commodity_findAll"></s:url>
<s:a href="%{ComfindAll}" target="right">商品仓库</s:a>
</li>
</ol>
</body>
</html>