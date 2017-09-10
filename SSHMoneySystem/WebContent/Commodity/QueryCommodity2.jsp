<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/JS/count.js"></script>
<script type="text/javascript">
	function formSubmit() {
		document.getElementById("CommodityForm").submit()
		//document.CommodityForm.submit();
	}
</script>
<style type="text/css">
body {
	background-image:
		url(${pageContext.request.contextPath }/Images/main.jpg);
	background-repeat: no-repeat;
	background-size: 100%, 100%;
}

table {
	border-collapse: collapse;
}
</style>
</head>
<body>
	<s:form action="Commodity_CartCommodity" namespace="/Commodity"
		method="post" name="CommodityForm" target="right" id="CommodityForm">
		<table border="1" cellspacing="5" cellpadding="10">
			<tr>
				<th>商品号</th>
				<th>商品名称</th>
				<th>商品单价</th>
				<th>商品库存</th>
				<th>购买数量</th>
				<th>商品总价</th>
				<th>加入总数</th>
			</tr>
			<tr>
			<!-- jsp中为了防止用户恶意篡改，用readonly只读，而且服务器端可以接收参数 -->
				<td><input type="text" name="cid" readonly style="border:0px" value="<s:property value='#session.commodity.cid'/>" /></td>
				<td><s:property value="#session.commodity.cname" /></td>
				<td><input id="price" readonly type="text"
					value='<s:property value="#session.commodity.price"/>'></td>
				<td><input name="total" readonly id="total" type="text"
					value='<s:property value="#session.commodity.total"/>'></td>
				<td><input id="min" name="" type="button" value="-" /> <input
					id="text_box" name="count" type="text" value="1"
					style="width: 30px; text-align: center" /> <input id="add" name=""
					type="button" value="+" /></td>
				<td><input name="totalprice" readonly id="totalprice" type="text"
					value='<s:property value="#session.commodity.price"/>'></td>
				<td><input type="submit" value="进账"></td>
				<!--  <td><img
					src="${pageContext.request.contextPath }/Images/add.jpg" width="20" onclick="formSubmit()">
				</td>-->
			</tr>
		</table>
	</s:form>
</body>
</html>