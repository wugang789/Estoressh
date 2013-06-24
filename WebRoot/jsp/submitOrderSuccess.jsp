<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
     <script language='javascript' type='text/javascript'> 
var secs =3; //倒计时的秒数 
var URL ; 
function Load(url){ 
URL =url; 
for(var i=secs;i>=0;i--) 
{ 
window.setTimeout('doUpdate(' + i + ')', (secs-i) * 1000); 
} 
} 
function doUpdate(num) 
{ 
document.getElementById('ShowDiv').innerHTML = num; 
if(num == 0) { window.location=URL; } 
} 
</script> 
<script language="javascript"> 
Load("index1.jsp"); //要跳转到的页面 
</script> 
    
    <title>My JSP 'submitOrderSuccess.jsp' starting page</title>
    
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
  <jsp:include page="/frameTop.jsp"></jsp:include>
   	<table style="width: 100%;" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="20%" valign="top" bgcolor="#F5F5F5">
					<!-- 页面左侧 -->
					<jsp:include page="/frameLeft.jsp"></jsp:include>
				</td>
				<td width="80%" align="center" valign="top" bgcolor="#FFFFFF">
				<table cellspacing="0" border="1">
  <tr>
  <td>
     订单提交成功！<span id="ShowDiv" style="color:red"></span>
  </td>
  </tr>
    </table>
				</td>
			</tr>
		</table>
   	<jsp:include page="/frameBottom.jsp" flush="true" />
  </body>
</html>
