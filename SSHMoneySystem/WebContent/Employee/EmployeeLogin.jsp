<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品收银系统</title>

<link href="${pageContext.request.contextPath }/CSS/main.css" rel="stylesheet" type="text/css" />

</head>
<body>


<div class="login">
    <div class="box png">
		<div class="logo png"></div>
		<div class="input">
			<div class="log">
				<div class="name">
					<label>用户名</label><input type="text" class="text" id="value_1" placeholder="用户名" name="ename" tabindex="1">
				</div>
				<div class="pwd">
					<label>密　码</label><input type="password" class="text" id="value_2" placeholder="密码" name="password" tabindex="2">
					<input type="button" class="submit" tabindex="3" value="登录">
					<div class="check"></div>
				</div>
				<div class="tip"></div>
			</div>
		</div>
	</div>
    <div class="air-balloon ab-1 png"></div>
	<div class="air-balloon ab-2 png"></div>
    <div class="footer"></div>
</div>

<script type="text/javascript" src="${pageContext.request.contextPath }/JS/jQuery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/JS/fun.base.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/JS/script.js"></script>


<!--[if IE 6]>
<script src="js/DD_belatedPNG.js" type="text/javascript"></script>
<script>DD_belatedPNG.fix('.png')</script>
<![endif]-->
<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
<p>适用浏览器：360、FireFox、Chrome、Safari、Opera、傲游、搜狗、世界之窗. 不支持IE8及以下浏览器。</p>
<p>郑文添的商品后台管理系统</a></p>
</div>
</body>
</html>