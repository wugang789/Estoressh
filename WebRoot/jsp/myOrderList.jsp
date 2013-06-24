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
		<script type="text/javascript"
			src="http://ajax.microsoft.com/ajax/jquery
/jquery-1.4.min.js"></script>
		<script type="text/javascript">
	$(document).ready(function() {
		$("#mysubmit").click(function() {
			$.ajax( {
				url : "checkShopping.do",
				type : "post",
				dataType : "json",
				cache : false,
				data : {
				},
				success : function(data) {
				if(data.b=='未登录'){
				document.getElementById("bg").style.display = "block";
               document.getElementById("show").style.display = "block";
				}else{
				
				if(data.b=='有购物车'){
				window.location.href="/Estoressh/jsp/orderList.jsp";
				}else{
				  alert(data.b)
					return false;
				}
				
				}	
				},
				error : function(XMLResponse) {
					alert("购物车添加成功！")
				}

			})

		});
	});
</script>
	</head>
	<style>
	td{
	border: silver 1px;
	}
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
  #bg{ display: none;  position: absolute;
           top: 0%;  left: 0%;  width: 100%;  height: 100%; 
            background-color:white;  z-index:1001; 
             -moz-opacity: 0.7;  opacity:0.2;  filter: alpha(opacity=70);}
         #show{display: none;  position: absolute;  
         top: 25%;  left:45%;  width:300px;;  height:250px;  
         padding: 8px;  border: 8px solid #E8E9F7;  
         background-color: white;  z-index:1002;  overflow: auto;}
   #mysubmit span:hover{
  background-color: #bfcbd6; /* 背景色 */
	color:red; /* 文字颜色 */
	text-decoration:underline; /* 不显示超链接下划线 */
   
   }
 #mysubmit :visited {
	background-color: #465c71; /* 背景色 */
	border: 1px #4e667d solid; /* 边框 */
	color: red; /* 文字颜色 */
}
</style>

	<body style="width: 100%;margin-right:0;margin: 0;overflow-x: hidden">
		<jsp:include page="/frameTop.jsp"></jsp:include>
	 <div id="bg"></div>
     <div id="show" style="overflow-x: hidden">
             <form name="form" method="post" action="LoginAction.do" 
  onsubmit="return checkEmpty(form)">
  <div align="center" >
 用户名: <s:textfield name="userEntity.name"  /><br />
  密&nbsp;&nbsp;码:<s:password name="userEntity.password"  /><br />
  <div id="submit" style="margin-right: 100px;margin-top: 10px;">
  <s:submit src="goodsPicture/11.jpg" type="image"   />
  </div>
  <div style="padding-top: 5px;">
  <a id="rgister" href="userRegister.jsp" target="_blank">注册</a>&nbsp;&nbsp;
 <a id="findpassword"  href="userpasswordFind1.jsp" target="_blank">忘记密码</a>
 </div>
  </div>
  </form>
<div style="margin-top:-125px;padding-left:290px;">
    <img alt="" src="goodsPicture/tip.jpg" onclick="hidediv();">
    </div>
     </div>
  
		<table style="width: 100%;" border="1" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="20%" valign="top" bgcolor="#F5F5F5">
					<!-- 页面左侧 -->
					<jsp:include page="/frameLeft.jsp"></jsp:include>
				</td>
				<td width="80%" align="center" valign="top" bgcolor="#FFFFFF">
				<table cellspacing="0" border="1">
  <tr>
  <td colspan="8" align="center">我的订单</td>
  </tr>
  <tr bgcolor="gray">
  <td>订单编号</td>
  <td>商品名称</td>
  <td>订货时间</td>
  <td>数量</td>
  <td>价格(￥)</td>
  <td>是否发货</td>
  <td>&nbsp;&nbsp;&nbsp;&nbsp;操作</td>
  </tr>
    <c:forEach items="${list1}" var="goods" varStatus="vs">
    <tr>
    <td >${goods.orderNumber}</td>
    <td>${goods.goodsName}</td>
    <td>${goods.dateTime }</td>
    <td align="center">${goods.number}</td>
    <td align="center">${goods.price}</td>
    <td align="center">${goods.sign}</td>
    <td>&nbsp;<a href="userdeleteorderList.do?orderId=${goods.orderNumber}">删除</a>&nbsp;|&nbsp;<a href="">详细信息</a></td>
    </tr>
    <tr bgcolor="gray">
    <td colspan="8" height="20"></td>
    </tr>
    </c:forEach>
    </table>
				</td>
			</tr>
		</table>
	<jsp:include page="/frameBottom.jsp" flush="true" />
	</body>
</html>
