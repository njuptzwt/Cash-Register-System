<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/JS/count.js"></script></head>
<style type="text/css">    
 body{    
      background-image: url(${pageContext.request.contextPath }/Images/main.jpg);    
      background-repeat: no-repeat;
      background-size:100%,100%;
 }   
table{    
      border-collapse: collapse;
 }
</style> 
<body>
<table  border="5" cellspacing="3" cellpadding="10">
<tr>
<th>商品号</th>
<th>商品名称</th>
<th>商品单价</th>
<th>商品库存</th>
<th>购买数量</th>
<th>商品总价</th>
</tr>
<tr>
<td><s:property value="#session.commodity.cid"/></td>
<td><s:property value="#session.commodity.cname"/></td>
<td><input id="price" type="text" value='<s:property value="#session.commodity.price"/>'></td>
<td><input id="total" type="text" value='<s:property value="#session.commodity.total"/>'></td>
<td><input id="min" name="" type="button" value="-" /> 
<input id="text_box" name="" type="text" value="1" style="width:30px;text-align: center"/> 
<input id="add" name="" type="button" value="+" /></td>
<td><input id="totalprice" type="text" value='<s:property value="#session.commodity.price"/>'></td>
</tr>
</table>
</body>
</html>