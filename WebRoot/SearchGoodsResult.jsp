<%@ page contentType="text/html" language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

a{
text-decoration: none;

}

a:HOVER {
	border-color: gray;
	  background-color:gray;
	  color:red;
	text-decoration: underline;
}
</style>
<script type="text/javascript">
  function go(){
  	var select=document.getElementById("select");
  	window.location.href="SearchGoods?index="+select.options.selectedIndex;
  }
  window.onload=function(){
  	var select = document.getElementById("select");
  	select.onchange=go;
  };
</script>
	<body>
		<jsp:include page="frameTop.jsp" flush="true" />
		<table style="width: 100%;" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="20%" valign="top" bgcolor="#F5F5F5">
					<!-- 页面左侧 -->
					<jsp:include page="frameLeft.jsp"></jsp:include>
				</td>
				<td width="80%" align="center" valign="top" bgcolor="#FFFFFF">
					
				<table  border="0"  align="center" 
						cellpadding="0" cellspacing="0" bordercolor="grey"
						 style="border-width:  0;">
						<tr>
		   					<c:forEach items="${mylist}" var="goods" varStatus="vs">
								<td >
								   <a  href="finddetail.do?id=${goods.id}" target="view_window">
									<img src="${goods.picture}" />
									 </a>
									 <a href="finddetail.do?id=${goods.id}" target="view_window" style="color: blue;">
									<div align="center"  >
									 ${goods.goodsname} 
									 <input type="hidden" value="${goods.id}" name="myvalue">
									 </a>
									<span style="color: gray;font-size: small;">最近成交${goods.number}笔</span>
									<br />
									<span id="currentprice"><fmt:formatNumber value="${goods.originalprice}"  pattern="####.0#" /><span style="color: gray;font-size: small">￥</span></span>
								    <div style="margin-left:100px;margin-right:80px;z-index:10;background-color:yellow;" >
								       <div style="padding-top: 5px;padding-bottom: 2px;padding-left:-2px;"><font color="white" size="2"><a href="finddetail.do?id=${goods.id}" target="view_window">购买</a></font></div> 
								    </div>
								    </div>
								</td>
								<c:choose>
									<c:when test="${vs.count % 4 == 0 }">
										<tr>
											<td colspan="3" height="30"></td>
										</tr>
									</c:when>
								</c:choose>
							
						</c:forEach>
						</tr>
					</table>
					<div>
                               总记录数：${count}&nbsp; ${index}/${pageCount }&nbsp;&nbsp; <a
				href="SearchGoods.do?index=1">首页</a>| <a
				href="SearchGoods.do?index=${index==1?index:(index-1)}">上一页</a>|
			<a
				href="SearchGoods.do?index=${index==pageCount?index:index+1 }">下一页</a>|
			<a href="SearchGoods.do?index=${pageCount}">尾页</a>&nbsp;
			跳到第 <select id="select">
				<option>请选择</option>
				<c:forEach begin="1" end="${pageCount}" var="p">
					<option value="${p}">${p }</option>
				</c:forEach>
			</select> 页
		</div>
					
		</table>
					</td>
						</tr>
					</table>
		<jsp:include page="frameBottom.jsp" flush="true" />
	</body>
</html>









