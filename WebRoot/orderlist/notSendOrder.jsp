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
    
    <title>My JSP 'alreadySendOrder.jsp' starting page</title>
    
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
  所有未发货的订单>>>>
  </div>
  <table cellspacing="0" border="1" bordercolor="#FFFFFF">
  <tr align="center" style="background-color: #BABABA">
  <td>订单号</td>
  <td>提交时间</td>
  <td>用户名称</td>
  <td>是否发货</td>
  </tr>
     <c:forEach items="${notsend}" var="mylist">
     <tr align="center">
     <td>&nbsp;&nbsp;${mylist.orderNumber}&nbsp;&nbsp;</td>
     <td>&nbsp;&nbsp;${mylist.dateTime}&nbsp;&nbsp;</td>
     <td>&nbsp;&nbsp;${mylist.name}&nbsp;&nbsp;</td>
     <td>&nbsp;&nbsp;${mylist.sign}&nbsp;&nbsp;</td>
             </tr>
     </c:forEach>
     </table>
     </div>
  </body>
</html>
