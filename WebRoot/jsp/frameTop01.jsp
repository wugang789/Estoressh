<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.mycompany.entity.UserEntity"%>
<%@page import="sun.print.resources.serviceui_ko"%>
<%@page import="java.util.logging.SimpleFormatter"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
		window.onload=function (){
 var t=setInterval("show()",2000);
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
		</script>
		
<title>首页</title>
<link rel="stylesheet" type="text/css" href="../js/sooperfish.css" media="screen">
		<link rel="stylesheet" type="text/css" href="../js/sooperfish-theme-large.css" media="screen">
		<script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>
		<script type="text/javascript" src="../js/jquery.easing-sooper.js"></script>
		<script type="text/javascript" src="../js/jquery.sooperfish.js"></script>
    
    <script type="text/javascript">
    $(document).ready(function() {
      $('ul.sf-menu').sooperfish();
    });
    </script>
    
	</head>
<body>

  <div id="logintips">
			<div style="margin-top:-10px;margin-left:1000px;position:absolute; ">
					<%
						if (session.getAttribute("username") != null) {
					%>
				 <div style="margin-top:10px; margin-bottom: -15px;">
					<font size="2" color="black">欢迎您,<a
						href="/Estoressh/jsp/personDetail.jsp">${username}</a>
						<a href="LoginOut.do">退出</a>
						<a href="/Estoressh/jsp/shoppingCart.jsp" >我的购物车<span id="cartnum" style="color: red"></span>件</a>
						 </font>
				   </div>
						
					<%
						} else {
					%>
                   <div style="margin-top: 10px;">
                   <div style="">
					<font size="2" >请<a
						href=" Login.jsp" target="_blank">登录</a>|<a href="userRegister.jsp" target="_blank">
						注册</a> </font>
						<a href="/Estoressh/jsp/shoppingCart.jsp" >我的购物车<span id="cartnum" style="color: red"></span>件</a>
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
          <a href="#aa">All fruits with drawings and photos</a>
        </li>
        <li class="current">
          <a href="#ab">Red Fruits</a>
          <ul>
            <li class="current"><a href="#">Red Apples</a></li>
            <li><a href="#aba">Red Grapes</a></li>
            <li><a href="#abc">Cherries</a></li>
            <li><a href="#abb">Strawberries</a>
              <ul>
                <li class="current"><a href="#">Dutch Strawberries</a></li>
                <li><a href="#aba">French Strawberries</a></li>
                <li><a href="#abb">German Strawberries</a></li>
                <li><a href="#abc">American Strawberries</a></li>
                <li><a href="#abd">Scandinavian Strawberries</a></li>
              </ul>
            </li>
            <li><a href="#abd">Berries</a></li>
            <li><a href="#abd">Cherry Tomatoes</a></li>
          </ul>
        </li>
        <li>
          <a href="#">Yellow Fruits</a>
          <ul>
            <li><a href="#">Bananas</a></li>
            <li><a href="#">Lemons</a></li>
            <li><a href="#">Mangos</a></li>
            <li><a href="#">Dragon Fruit</a></li>
            <li><a href="#">Tangerine</a></li>
          </ul>
        </li>
        <li>
          <a href="#">Green Fruits</a>
          <ul>
            <li><a href="#">Green apples</a></li>
            <li><a href="#">Kiwis</a></li>
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
          <a href="#">Things</a>
          <ul>
            <li><a href="#">Red things</a></li>
            <li><a href="#">Blue things</a></li>
            <li><a href="#">Green things</a></li>
            <li><a href="#">Yellow things</a></li>
            <li><a href="#">Black things</a></li>
          </ul>
        </li>
        <li><a href="#">Stuff</a></li>
        <li>
          <a href="#">Others</a>
          <ul>
            <li><a href="#">Really white others</a></li>
            <li><a href="#">Broken white others</a></li>
            <li><a href="#">Silver others</a></li>
            <li><a href="#">Grey others</a></li>
            <li><a href="#">Ash others</a></li>
            <li><a href="#">Anthracite others</a></li>
            <li><a href="#">Really black others</a></li>
            <li><a href="#">Galactic void others</a></li>
          </ul>
        </li>
        <li>
          <a href="#">Misc</a>
          <ul>
            <li><a href="#">White others</a></li>
            <li><a href="#">Cyan others</a></li>
            <li><a href="#">Magenta others</a></li>
            <li><a href="#">Yellow others</a></li>
            <li><a href="#">Black others</a></li>
            <li><a href="#">White others</a></li>
            <li><a href="#">White others</a></li>
            <li><a href="#">White others</a></li>
          </ul>
        </li>
        <li><a href="#">Unique thing</a></li>
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
  <div style="width: 100px;height:80px;background-color:black;position: absolute;margin-left: 1180px;margin-top: 0px;">ss
  </div>
  <div style="width:50px;height:80px;background-color:black;position: absolute;margin-left:-10px;margin-top: 0px;">ss
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