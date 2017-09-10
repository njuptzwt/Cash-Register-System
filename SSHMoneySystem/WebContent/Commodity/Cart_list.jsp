<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script> 
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<!--<style type="text/css">
body {
	background-image:
		url(${pageContext.request.contextPath }/Images/employee.jpg);
	background-repeat: no-repeat;
	background-size: 100%, 100%;
}
</style>-->
</head>
<body>
<s:form namespace="/Commodity" action="Commodity_Submit" method="post" target="right" them="simple">
	<table class="table table-striped table-border table-hover" >
		<thead>
		<tr>
			<th align="center">商品号</th>
			<th align="center">商品名称</th>
			<th align="center">商品单价</th>
			<th align="center">购买数量</th>
			<th align="center">商品总价</th>
		</tr>
		</thead>

		<!-- 遍历传出的数据 -->
		<s:iterator value="#session.CartList" var="car">
			<tr>
				<td ><s:property value="#car.c.cid" /></td>
				<td ><s:property value="#car.c.cname" /></td>
				<td ><s:property value="#car.c.price"></s:property></td>
				<td ><s:property value="#car.purchasetotalcount"></s:property></td>
				<td ><s:property value="#car.totalprice"></s:property></td>
			</tr>
		</s:iterator>
		<tr>
		<td colspan="5"><h3 align="right">总价:${session.Cprice }元&nbsp;&nbsp;<input type="submit" value="结算"></h3></td>
	</table>
	</s:form>
</body>
</html>