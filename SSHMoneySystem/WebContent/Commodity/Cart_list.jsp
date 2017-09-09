<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
	background-image:
		url(${pageContext.request.contextPath }/Images/employee.jpg);
	background-repeat: no-repeat;
	background-size: 100%, 100%;
}
table {
	border-collapse: collapse;
}
</style>
</head>
<body>
<s:form namespace="/Commodity" action="Commodity_Submit" method="post" target="right">
	<table border="1" cellspacing="5" cellpadding="10">
		<tr>
			<th>商品号</th>
			<th>商品名称</th>
			<th>商品单价</th>
			<th>购买数量</th>
			<th>商品总价</th>
		</tr>

		<!-- 遍历传出的数据 -->
		<s:iterator value="#session.CartList" var="car">
			<tr>
				<td><s:property value="#car.c.cid" /></td>
				<td><s:property value="#car.c.cname" /></td>
				<td><s:property value="#car.c.price"></s:property></td>
				<td><s:property value="#car.purchasetotalcount"></s:property></td>
				<td><s:property value="#car.totalprice"></s:property></td>
			</tr>
		</s:iterator>
		<tr>
		<td colspan="5"><h3 align="right">总价:${session.Cprice }元&nbsp;&nbsp;<input type="submit" value="结算"></h3></td>
	</table>
	</s:form>
</body>
</html>