<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script> 
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Employee_addEmployee" name="Employee" class="form-inline" >
<div class="form-group">
<label for="">名字</label>
<input type="text" name="ename" class="form-control" placeholder="输入雇员名">
</div>
<div class="form-group">
<label for="">性别</label>
<input type="text" name="gender" class="form-control" placeholder="输入雇员性别">
</div>
<div class="form-group">
<label for="">角色</label>
<input type="text" name="role" class="form-control" placeholder="输入雇员角色">
</div>
<div class="form-group">
<label for="">密码</label>
<input type="text" name="password" class="form-control" placeholder="输入雇员密码">
</div>
<div class="form-group" >
<button type="submit" class="btn btn-success">添加</button>
</div>
</form>
</body>
</html>