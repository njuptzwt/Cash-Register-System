<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<s:form action="Commodity_saveCommodity" namspace="/Commodity" name="updateCommodityForm">
商品号:<input type="text" name="cid" value='<s:property value="#session.commodity.cid"/>'>
商品名：<input type="text" name="cname" value='<s:property value="#session.commodity.cname"/>'>
商品描述：<input type="text" name="description" value='<s:property value="#session.commodity.description"/>'>
商品单价：<input type="text" name="price" value='<s:property value="#session.commodity.price"/>'>
商品库存：<input type="text" name="total" value='<s:property value="#session.commodity.total"/>'>
<input type="submit" value="保存">
</s:form>
</body>
</html>