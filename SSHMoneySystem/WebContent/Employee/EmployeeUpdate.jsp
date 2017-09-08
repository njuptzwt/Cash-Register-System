<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<s:form action="Employee_save" namspace="/Employee" name="updateEmployeeForm">
工号:<input type="text" name="eid" value='<s:property value="#session.employee.eid"/>'>
姓名：<input type="text" name="ename" value='<s:property value="#session.employee.ename"/>'>
性别：<input type="text" name="gender" value='<s:property value="#session.employee.gender"/>'>
角色：<input type="text" name="role" value='<s:property value="#session.employee.role"/>'>
密码：<input type="text" name="password" value='<s:property value="#session.employee.password"/>'>
<input type="submit" value="保存">
</s:form>
</body>
</html>