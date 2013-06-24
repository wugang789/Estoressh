<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'addManager.jsp' starting page</title>

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
	 <div align="center" style="background-color: white;margin-left: 210px;margin-right: 210px;">
  <div style="background-color:#B2DFEE;height: 25px;">
  管理员添加>>
  </div>
		<div align="center" style="background-color: white;">
			
			<s:form action="addmanager.do" method="post" >
				<input type="hidden" value="1" name="ismanager" />
				<s:textfield name="userEntity.name" label="用户名"></s:textfield>
				<s:password name="userEntity.password" label="密码"></s:password>
				<s:textfield name="userEntity.reallyname" label="真实姓名"></s:textfield>
				<s:hidden name="userEntity.isDelete" value="0"></s:hidden>
				<div><s:submit value="添加"></s:submit></div>
				<div><s:reset value="重置"></s:reset></div>
				
			</s:form>
		</div>
		</div>
	</body>
</html>
