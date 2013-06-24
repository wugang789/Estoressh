<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
	<head>
		<title>找回密码</title>
	</head>
	<link href="css/css.css" rel="stylesheet" type="text/css">
	<script language="javascript">
function checkEmpty(form){
 for(int i=0;i<form.lenght;i++){
 if(form.elements[i].value==""){
  alert("表单信息不能为空");
  return false;
  }
  }
  }
</script>
	<body>
		<jsp:include page="frameTop.jsp" flush="true" />
					<form action="sureanswer.do" name="form" method="post"
						onSubmit="return checkEmpty(form)">
									<div align="center">
										问题:${question}
									</div>
									<div align="center">
										输入答案:<s:textfield name="result" />
									</div>
									<br />
							<div align="center">
						<input type="image" class="input1" src="goodsPicture/post.gif"
							width="45" height="23" />
						&nbsp;&nbsp;
						<a href="#" onClick="javascript:form.reset()"><img
								src="goodsPicture/btn_reset.gif" width="45" height="23" /> </a> &nbsp;&nbsp;
						<a href="#" onClick="javascript:history.go(-1)"><img
								src="goodsPicture/back.jpg" /></a>
								</div>
					</form>
		<div style="padding-bottom: 340px; color: blue">
		</div>
		<jsp:include page="frameBottom.jsp" flush="true" />
	</body>
</html>







