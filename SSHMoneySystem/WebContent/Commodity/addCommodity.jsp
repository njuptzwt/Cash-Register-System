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
<!-- formInline控制是否在一行内排版 -->
<s:form action="Commodity_addCommodity" namespace="/Commodity" name="Commodity" theme="simple" class="form-inline">
<div class="form-group has-success">
<!-- 输入可控组件 -->
<label class="control-label" for="">商品名称</label>
<input type="text" name="cname" class="form-control" placeholder="输入商品名">
</div>
<div class="form-group">
<label for="">商品描述</label>
<input type="text" name="description" class="form-control" placeholder="输入商品描述">
</div>
<div class="form-group">
<label for="">商品单价</label>
<input type="text" name="price" class="form-control" placeholder="输入商品价格">
</div>
<div class="form-group">
<label for="">商品库存</label>
<input type="text" name="total" class="form-control" placeholder="输入商品库存">
</div>
<div class="form-group">
<button type="submit" class="btn btn-warning">添加</button>
</div>
</s:form>
</body>
</html>