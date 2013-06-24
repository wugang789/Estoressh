<%@ page contentType="text/html" language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="/struts-tags" prefix="s" %>
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
		<script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
		<script language="javascript">
	function checkUser(username){
	var xmlHTTP;
   if(window.XMLHttpRequest){
    xmlHTTP=new XMLHttpRequest();
    }else{
    xmlHTTP=new ActiveObject("Microsoft.XMLHTTP");
    }
    
	if(document.getElementById("username").value!=""&&document.getElementById("username").value!=null){
    xmlHTTP.open("post","finduserexist.do?username="+username,true);
    xmlHTTP.send();
    xmlHTTP.onreadystatechange=ready;
   }
   
   function ready(){
     if(xmlHTTP.status==200&&xmlHTTP.readyState==4){
     document.getElementById("errorusername").innerHTML=xmlHTTP.responseText;
    }
   }
   };
</script>
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
	<body style="width: 100%;margin-right:0;margin: 0;overflow-x: hidden">
<SCRIPT src="myjs/kf.js" type=text/javascript></SCRIPT>
		<jsp:include page="frameTop.jsp"></jsp:include>
		<table style="width: 100%;" border="1" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="20%" valign="top" bgcolor="#F5F5F5">
					<!-- 页面左侧 -->
					<jsp:include page="frameLeft.jsp"></jsp:include>
				</td>
				<td width="80%" align="center" valign="top" bgcolor="#FFFFFF">
					<!-- 页面右侧 -->
					<form action="register.do" name="userForm" method="post"
				>
		<div align="center" style="margin-left:280px;margin-right:240px;">
				<table width="100%" height="120" cellpadding="0" cellspacing="0" border="0">
					<tr>
						<td width="107" height="35">
							<div align="right">
								用户账号：
							</div>
						</td>
						<td width="163">
							<div align="left">
								<input type="text" name="userEntity.name" onblur="checkUser(this.value)" id="username"
								value="${user.name}"/>
								<span id="errorusername" style="color: red"></span>
							</div>
						</td>
						<td align="left">
						<s:fielderror cssStyle="color: red">
						<s:param>userEntity.name</s:param>
						</s:fielderror>
						</td>
					</tr>
					<tr>
						<td height="35">
							<div align="right">
								用户密码:
							</div>
						</td>
						<td>
							<div align="left">
								<input type="password" name="userEntity.password" value="${user.password}"/>
								<s:hidden name="userEntity.ismanager" value="0"></s:hidden>
								<s:hidden name="userEntity.isDelete" value="0"></s:hidden>
							</div>
						</td>
						<td>
						<s:fielderror cssStyle="color: red">
                    <s:param>userEntity.password</s:param>
                         </s:fielderror>
						</td>
					</tr>

					<tr>
						<td height="35">
							<div align="right">
								真实姓名:
							</div>
						</td>
						<td>
							<div align="left">
								<input type="text" name="userEntity.reallyname" value="${user.reallyname}"/> 
							</div>
						</td>
						<td>
						<s:fielderror cssStyle="color:red">
						<s:param>userEntity.reallyname</s:param>
						</s:fielderror>
						</td>
					</tr>
					<tr>
						<td height="35">
							<div align="right">
								  性别:
							</div>
						</td>
						<td>
							<div align="left">
								<input type="radio" name="userEntity.sex" value="男" checked="checked">男
								<input type="radio" name="userEntity.sex" value="女">女
							</div>
						</td>
					</tr>
					<tr>
						<td height="35">
							<div align="right">
								出生日期:
							</div>
						</td>
						<td>
							<div align="left">
								<input type="text" class="Wdate" onClick="WdatePicker()"  name="userEntity.age" value="${user.age}"/>
							</div>
						</td>
					</tr>
					<tr>
						<td height="35">
							<div align="right">
								职业:
							</div>
						</td>
						<td>
							<div align="left">
								<input type="text" name="userEntity.profession" value="${user.age}"/>
							</div>
						</td>
					</tr>
					<tr>
						<td height="35">
							<div align="right">
								Email地址:
							</div>
						</td>
						<td>
							<div align="left">
								<input type="text" name="userEntity.email" value="${user.email}"/>
							</div>
						</td>
						<td align="left" valign="left">
						<s:fielderror cssStyle="color:red">
						<s:param>userEntity.email</s:param>
						</s:fielderror>
						</td>
					</tr>
					<tr>
						<td align="left">
							<div align="right">
								找回密码问题:
							</div>
						</td>
						<td>
							<div align="left">
								<input type="text" name="userEntity.question" value="${user.question}" />
							</div>
						</td>
						<td>
						<s:fielderror cssStyle="color:red">
						<s:param>userEntity.question</s:param>
						</s:fielderror>
						</td>
					</tr>
					<tr>
						<td height="35">
							<div align="right">
								答案:
							</div>
						</td>
						<td>
							<div align="left">
								<input type="text" name="userEntity.result" value="${user.result}"/>
							</div>
						</td>
						<td>
						<s:fielderror cssStyle="color:red">
						<s:param>userEntity.result</s:param>
						</s:fielderror>
						</td>
					</tr>
				</table>
		</div>
		<br />
		<div align="center">
			<input type="image" src="goodsPicture/post.gif"
				width="51" height="20"  />
			&nbsp;&nbsp;
			<input type="image" onClick="javascript:userForm.reset()" src="goodsPicture/btn_reset.gif"
				width="51" height="20" />&nbsp;&nbsp;
			<input type="image" onClick="javascript:history.go(-1)" src="goodsPicture/back.jpg"
				width="51" height="20" />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</div>
		</form>
					</td>
						</tr>
					</table>
	<jsp:include page="frameBottom.jsp" flush="true" />
	</body>
</html>









