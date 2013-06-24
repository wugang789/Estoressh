<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
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
  #submit{
  margin-right: 550px;
   
  }
  </style>
  <body>
  <jsp:include page="frameTop.jsp" flush="true" />
     <form name="form" method="post" action="LoginAction.do">
  <s:fielderror></s:fielderror>
  <div align="center">
 用户名: <s:textfield name="userEntity.name"  />
 <span id="usererror" class="errorMeg"></span>  
 <br />
  密&nbsp;&nbsp;码:<s:password name="userEntity.password"  />
   <span id="pwderror" class="errorMeg"></span>  
  <br />
  <div id="submit">
  <s:submit src="goodsPicture/11.jpg" type="image"   />
  </div>
  <a id="rgister" href="userRegister.jsp">注册</a>&nbsp;&nbsp;
 <a id="findpassword"  href="userpasswordFind1.jsp">找回密码</a>
  </div>
  </form>
  <div style="padding-bottom: 300px;color: blue">
  </div>
  <jsp:include page="frameBottom.jsp" flush="true" />
  </body>
</html>
