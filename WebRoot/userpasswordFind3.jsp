<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>找回密码</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:include page="frameTop.jsp" flush="true" />
		<p align="center">
			<strong>你当前的密码是：<font color="red">${password}</font> </strong>
		</p>
		<form onsubmit="return checkEmpty(form)" name="form" method="post"
			action="modifypw.do">
			<div align="center">
				请输入新的密码：
			</div>
			<div align="center">
				<s:password name="" id="password" />
			</div>
			<div align="center">
				确认密码：
			</div>
			<div align="center">
				<s:password name="userEntity.password" id="passwordOne" />
			</div>
			<br />
			<div align="center">
				<input type="image" class="input1" src="goodsPicture/post.gif"
					width="45" height="23">
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#" onClick=javascript:history.go(-1);><img
						src="goodsPicture/back.jpg">
				</a>
			</div>
		</form>
		<script language="javascript">
	function checkEmpty(form) {
		for (i = 0; i < form.length; i++) {
			if (form.elements[i].value == "") {
				alert("表单信息不能为空");
				return false;
			}
		}
		if (document.form.password.value != document.form.passwordOne.value) {
			window.alert("您两次输入的密码不一致，请从新输入");
			return false;
		}
	}
</script>
		<div style="padding-bottom: 280px; color: blue">
		</div>
		<jsp:include page="frameBottom.jsp" flush="true" />
	</body>
</html>





