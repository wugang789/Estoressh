<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'GoodsDetailInfo.jsp' starting page</title>

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
			var price = document.getElementById("myorginal").value;
			var number = document.getElementById("numberText").value;
			var goodsname = document.getElementById("myname").value;
			var goodsId = document.getElementById("goodsid").value;
			$.ajax( {
				url : "createShoppingCart.do",
				type : "post",
				dataType : "json",
				cache : false,
				data : {
					"orderDetailEntity.price" : price,
					"orderDetailEntity.number" : number,
					"orderDetailEntity.goodsName" : goodsname,
					"orderDetailEntity.goodsId" : goodsId
				},
				success : function(data) {
					alert(data.a)
				},
				error : function(XMLResponse) {
					alert("购物车添加成功！")
				}

			})

		});
	});
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#immediatebuy").click(function() {
			var price = document.getElementById("myorginal").value;
			var number = document.getElementById("numberText").value;
			var goodsName = document.getElementById("myname").value;
			var goodsId = document.getElementById("goodsid").value;
			$.ajax( {
				url : "immediatelyBuyGoods.do",
				type : "post",
				dataType : "json",
				cache : false,
				data : {
					"orderDetailEntity.price" : price,
					"orderDetailEntity.number" : number,
					"orderDetailEntity.goodsName" : goodsName,
					"orderDetailEntity.goodsId" : goodsId
				},
				success : function(data) {
					if(data.a=="未登录"){
           document.getElementById("bg").style.display = "block";
              document.getElementById("show").style.display = "block";
					}else{
					window.location.href="/Estoressh/jsp/shoppingCart.jsp";
					}
				},
				error : function(XMLResponse) {
					//alert(XMLResponse.responseText)
					window.location.href="/Estoressh/jsp/shoppingCart.jsp";
				}

			})

		});
	});
</script>

		<script type="text/javascript">
	function addTextValue() {
		var mystockvalue = document.getElementById("mystock").value;
		var number = document.getElementById("numberText").value;
		if (number == mystockvalue) {
			document.getElementById("mytips").innerHTML = "购买的物品超过了库存！";
		}
		document.getElementById("numberText").value = parseInt(number) + 1;
	}
	function reduceTextValue() {
		var num = document.getElementById("numberText").value;
		if (num == 0) {
			document.getElementById("mytips").innerHTML = "请选择正确的购买数量！";
			document.getElementById("numberText").value = 1;
		} else {
			document.getElementById("numberText").value = parseInt(num) - 1;
		}

	}
	function check() {
		var num = document.getElementById("numberText").value;
		if (num < 0) {
			document.getElementById("mytips").innerHTML = "请选择正确的购买数量！";
			document.getElementById("numberText").value = 1;
		}
	}

</script>
<script>
function checkuserexist(){
 var xmlHTTP;
 if(window.XMLHttpRequest){
    xmlHTTP=new XMLHttpRequest();
}else{
    xmlHTTP=new ActiveObject("Microsoft.XMLHTTP");
    }
    xmlHTTP.open("post","finduserexist.do?username="+username,true);
    xmlHTTP.send();
    xmlHTTP.onreadystatechange=ready;
    function ready(){
     if(xmlHTTP.status==200&&xmlHTTP.readyState==4){
     document.getElementById("errorusername").innerHTML=xmlHTTP.responseText;
    }
    
   }
}
 function hidediv() {
             document.getElementById("bg").style.display = 'none';
             document.getElementById("show").style.display = 'none';
         }
</script>
<style type="text/css">
  #bg{ display: none;  position: absolute;
           top: 0%;  left: 0%;  width: 100%;  height: 100%; 
            background-color:white;  z-index:1001; 
             -moz-opacity: 0.7;  opacity:0.2;  filter: alpha(opacity=70);}
         #show{display: none;  position: absolute;  
         top: 25%;  left:45%;  width:300px;;  height:250px;  
         padding: 8px;  border: 8px solid #E8E9F7;  
         background-color: white;  z-index:1002;  overflow: auto;}
</style>
	</head>

	<body style="overflow-x: hidden">
		<jsp:include page="../frameTop.jsp" flush="true" />
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
     </div>
		<c:forEach var="goods" items="${list}">
			<div >
				<div style="margin-left: 400px;">
					<div>
						${goods.goodsname}&nbsp;&nbsp;${goods.introduce}
					</div>

					<div>
						<img src="${goods.picture}" align="top"
							style="border: #F00 1px solid" />
					</div>
					<div style="margin-top: -280px; margin-left: 320px;">
						运费:
						<fmt:formatNumber value="${goods.freight}" pattern="####.0#" />
						<span style="color: gray; font-size: small">￥</span>
					</div>
					<div style="margin-top: 10px; margin-left: 320px;">
						价格:
						<fmt:formatNumber value="${goods.originalprice}" pattern="####.0#" />
						<input type="hidden" value="${goods.originalprice}" id="myorginal">
						<span style="color: gray; font-size: small">￥</span>
					</div>
					<br />
					<div style="margin-top: 10px; margin-left: 320px;">
						数量:
						<input type="text" size="4" width="10" height="10" id="numberText"
							value="1" onblur="check()">
						<div style="margin-top: -25px; margin-left: 90px;">
							<img alt="" src="goodsPicture/button01.jpg"
								onclick=addTextValue();
								style="cursor: pointer">
							<br />
							<img alt="" src="goodsPicture/button02.jpg"
								onclick=reduceTextValue();
								style="cursor: pointer;">
							<div style="margin-left: 25px; margin-top: -20px;">
								<font style="color: gray;">(库存:${goods.stock})</font>
							</div>
						</div>
						<input type="hidden" id="mystock" value="${goods.stock}">
					</div>
					<input type="hidden" value="${goods.id}"
						name="orderDetailEntity.goodsId" id="goodsid" />
					<input type="hidden" value="${goods.goodsname}"
						name="orderDetailEntity.goodsName" id="myname" />
						
					<div id="mytips"
						style="margin-left: 320px; margin-top: 10px; color: red; background-color: yellow; margin-right: 365px;"></div>
					<div style="margin-left: 320px; margin-top: 120px;">
						<img src="goodsPicture/order002.jpg" style="cursor: pointer;"
							id="mysubmit">
						<img src="goodsPicture/order01.jpg" style="cursor: pointer;"
							id="immediatebuy">
					</div>
				</div>
			</div>
		</c:forEach>
		<div style="margin-top:210px; position: absolute;margin-left:-1px;width: 100%">
		<jsp:include page="/frameBottom.jsp" flush="true" />
		</div>
	</body>
</html>
