<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
<STYLE type="text/css">
img {
	width: 180;
	height: 200;
	margin-left: 10px;
    padding-right: 38px;
    margin-top: -10px;
}
</STYLE>
	</head>
	<body>
		<s:form action="findgoodsunion.do" method="post">
			<div align="center" style="background-color: white;">
				<s:hidden name="anygoods" id="myanygoods"></s:hidden>
				<br>
				类别查询:
				<select id="change" onchange="selectvalue(this.value)">
					<option selected="selected">
						请选择类别
					</option>
					<option value="商品名称">
						商品名称
					</option>
					<option value="大类别">
						大类别
					</option>
					<option value="小类别">
						小类别
					</option>
				</select>
				
				<div style="margin-top: -25px; margin-right: 320px;">
					<s:textfield maxlength="20" name="textvalue" size="40">
				</s:textfield>
				</div><s:submit value="查询"></s:submit>
			</div>
		</s:form>

		<table  border="0"  align="center" 
						cellpadding="0" cellspacing="0" bordercolor="grey"
						 style="border-width:  0;">
						<tr>
		   					<c:forEach items="${goodsbigsmall}" var="findunion" varStatus="vs">
								<td >
								   <div style="float: left;">
									<img src="${findunion.picture}" />
									</div>
									<div >
									 商品名称:${findunion.goodsname}<br />
									是否是特价: ${findunion.discount}<br />
									  原始价格:
							<fmt:formatNumber value="${findunion.originalprice}"
								pattern="####.00" />
									库&nbsp;&nbsp;存:
							<fmt:formatNumber value="${findunion.stock}" pattern="####" />
							<br />
							                       邮&nbsp;&nbsp;费:
							<fmt:formatNumber value="${findunion.freight}" pattern="####.00" />
							</div>
								</td>
								<c:choose>
									<c:when test="${vs.count % 4 == 0 }">
										<tr>
											<td colspan="3" height="30"></td>
										</tr>
									</c:when>
								</c:choose>
							
						</c:forEach>
						</tr>
					</table>
	</body>
</html>
