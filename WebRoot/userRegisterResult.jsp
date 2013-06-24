<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body style="height: 600">
<jsp:include page="frameTop.jsp" flush="true" />
							   恭喜您，注册成功！
         你的账号是：${userlist.name};
          密码是：${userlist.password};
    <meta http-equiv="refresh" content="URL=/Estoressh/Login.jsp">
    <jsp:include page="frameBottom.jsp" flush="true" />
</body>
</html>