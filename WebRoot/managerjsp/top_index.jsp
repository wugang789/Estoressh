<%@ page contentType="text/html" language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
  <head>
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="../css/top.css" rel="stylesheet" type="text/css">
<script language="javascript" src="../js/time.js" type="text/javascript"></script>
<link href="../css/button.css" rel="stylesheet" type="text/css">

  </head>
  
  <body>

   <table background="../managerpicture/head.JPG"  width="100%" height="78" border="0">
  <tr>
    <td width="51%" height="74" align="center"><div align="left"></div></td>
    <td width="36%" > 
      <ul id="navCircle">
  <li><a href="jsp/zxy/userInfo.jsp" target="mainFrame"class="style17 style22 style22"> 欢迎:</a></li>
  <li><a href="canlender1.html" target="mainFrame"class="style17 style22 style22">首页</a></li>
  <li><a href="card/cardbox.html" target="mainFrame" class="style17 style22">名片</a></li>
  <li><a href="workplan/workPlan.htm" target="mainFrame" class="style17 style22">日程</a></li>
  <li><a href="message/allmessage.htm" target="mainFrame" class="style17 style22">留言</a> </li>
  <li><a href="mailto:geofly@163.com" class="style17 style22">联系我们</a> </li>
  <li><a href="" onclick="quit();">退出</a> </li>
  
    </ul>      </td>
    <td width="13%" ><img src="../managerpicture/www6Lucn0028.gif" width="79" height="73"></td>
  </tr>
</table>

  </body>
</html>
