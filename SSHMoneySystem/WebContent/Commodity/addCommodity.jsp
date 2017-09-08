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
<s:form action="Commodity_addCommodity" namespace="/Commodity" name="Commodity">
商品名称:<input type="text" name="cname">
商品描述:<input type="text" name="description">
商品单价:<input type="text" name="price">
商品库存:<input type="text" name="total">
<input type="submit" value="添加"></s:form>
</body>
</html>