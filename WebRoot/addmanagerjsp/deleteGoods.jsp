<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<style>
a {
	text-decoration: none;
}
</style>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'deleteGoods.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		<div align="center"
			style="background-color: white; margin-left: 120px; margin-right: 120px;">
			<div>
				商品信息删除和特价商品设置
			</div>

			<div style="background-color: gray;">
				商品编号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;商品名称&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;大类别&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				小类别&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;是否是特价&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;操作
			</div>
			<div style="background-color: white; margin-left: 90px;">
				<table border="0" width="650" align="center">
					<c:forEach var="mygoods" items="${mapgoods}">
						<tr>
							<td align="center">
								${mygoods.id}
							</td>
							<td align="center">
								${mygoods.goodsname}
							</td>
							<td align="left">
								${mygoods.bigame}
							</td>
							<td align="left">
								${mygoods.smallName}
							</td>
							<td align="left">
								${mygoods.discount}
							</td>
							<td align="center">
								<a href="findgoodsbyid.do?id=${mygoods.id}">详细信息&nbsp;</a>
								<a href="deletegoodsinfo.do?id=${mygoods.id}">删除</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>









	</body>
</html>
