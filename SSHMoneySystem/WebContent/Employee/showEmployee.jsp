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
	<h3>员工信息展示</h3>
	&nbsp;&nbsp;
	<span> 添加员工信息<a
		href="${pageContext.request.contextPath }/Employee/addEmployee.jsp">
			<img src="${pageContext.request.contextPath }/Images/add.jpg"
			width="20">
	</a>
	</span>
	<table  border="1" cellspacing="5" cellpadding="10">
		<tr>
			<th>工号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>角色</th>
			<th>密码</th>
			<th>删除</th>
			<th>编辑</th>
		</tr>

		<!-- 遍历传出的数据 -->
		<s:iterator value="list" var="de">
			<tr>
				<td><s:property value="#de.eid" /></td>
				<td>
					<!-- 固定的格式去传递值和参数 --> <s:url var="modify" namespace="/Employee"
						action="Employee_modify">
						<s:param name="eid" value="#de.eid"></s:param>
					</s:url> <s:a href="%{modify}" target="right">
						<s:property value="#de.ename" />
					</s:a>
				</td>
				<td><s:property value="#de.gender"></s:property></td>
				<td><s:property value="#de.role"></s:property></td>
				<td><s:property value="#de.password"></s:property></td>
				<td>
					<!--  这样做没问题！！！！参数传递--> <s:url var="delete" namespace="/Employee"
						action="Employee_delete">
						<s:param name="eid" value="#de.eid"></s:param>
					</s:url> <s:a href="%{delete}" target="right"
						onclick="javascript:return confirm('真的要删除嘛？');">
						<img src="${pageContext.request.contextPath }/Images/delete.jpg"
							width="20">
					</s:a>
				</td>
				<td><s:url var="modify" namespace="/Employee"
						action="Employee_Update">
						<s:param name="eid" value="#de.eid"></s:param>
					</s:url> <s:a href="%{modify}" target="right">编辑</s:a></td>
			</tr>
		</s:iterator>
	</table>
	<table border="0" cellspacing="0" cellpadding="0" align="center">
		<tr>
			<td align="left"><span>第<s:property value="curpage" />/<s:property
						value="totalpage" />页
			</span>&nbsp;&nbsp; <span>总共<s:property value="totalpage" />页
			</span>&nbsp;&nbsp; <span>每页<s:property value="pagesize" />记录
			</span>&nbsp;&nbsp;<span>总共<s:property value="totalcount" />记录
			</span> &nbsp;&nbsp; <span> <s:if test="curpage!=totalpage">
						<s:url var="findAll" namespace="/Employee"
							action="Employee_findAll">
							<s:param name="curpage" value="curpage+1"></s:param>
						</s:url>
						<s:a href="%{findAll}" target="right">下一页</s:a>
						<!-- 尾页 -->
						<s:url var="findAll" namespace="/Employee"
							action="Employee_findAll">
							<s:param name="curpage" value="totalpage"></s:param>
						</s:url>
						<s:a href="%{findAll}" target="right">尾页</s:a>
					</s:if>
			</span></td>
			<td><span><s:if test="curpage!=1">
						<!-- 首页 -->
						<s:url var="findAll" namespace="/Employee"
							action="Employee_findAll">
							<s:param name="curpage" value="curpage=1"></s:param>
						</s:url>
						<s:a href="%{findAll}" target="right">首页</s:a>
						<!-- 上一页 -->
						<s:url var="findAll" namespace="/Employee"
							action="Employee_findAll">
							<s:param name="curpage" value="curpage-1"></s:param>
						</s:url>
						<s:a href="%{findAll}" target="right">上一页</s:a>
					</s:if> </span></td>

		</tr>
	</table>
</body>
</html>