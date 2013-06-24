<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'findMember.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>
	<script type="text/javascript">
	function seekmember() {
		var text = document.getElementById("mytext").value;
		window.location.href = "findmember.do?username=" + text;

	}
</script>
	<body>
		<div align="center"
			style="background-color: white; margin-left: 210px; margin-right: 210px;">
			<div style="background-color: #B2DFEE; height: 25px;">
				会员查询>>
			</div>
			<div>
				<div>
					请输入会员名称:
					<input type="text" id="mytext" />
					<div
						style="margin-top: -20px; margin-left: 460px; z-index: 12px; border: medium; position: absolute; background-color: #BFBFBF;">
						<div style="padding-top: 3px; cursor: pointer;"
							onclick=
	seekmember();;
>
							<font size="2"> 查询</font>
						</div>
					</div>
				</div>
			</div>
			 <div style="border: thin 1px;height:1px;background-color:#E3E3E3;"></div>
		</div>
		<div id="mydis" style="background-color: white; margin-left: 210px; margin-right: 210px;" align="center">
			<table cellspacing="0" border="1" bordercolor="#FFFFFF">
				<c:forEach var="list" items="${mylist}">
					<tr align="center">
						<td>会员名</td>
						<td>密码</td>
						<td>密码问题</td>
						<td>答案</td>
					</tr>
					<tr>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;${list.name}&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;${list.password}&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;${list.question}&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;${list.result}&nbsp;&nbsp;&nbsp;&nbsp;</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>
