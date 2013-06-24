<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index1.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>
	<style>
img {
	width: 180;
	height: 200;
	margin-left: 10px;
    padding-right: 38px;
    margin-top: -10px;
}
#currentprice{
 color:green;
 font-style:italic;
 font-size:large;
 color: red;
}

a:HOVER {
	border-color: gray;
	  background-color:gray;
	  color:red;
	text-decoration: underline;
}
a{
text-decoration: none;

}
</style>
<!--  <script type="text/javascript">
  function go(){
  	var select=document.getElementById("select");
  	window.location.href="FindAllGoods?index="+select.options.selectedIndex;
  }
  window.onload=function(){
  	var select = document.getElementById("select");
  	select.onchange=go;
  };
</script>
-->
	<body style="width: 100%;margin-right:0;margin: 0;overflow-x: hidden">
		<jsp:include page="/frameTop.jsp"></jsp:include>
		<table style="width: 100%;" border="1" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="20%" valign="top" bgcolor="#F5F5F5">
					<!-- 页面左侧 -->
					<jsp:include page="/frameLeft.jsp"></jsp:include>
				</td>
				<td width="80%" align="center" valign="top" bgcolor="#FFFFFF">
				 <div>
   收银结账   
   </div>
   <div>
   <%
Date date=new Date();
   SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    %>
    <s:form action="submitOrder.do" method="post">
    <input type="hidden" value="<%=date.getTime()%>" name="orderEntity.orderNumber" />
    <input type="hidden" value="否"  name="orderEntity.sign"/>
    <input type="hidden" value="0"  name="orderEntity.isManagerDeleteOrder"/>
    <input type="hidden" value="0"  name="orderEntity.isUserDeleteOrder"/>
    <div>
   订单编号:<%=date.getTime() %>
   </div>
   <div>
  <input type="hidden" value="${username}" name="orderEntity.name" >
  <input type="hidden" value="${userid}" name="orderEntity.user_id">
 
  <input type="hidden" value="<%=format.format(date)%>" name="orderEntity.dateTime">
   </div>
   <div>
   <s:textfield name="orderEntity.reallyName" label="真实姓名" ></s:textfield>
   </div>
   <div>
   <s:textfield name="orderEntity.address" label="联系地址"></s:textfield>
   </div>
   <div>
   <s:textfield name="orderEntity.tel" label="联系电话"></s:textfield>
   </div>
   <div>
 <s:select label="付款方式" name="orderEntity.post" list="{'银行付款','邮政付款','现金支付'}"/>
 </div>
 <div>
 <s:select list="{'普通邮寄','特快专递','EMS专递方式'}" label="运送方式" name="orderEntity.pay"></s:select>
 </div>
 <div>
   <s:textarea label="备注信息" cols="30" rows="10" name="orderEntity.bz" ></s:textarea>
   </div>  
   <div>
   <s:submit src="goodsPicture/orderList.jpg" type="image"></s:submit>
   </div>
   </s:form>
   </div>
				</td>
			</tr>
		</table>
	<jsp:include page="/frameBottom.jsp" flush="true" />
	</body>
</html>

