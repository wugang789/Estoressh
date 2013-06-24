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

		<title>在线商城</title>

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
	<script type="text/javascript">
	window.onload = function() {
		function $(id) {
			return document.getElementById(id);

		}
	
		 clearsaInterval(s);
	}
</script>
	<body style="width: 100%;margin-right:0;margin: 0;overflow-x: hidden">
	<SCRIPT type=text/javascript>kfguin="262817214";ws="www.update8.com"; companyname="站长技术教程网"; 
welcomeword="您好,欢迎光临站长技术教程网<brT>请问,有什么可以帮到您的吗?"; type="1";</SCRIPT>
<SCRIPT src="myjs/kf.js" type=text/javascript></SCRIPT>
		<jsp:include page="frameTop.jsp"></jsp:include>
		<table style="width: 100%;" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="20%" valign="top" bgcolor="#F5F5F5">
					<!-- 页面左侧 -->
					<jsp:include page="frameLeft.jsp"></jsp:include>
				</td>
				<td width="80%" align="center" valign="top" bgcolor="#FFFFFF">
					<!-- 页面右侧 -->
					
					<div>
					<a href="#">
                    <img  src=goodsPicture/picture1/1.jpg id="obj" style="width:980px; height:300px; margin-right: -50px;margin-top: 6px;margin-left:-15px;:gray 1px solid" />
                      </a>
                      </div>
                      
                      <hr/>
					<table width="340"  border="0"  align="center" 
						cellpadding="0" cellspacing="0" bordercolor="grey"
						 style="border-width:  0;">
						<tr>
		   					<c:forEach items="${list}" var="goods" varStatus="vs">
								<td >
								   <a  href="finddetail.do?id=${goods.id}" target="_blank">
									<img src="${goods.picture}" />
									 </a>
									 <a href="finddetail.do?id=${goods.id}" target="_blank" style="color: blue;">
									<div align="center"  >
									 ${goods.goodsname} 
									 <input type="hidden" value="${goods.id}" name="_blank">
									 </a>
									<span style="color: gray;font-size: small;">最近成交${goods.number}笔</span>
									<br />
									<span id="currentprice"><fmt:formatNumber value="${goods.originalprice}"  pattern="####.0#" /><span style="color: gray;font-size: small">￥</span></span>
								    <div style="margin-left:80px;margin-right:80px;z-index:10;background-color:yellow;" >
								       <div style="padding-top: 5px;padding-bottom: 2px;padding-left:-2px;"><font color="white" size="2"><a href="finddetail.do?id=${goods.id}" target="_blank">购买</a></font></div> 
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
		</table>
	<jsp:include page="frameBottom.jsp" flush="true" />
	</body>
</html>









