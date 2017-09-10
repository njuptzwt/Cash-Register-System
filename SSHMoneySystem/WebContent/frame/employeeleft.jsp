<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">    
 body{    
      font-family : 微软雅黑,宋体;
      font-size : 1em;
      color : #f00;
      background-image: url(${pageContext.request.contextPath }/Images/left.png);    
      background-repeat: no-repeat;
      background-size:100%,100%;
 }   
 .operation{
 
 }
 </style>    
</head>
<body>
<h3>前台管理操作</h3>
<br/>
<br/>
<p></p>
<p>
<s:form namespace="/Commodity" action="Commodity_QueryCommodity" method="post" target="right">
&nbsp;&nbsp;&nbsp;请输入商品编号:<input type="text" name="cid">
<input type="submit" value="收银">
</s:form>
</body>
</html>