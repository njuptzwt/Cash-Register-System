<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="Employee_addEmployee" namespace="/Employee" name="Employee">
名字:<input type="text" name="ename">
性别:<input type="text" name="gender">
角色:<input type="text" name="role">
密码：<input type="text" name="password">
<input type="submit" value="添加"></s:form>
</body>
</html>