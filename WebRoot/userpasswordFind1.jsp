<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>找回密码</title>
	</head>
	<body>
			<jsp:include page="frameTop.jsp" />
			<form name="form" method="post" action="findpw.do"
				onSubmit="return checkEmpty(form)">
				            <div align="center">
							请输入用户账号：
							<s:textfield name="userEntity.name" id="username" />
							</div>
							<br />
							<div align="center">
							<input type="image" class="input1" src="goodsPicture/post.gif"
								width="45" height="23">
							&nbsp;&nbsp;
							<a href="#" onClick=javascript:form.reset();><img
								src="goodsPicture/btn_reset.gif" width="45" height="23"> &nbsp;&nbsp; </a>
							<a href="#" onClick=javascript:history.go(-1);><img
								src="goodsPicture/back.jpg"></a>
								</div>
			</form>
		<div style="padding-bottom: 370px; color: blue">
		</div>
		<jsp:include page="frameBottom.jsp" />
	</body>
</html>