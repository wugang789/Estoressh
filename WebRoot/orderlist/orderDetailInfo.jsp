<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'orderDetailInfo.jsp' starting page</title>
    
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
    <div style="background-color:white;margin-left: 200px;margin-right: 200px;" >
    <div style="background-color:  	#D1EEEE">客服订单详细浏览>>>></div>
    <div align="center">
    <Br />
    <table border="1" cellspacing="0">
    <c:forEach var="goods" items="${myorderlist}">
    <tr>
    <td style="background-color: #CDC9C9">收件人姓名:</td>
     <td>${goods.reallyName}</td>
     <td style="background-color: #CDC9C9">收件人地址:</td>
     <td>${goods.address}</td>
    </tr>
    <tr>
    <td style="background-color: #CDC9C9">电话:</td>
     <td>${goods.tel}</td>
     <td style="background-color: #CDC9C9">数量:</td>
     <td>${goods.number}</td>
    </tr>
    <tr>
    <td style="background-color: #CDC9C9">邮费:</td>
     <td>${goods.freight}(￥)</td>
     <td style="background-color: #CDC9C9">价格:</td>
     <td>${goods.price}</td>
    </tr>
    <tr>
    <td colspan="4" align="center">
    <div><img src="${goods.picture}" width="100" height="100"/></div>
    <div>${goods.goodsName}</div>
    </td>
    </tr>
    <tr>
    <td colspan="4" style="background-color:#CDC9C9 ">
    备注信息>>
    </td>
    </tr>
    <tr>
    <td colspan="4">
      ${goods.bz }
    </td>
    </tr>
    </c:forEach>
    </table>
    </div>
    </div>
  </body>
</html>
