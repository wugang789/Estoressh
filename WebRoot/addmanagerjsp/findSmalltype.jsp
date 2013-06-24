<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<SCRIPT type="text/javascript">
function selectvalue(value){
   document.getElementById("myanygoods").value=value;
    var s1=document.getElementById("myanygoods").value;
  }
</SCRIPT>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'findSmallOrbigtype.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <s:form action="findgoodsunion.do" method="post">
  <div align="center" style="background-color: white;"> 
  <s:hidden name="anygoods"  id="myanygoods"></s:hidden>
  <br>类别查询:<select id="change"  onchange="selectvalue(this.value)">
  <option selected="selected">请选择类别</option>
    <option value="商品名称" >商品名称</option>
  <option value="大类别"  >大类别</option>
    <option value="小类别" >小类别 </option>
  </select>
  <s:textfield maxlength="20" name="textvalue" size="40">
  </s:textfield>
  <div style="margin-top: -25px;margin-right: 320px;">
  <s:submit value="查询"></s:submit>
  </div>
  </div>
  </s:form>
  
   <div align="center" style="background-color: white;">
   <table border="1" cellspacing="0">
    <tr>
    <td>小类名称</td>
    </tr>
     <c:forEach var="findunion" items="${goodsbigsmall}">
    <tr>
    <td>${findunion.smallName}</td>
    </tr>
     </c:forEach>
      </table>
  </div>
  </body>
</html>
