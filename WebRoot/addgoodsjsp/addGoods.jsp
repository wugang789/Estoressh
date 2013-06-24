<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<script language="javascript" type="text/javascript" src="../My97DatePicker/WdatePicker.js"></script>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addGoods.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
    <script type="text/javascript">
  window.onload=function(){
  show("findsmalltype.do");
  show("findbigtypegoods.do");
  function show(url){
   var xmlHTTP;
 if(window.XMLHttpRequest){
    xmlHTTP=new XMLHttpRequest();
}else{
    xmlHTTP=new ActiveObject("Microsoft.XMLHTTP");
    }
     xmlHTTP.open("post",url,true);
    xmlHTTP.send();
    xmlHTTP.onreadystatechange=ready;
    function ready(){
     if(xmlHTTP.status==200&&xmlHTTP.readyState==4){
             
   }
   }
   }
  
   }
  function changebigid(value){
   document.getElementById("mybigid").value=value;
    var s=document.getElementById("mybigid").value;
  } 
   
  function changesmallid(value){
   document.getElementById("mysmallid").value=value;
    var s1=document.getElementById("mysmallid").value;
  }
  </script>
  <body>
  <div align="center" style="background-color:white;margin-left:300px;margin-right: 300px;">
   <div align="center">
   添加商品信息
   </div>  
    <s:form action="addgoodsmanager" method="post">
       <s:hidden name="goodsEntity.smallid" value="" id="mysmallid">
       </s:hidden>
     <s:hidden name="goodsEntity.bigid" value="" id="mybigid">
     </s:hidden>
     <s:hidden name="goodsEntity.number" value="0"></s:hidden>
   <div>
  商品所属大类：<select id="select" onchange="changebigid(this.value)">
           <option selected="selected">所属大类</option>
        <c:forEach var="maps" items="${map}">
         <option  value="${maps.key}" > 
           ${maps.value}
         </option>
        </c:forEach>
        </select>
            商品所属小类:<select id="select" onchange="changesmallid(this.value)">
            <option selected="selected">所属小类</option>
        <c:forEach var="map" items="${mymap}">
         <option  value="${map.key}" > 
           ${map.value}
         </option>
        </c:forEach>
        </select>
        </div>
        <div>
        <s:textfield name="goodsEntity.goodsname" label="商品名称"/>
        <s:textfield name="goodsEntity.goodsfrom" label="生产厂商" />
        <s:textfield name="goodsEntity.createtime" label="上架时间"  cssClass="Wdate" onclick="WdatePicker()" />
        <s:textfield name="goodsEntity.originalprice" label="商品原价(￥)"   />
        <s:textfield name="goodsEntity.currentprice" label="初始化特价(￥)" />
        <s:textfield name="goodsEntity.freight" label="运费(￥)" />
        <s:textfield name="goodsEntity.stock" label="库存(件)" />
        <s:file name="goodsEntity.picture" label="商品图片" />
        是否打折：<input type="radio" name="goodsEntity.discount" value="是">是
             <input type="radio" name="goodsEntity.discount" value="否" checked="checked"> 否 
        </div>
        <div>
        <s:textarea name="goodsEntity.introduce"  rows="5" cols="40" label="商品简介"/>
        </div>
        <div>
         <s:submit  value="确定"></s:submit>
        </div>
    </s:form>
     </div>
  </body>
</html>
