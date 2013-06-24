<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<style>
div {
	margin-top: 10px;
}
</style>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'detailInfo.jsp' starting page</title>

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
		<div>
			<s:iterator value="%{#session.findgoodsbyid}" id="us">
				<div align="center" style="background-color: white;">
					<div>
						<font size="4">商品详细详细</font>
					</div>
					<div style="margin-left: -700px;">
						<img src="${us.picture}" />
					</div>
					<div style="margin-top: -310px;">
						<s:form action="modifygoodsinfo.do" method="post">
							<div>
								<s:hidden value="%{#us.id}" name="goodsEntity.id"></s:hidden>
								<s:textfield value="%{#us.goodsname}"
									name="goodsEntity.goodsname" readonly="true" label="商品名称" />
							</div>
							<div>
								<s:textfield value="%{#us.goodsfrom}"
									name="goodsEntity.goodsfrom" readonly="true" label="生成厂商" />
							</div>
							<div>
								<s:textfield value="%{#us.createtime}"
									name="goodsEntity.createtime" readonly="true" label="创建时间" />
							</div>
							<div>
								<s:textfield value="%{#us.originalprice}"
									name="goodsEntity.originalprice" label="原始价格" />
							</div>
							<div>
								<s:textfield value="%{#us.currentprice}"
									name="goodsEntity.currentprice" label="当前价格" />
							</div>
							<div>
								<s:textfield value="%{#us.number}" name="goodsEntity.number"
									readonly="true" label="卖出数量" />
							</div>
							<div>
								<s:textfield value="%{#us.discount}" name="goodsEntity.discount"
									label="是否折扣" />
							</div>
							<div>
								<s:textfield value="%{#us.freight}" name="goodsEntity.freight"
									label="邮 费 " />
							</div>
							<div>
								<s:textfield value="%{#us.stock}" name="goodsEntity.stock"
									label="库存" />
							</div>
							<div>
								<s:textarea value="%{#us.introduce}"
									name="goodsEntity.introduce" rows="5" cols="30" label="商品简介">
								</s:textarea>
							</div>
							<div>
								<s:submit value="确认修改" label="确认修改"></s:submit>
							</div>
						</s:form>
						<div style="margin-top: -45px; margin-left: -70px;">
							<input type="button" value="返回"
								onclick=javascript:history.go(-1);>
						</div>
					</div>
				</div>
			</s:iterator>
		</div>
	</body>
</html>
