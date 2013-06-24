<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'allOrderList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
a{
text-decoration: none;
color: #5D478B
font-weight:bold;
}
 a:HOVER {
	background-color: #FF7256;
	font-family: sans-serif;
	text-decoration: underline;
	color: white;
	
}
a.myid:VISITED {
	color:#CD0000;
}
</style>
  </head>
  
  <body>
  <div align="center" style="background-color: white;margin-left: 210px;margin-right: 210px;">
  <div style="background-color:#B2DFEE;height: 25px;">
  所有订单>>>>
  </div>
  <table cellspacing="0" border="1" bordercolor="#FFFFFF">
  <tr align="center" style="background-color: #BABABA">
  <td>订单号</td>
  <td>提交时间</td>
  <td>用户名称</td>
  <td>是否发货</td>
  <td>操作</td>
  </tr>
     <c:forEach items="${myorderlist}" var="mylist">
     <tr align="center">
     <td>&nbsp;&nbsp;${mylist.orderNumber}&nbsp;&nbsp;</td>
     <td>&nbsp;&nbsp;${mylist.dateTime}&nbsp;&nbsp;</td>
     <td>&nbsp;&nbsp;${mylist.name}&nbsp;&nbsp;</td>
     <td>&nbsp;&nbsp;${mylist.sign}&nbsp;&nbsp;</td>
     <td>&nbsp;&nbsp;<div style="background-color: gray"><div><a href="findsingleorderlist.do?orderId=${mylist.orderNumber}">详细信息</a></div></div>
     &nbsp;&nbsp;<a href="sendgoods.do?orderId=${mylist.orderNumber}" class="myid">发货</a>&nbsp;
     <a href="deleteorderlist.do?orderId=${mylist.orderNumber}">删除</a></td>
             </tr>
     </c:forEach>
     </table>
     </div>
  </body>
</html>
