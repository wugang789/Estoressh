<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addSmalltype.jsp' starting page</title>
    
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
 var xmlHTTP;
 if(window.XMLHttpRequest){
    xmlHTTP=new XMLHttpRequest();
}else{
    xmlHTTP=new ActiveObject("Microsoft.XMLHTTP");
    }
    xmlHTTP.open("post","findbigtypegoods.do",true);
    xmlHTTP.send();
    xmlHTTP.onreadystatechange=ready;
    function ready(){
     if(xmlHTTP.status==200&&xmlHTTP.readyState==4){
             
   }
   }
   }
  function change(value){
     document.getElementById("bigsmall").value=value;
     var s=document.getElementById("bigsmall").value;
  }
  </script>
  
  <body>
  <div align="center">
   <h1>小类商品添加</h1>
     <s:form action="addSmalltype.do" method="post">
     <s:hidden name="smallType.bigid" value="" id="bigsmall">
     </s:hidden>
     所属大类: <select id="select" onchange="change(this.value)">
        <option selected="selected">请选择大类</option>
        <c:forEach var="maps" items="${map}">
         <option  value="${maps.key}" > 
           ${maps.value}
         </option>
        </c:forEach>
        </select>
     <s:textfield name="smallType.smallName" label="小类商品"></s:textfield>
       <s:submit value="添加" />
     </s:form>
</div>
  </body>
</html>
