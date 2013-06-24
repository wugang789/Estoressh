<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<script language="javascript" type="text/javascript"
			src="../My97DatePicker/WdatePicker.js"></script>
	</head>
	<style>
	div{
	margin-top: 10px;
	
	}
	</style>
	<body>
	<jsp:include page="frameTop01.jsp" flush="true" />
		<form action="register.do" name="userForm" method="post"
			onsubmit="checkEmpty(userForm)">
			<div align="center">

				<div>
					个人资料:亲爱的${username}
				</div>

				<c:forEach items="${userlist}" var="userdetail">
					<div>
						用户密码:<input type="password" name="userEntity.password"
							value="${userdetail.password}" />
					</div>
					<div>
						真实姓名:<input type="text" name="userEntity.reallyname" value="${userdetail.reallyname}"  />
					</div>
					<div>
					Email地址:<input type="text" name="userEntity.email"  value="${userdetail.email}"/>
					</div>
					<div>
						出生日期:<input type="text" class="Wdate" onClick=WdatePicker(); name="userEntity.age" value="${userdetail.age}"/>
					</div>
					<div>
					<div style="margin-left: 30px;">
						职业:<input type="text" name="userEntity.profession" value="${userdetail.profession}" />
					</div> 
					</div>
					<div>
					性别:
			     <c:choose>
						<c:when test="${userdetail.sex=='男'}">
						<input type="radio" name="userEntity.sex" value="男" checked="checked">
						男
						<input type="radio" name="userEntity.sex" value="女">
						女
						</c:when>
						<c:otherwise>
						<input type="radio" name="userEntity.sex" value="男">
						男
						<input type="radio" name="userEntity.sex" value="女" checked="checked">
						女
						</c:otherwise>
						</c:choose> 
					</div>
				</c:forEach>
			</div>
			<br />
			<div style="margin-left: 600px;">
				<input type="image" class="input1" src="../goodsPicture/save.jpg"
					width="70" height="40" />
			</div>
		</form>
		<div style="padding-bottom: 150px; color: blue">
		</div>
		<jsp:include page="/frameBottom.jsp" flush="true" />
	</body>
</html>
