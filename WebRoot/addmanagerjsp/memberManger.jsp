<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'memberManger.jsp' starting page</title>

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
  会员管理>>
  </div>
	
		<table cellspacing="0">
			<tr align="center" style="background-color: #BABABA">
				<td>用户名</td>
				<td>密码</td>
				<td>操作</td>
			</tr>
            <c:forEach items="${mymember}" var="list">
            <tr align="center" >
            <td>&nbsp;&nbsp;&nbsp;${list.name}&nbsp;&nbsp;</td>
             <td>&nbsp;&nbsp;${list.password}&nbsp;&nbsp;</td>
             <td>&nbsp;&nbsp;<a href="">详细信息</a>&nbsp;<a href="deletemember.do?username=${list.name}">删除</a>&nbsp;&nbsp;</td>
            </tr>
            
            </c:forEach>
		</table>
</div>
	</body>
</html>
