<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.mycompany.entity.UserEntity"%>
<%@page import="sun.print.resources.serviceui_ko"%>
<%@page import="java.util.logging.SimpleFormatter"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
		window.onload=function (){
  var t=setInterval("show(),ss()",2000);
		}
		function show(){		
		var xmlHTTP;
  if(window.XMLHttpRequest){
    xmlHTTP=new XMLHttpRequest();
  }else{
    xmlHTTP=new ActiveObject("Microsoft.XMLHTTP");
    }
   xmlHTTP.open("post","getCartNum.do",true);
    xmlHTTP.send();
    xmlHTTP.onreadystatechange=ready;
    function ready(){
     if(xmlHTTP.status==200&&xmlHTTP.readyState==4){
     document.getElementById("cartnum").innerHTML=xmlHTTP.responseText;
    }
    
   }
  }
	var curIndex = 0;
		var arr = new Array();
		arr[0] = "goodsPicture/picture1/1.jpg";
		arr[1] = "goodsPicture/picture1/2.jpg";
		arr[2] = "goodsPicture/picture1/3.jpg";
		arr[3] = "goodsPicture/picture1/4.jpg";
		arr[4] = "goodsPicture/picture1/5.jpg";
		function ss(){
			var obj = document.getElementById("obj");
			if (curIndex == arr.length - 1) {
				curIndex = 0;
			} else {
				curIndex += 1;
			}
			obj.src = arr[curIndex];
		}
		</script>
		
		<script type="text/javascript">
		function over(){
    document.getElementById("mygoodsid").style.display = 'block';
        }
        function out(){
    document.getElementById("mygoodsid").style.display = 'none';
        }
		</script>
		<script type="text/javascript"
			src="http://ajax.microsoft.com/ajax/jquery/jquery-1.4.min.js"></script>
		<script type="text/javascript">
	$(document).ready(function() {
		$("#mygoods").click(function() {
			$.ajax( {
				url : "findAlreaybuygoods.do",
				type : "post",
				dataType : "json",
				cache : false,
				data : {
				},
				success : function(data) {
				if(data.b=='未登录'){
				  window.location.href="/Estoressh/Login.jsp";
				}
				if(data.b=='登录'){
				window.location.href="/Estoressh/jsp/myOrderList.jsp";
				}	
				},
				error : function(XMLResponse) {
					alert("购物车添加成功！")
				}

			})

		});
	});
</script>
		
<title>首页</title>
<link rel="stylesheet" type="text/css" href="js/sooperfish.css" media="screen">
		<link rel="stylesheet" type="text/css" href="js/sooperfish-theme-large.css" media="screen">
		<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
		<script type="text/javascript" src="js/jquery.easing-sooper.js"></script>
		<script type="text/javascript" src="js/jquery.sooperfish.js"></script>
    
    <script type="text/javascript">
    $(document).ready(function() {
      $('ul.sf-menu').sooperfish();
    });
    </script>
	</head>
 <style>
div	#mygoods:hover{
    background-color: #bfcbd6; /* 背景色 */
	color:red; /* 文字颜色 */
	text-decoration:underline; /* 不显示超链接下划线 */
    cursor:pointer;
	}
div #mycity:hover{
background-color: #bfcbd6; /* 背景色 */
	color:red; /* 文字颜色 */
	text-decoration:underline; /* 不显示超链接下划线 */
    cursor:pointer;
  }	
</style>
<body>

  <div id="logintips">
			<div style="margin-top:-10px;margin-left: 950px;position:absolute; ">
					<%
						if (session.getAttribute("username") != null) {
					%>
				 <div style="margin-top:10px; margin-bottom: -15px;">
					<font size="2" color="black">欢迎您,<a
						href="/Estoressh/jsp/personDetail.jsp">${username}</a>
						<a href="LoginOut.do">退出</a>
						<a href="/Estoressh/jsp/shoppingCart.jsp" >我的购物车<span id="cartnum" style="color: red"></span>件</a>
						 </font>
						 <div style="margin-top: -15px;margin-left: 230px;" onmouseover="over()">
						 <font size="2" color="black" style="cursor: pointer;" id="mycity">|我的商城</font>
						 </div>
				   </div>
						
					<%
						} else {
					%>
                   <div style="margin-top: 10px;margin-left: 60px;">
                   <div style="">
					<font size="2" >请<a
						href=" Login.jsp" target="_blank">登录</a>|<a href="userRegister.jsp" target="_blank">
						注册|</a> </font>
						<a href="/Estoressh/jsp/shoppingCart.jsp" ><font size="2" color="black">我的购物车<span id="cartnum" style="color: red"></span>件</font></a>
						<div style="margin-top: -15px;margin-left: 180px;" onmouseover="over()">
						<font size="2" color="black" style="cursor: pointer;" id="mycity">|我的商城</font></div>
						</div>
					</div>
					<%
						}
					%>
					</div>
				</div>
				
				
<br>
  <ul class="sf-menu" id="nav">
    <li class="current">
      <a href="#a">男士专区</a>
      <ul>
        <li>
          <a href="#aa">JVR/杰威尔</a>
        </li>
        <li class="current">
          <a href="#ab">男士洁面</a>
          <ul>
            <li class="current"><a href="#">	
男士乳液/面霜</a></li>
            <li><a href="#aba">Red Grapes</a></li>
            <li><a href="#abc">Cherries</a></li>
            <li><a href="#abb">Strawberries</a>
              <ul>
                <li class="current"><a href="#">Dutch Strawberries</a></li>
               <li><a href="#">保湿</a></li>
            <li><a href="#">收缩毛孔</a></li>
            <li><a href="#">提拉紧致</a></li>
            <li><a href="#">美白</a></li>
                <li><a href="#abd">Scandinavian Strawberries</a></li>
              </ul>
            </li>
            <li><a href="#abd">Berries</a></li>
            <li><a href="#abd">Cherry Tomatoes</a></li>
          </ul>
        </li>
        <li>
          <a href="#">男士爽肤水</a>
          <ul>
           <li><a href="#">保湿</a></li>
            <li><a href="#">收缩毛孔</a></li>
            <li><a href="#">提拉紧致</a></li>
            <li><a href="#">美白</a></li>
            <li><a href="#">Tangerine</a></li>
          </ul>
        </li>
        <li>
          <a href="#">男士美白护肤品</a>
          <ul>
            <li><a href="#">碧欧泉</a></li>
            <li><a href="#">雅丽洁</a></li>
            <li><a href="#">Melons</a></li>
            <li><a href="#">Pears</a></li>
            <li><a href="#">Unripe bananas</a></li>
          </ul>
        </li>
      </ul>
    </li>
    <li>
      <a href="#">女士专区</a>
    </li>
    <li>
      <a href="#">品牌选择</a>
      <ul>
        <li>
          <a href="#">PROYA/珀莱雅</a>
          <ul>
            <li><a href="#">保湿</a></li>
            <li><a href="#">收缩毛孔</a></li>
            <li><a href="#">提拉紧致</a></li>
            <li><a href="#">美白</a></li>
            <li><a href="#">Black things</a></li>
          </ul>
        </li>
        <li><a href="#">相宜本草</a></li>
        <li>
          <a href="#">欧诗漫</a>
          <ul>
            <li><a href="#">保湿</a></li>
            <li><a href="#">收缩毛孔</a></li>
            <li><a href="#">提拉紧致</a></li>
            <li><a href="#">美白</a></li>
            <li><a href="#">Grey others</a></li>
          </ul>
        </li>
        <li>
          <a href="#">菲诗小铺</a>
          <ul>
            <li><a href="#">保湿</a></li>
            <li><a href="#">收缩毛孔</a></li>
            <li><a href="#">提拉紧致</a></li>
            <li><a href="#">美白</a></li>
            <li><a href="#">Black others</a></li>
          </ul>
        </li>
        <li><a href="#">雅诗兰黛</a></li>
      </ul>
    </li>
    <li>
      <a href="#">特价商品</a>
    </li>
    <li>
      <a href="#">新品上架</a>
    </li>
    <li>
      <a href="#">联系我们</a>
    </li>
    <li>
      <a href="#">首页</a>
    </li>	
  </ul>
   
  <div style="width: 100px;height:80px;background-color:black;position: absolute;margin-left: 1180px;">ss
  </div>
   <div style="width: 150px;height: 40px;background-color: white;position:absolute;z-index: 12px;
   margin-left:1170px;display: none;" id="mygoodsid" onmouseout="out();">
	 <div style="font-size:small;border-color: blue;border-bottom-width: medium;border" id="mygoods">已经买到的宝贝</div> 
	</div>
  <div style="width:50px;height:80px;background-color:black;position: absolute;margin-left:-10px;">ss
  </div>
  <form name="searchForm" method="post" action="SearchGoods.do"
				onsubmit="return checkEmpty(searchForm)" target="_blank">
		<div style="background-color: graytext; margin-left: -10px;position:relative;margin-top: 63px;"
			align="right">
				热门搜索：
				<a href=""><font size="2">欧莱雅</font>
				</a>&nbsp;
				<a href=""><font size="2">Dior</font>
				</a>&nbsp;&nbsp; 搜索商品名称: &nbsp;&nbsp;&nbsp;&nbsp;
				<input name="goodsName" type="text" size="30" align="left">
				<input type="submit" name="search" value="搜索" align="left" />
		</div>
		</form>
</body>
</html>