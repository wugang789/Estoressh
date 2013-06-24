<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'frameLeft.jsp' starting page</title>
		<script language="JavaScript">
  function checkEmpty(form){
    for(i=0;i<form.length;i++){
   if(form.elements[i].value==""){ 
   alert("表单信息部能为空！！")
   return false;
  }
  }
  }
   </script>
		<style type="text/css">
#currentprice {
	color: green;
	font-style: italic;
	font-size: large;
	color: red;
}
#originalpriceprice{
text-decoration:line-through;
color: red;
font-style: italic;
}
img {
	width: 160;
	height: 170;
	margin-left: 35px;
	padding-right: 38px;
	margin-top: -10px;
}

#allgoods {
    background-color:white;
	border: thin, 1px;
	margin-top: -15px;
	margin-left: -8px;
	margin-right: -0px;
}
#fuhu:hover{
    background-color:activeborder; /* 背景色 */
	text-decoration:underline; /* 不显示超链接下划线 */
    cursor:pointer;
    border: solid 1px;
    border-color: red;
	}
</style>
	</head>
	<body>
		<div id="allgoods">
			<div style="padding-top: 10px; padding-left: 40px;" id="fuhu">
			          <font style="font-style:normal;font-weight: bold;">夏季必备</font><br/>
                 <span><font size="2">防晒  晒后修复 美白   防水彩妆</font> </span>
			</div>
			 <div style="border: thin 1px;width: 230px;height:1px;background-color:#E3E3E3;margin-left: 20px;"></div>
			<div style="padding-top: 18px; padding-left:40px;" id="fuhu">
				<font style="font-style:normal;font-weight: bold;">面部护肤</font><br/>
                 <span><font size="2">护肤套装 乳液/面霜 面膜</font> </span>
			</div>
			 <div style="border: thin 1px;width: 230px;height:1px;background-color:#E3E3E3;margin-left: 20px;"></div>
			<div style="padding-top: 18px; padding-left:40px;" id="fuhu">
				<font style="font-style:normal;font-weight: bold;">时尚彩妆</font><br/>
                 <span><font size="2">BB霜 睫毛膏 隔离霜 唇膏</font> </span>
			</div>
			 <div style="border: thin 1px;width: 230px;height:1px;background-color:#E3E3E3;margin-left: 20px;"></div>
			<div style="padding-top: 18px; padding-left: 40px;" id="fuhu">
				<font style="font-style:normal;font-weight: bold;">经典香氛</font><br/>
                 <span><font size="2"> 女士香水 男士香水 中性香水 </font> </span>
			</div>
			 <div style="border: thin 1px;width: 230px;height:1px;background-color:#E3E3E3;margin-left: 20px;"></div>
			<div style="padding-top: 25px; padding-left: 40px;" id="fuhu">
				<font style="font-style:normal;font-weight: bold;">个人洗护</font><br/>
                 <span><font size="2"> 护发 洗发 卫生巾 洗护套装 </font> </span>
			</div>
			 <div style="border: thin 1px;width: 230px;height:1px;background-color:#E3E3E3;margin-left: 20px;"></div>
			<div style="padding-top: 20px; padding-left: 40px;" id="fuhu">
				<font style="font-style:normal;font-weight: bold;">假发/美妆工具</font><br/>
                 <span><font size="2"> 时尚假发 美妆工具 中老年假发 </font> </span>
			</div>
			 <div style="border: thin 1px;width: 230px;height:1px;background-color:#E3E3E3;margin-left: 20px;"></div>
			<div style="padding-top: 20px; padding-left: 40px;" id="fuhu">
				<font style="font-style:normal;font-weight: bold;">男士护肤</font><br/>
                 <span><font size="2"> 乳液/面霜 护肤套装 洁面 </font> </span>
			</div>
		</div>
		<div style="display: none;">
		   <ul>
		   <li>sss</li>
		   <li>sss</li>
		   <li>sss</li>
		   </ul>
		</div>
		<div style="background-color:teal;">
		<font size="4" style="font-style:italic" >特价商品>></font>
		</div>
		<marquee direction="up"  height="600" hspace="10" behavior="alternate" style="position: relative"
		loop="infinite" scrollamount="1" onmouseover='this.stop()' onmouseout='this.start()'>
		<div>
			<c:forEach items="${mylist2}" var="goods" varStatus="vs">
			<div style="margin-top: 20px;">
				<a href="finddetail.do?id=${goods.id}" target="_blank"> 
				<img src="${goods.picture}" /> </a>
				<a href="finddetail.do?id=${goods.id}" target="_blank"
					style="color: blue;">
						${goods.goodsname}
						<input type="hidden" value="${goods.id}" name="myvalue">
				</a>
				<span style="color: gray; font-size: small;">最近成交${goods.number}笔</span>
				<br />
				<span id="originalpriceprice">原价:<fmt:formatNumber value="${goods.originalprice}" pattern="####.0#" /><span
					style="color: gray; font-size: small">￥</span>
				</span>
				<span id="currentprice">现价:<fmt:formatNumber value="${goods.currentprice}" pattern="####.0#" /><span
					style="color: gray; font-size: small">￥</span>
				</span>
				</div>
				<div style="margin-left: 80px; margin-right: 100px; z-index: 10; background-color: yellow;">
					<div style="padding-top: 5px; padding-bottom: 2px; padding-left: 20px;">
						<font color="white" size="2"><a
							href="finddetail.do?id=${goods.id}" target="_blank">购买</a>
						</font>
					</div>
				</div>
		</c:forEach>
		</div>
		</marquee>
	</body>
</html>






