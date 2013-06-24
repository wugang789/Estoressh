<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <title>管理登陆</title>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 11pt;
	font-weight: bold;
}
-->
</style>
  <script type="text/javascript">  
    function changeValidateCode(obj) {  
           //获取当前的时间作为参数，无具体意义  
        var timenow = new Date().getTime();  
           //每次请求需要一个不同的参数，否则可能会返回同样的验证码  
        //这和浏览器的缓存机制有关系，也可以把页面设置为不缓存，这样就不用这个参数了。  
        obj.src="rand.do?d="+timenow;  
    }  
</script>
<script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>
		<script type="text/javascript">
	$(document).ready(function() {
		$("#mysubmit").click(function() {
				 var mytextvalue=document.getElementById("mynumber").value;
				 alert(mytextvalue);
			$.ajax( {
				url : "loginmanager.do",
				type : "post",
				dataType : "json",
				cache : false,
				async :false,
				data : {
					"userEntity.name" : name,
					"userEntity.password" :password,
					"mynumber" : mytextvalue
				},
				success:function(data) {
				alert("ss");
				if(data.a=="成功"){
				alert("登录成功！");
		      	window.location.href="/Estoressh/managerjsp/superadmin.html";
				alert("登录成功！");
				}else if(data.a=="超级管理员"){
				alert("登录成功！");
				window.location.href="/Estoressh/managerjsp/admin.html";
				alert("登录成功！");
				
				}else{
				alert(data.a);
				}
				},
				error:function(){
				alert("s");
				}
			});

		});
	});
</script> 
</head>

<body style="background-image:url(../images/admin_login_bg.gif); margin:0 auto; width:500px;">

<div style="background-image:url(../images/admin_login.png); width:500px; height:200px; margin-top:130px;">
  <form id="form1" name="form1" method="post" action="">
    <table width="500" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="250">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <td height="40"><div align="right" class="STYLE1">用户名：</div></td>
        <td height="40" colspan="2"><input type="text" name="userEntity.password" style="height:25px; width:200px; font-size:15pt; font-weight:bold;" id="myname"/>
        <span id="mynametext"></span>
        </td>
      </tr>
      <tr>
        <td height="40"><div align="right" class="STYLE1">密&nbsp; 码：</div></td>
        <td height="40" colspan="2"><input type="password" name="userEntity.name" style="height:25px; width:200px; font-size:15pt; font-weight:bold;" id="mypassword" /></td>
      </tr>
      <tr>
        <td height="40"><div align="right" class="STYLE1">验证码：</div></td>
        <td width="100" height="40"><input type="text" name="textfield3" style="height:25px; width:85px; font-size:15pt; font-weight:bold;" id="mynumber" /></td>
        <td width="150"><img src="rand.do" onclick="changeValidateCode(this)"/></td>
      </tr>
      <tr>
        <td height="40">&nbsp;</td>
        <td height="40" colspan="2"><input type="image" value="" style="width:130px; height:30px; background-image:url(../images/admin_login_button.png); border:0; background-color: transparent; "
          id="mysubmit" /></td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>