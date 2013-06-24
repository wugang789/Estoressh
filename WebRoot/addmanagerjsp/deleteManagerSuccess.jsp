<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   <script language='javascript' type='text/javascript'> 
var secs =2; //倒计时的秒数 
var URL ; 
function Load(url){ 
URL =url; 
for(var i=secs;i>=0;i--) 
{ 
window.setTimeout('doUpdate(' + i + ')', (secs-i) * 1000); 
} 
} 
function doUpdate(num) 
{ 
document.getElementById('ShowDiv').innerHTML = num; 
if(num == 0) { window.location=URL; } 
} 
</script> 
</head> 

<body> 
     <div style="text-align:center;font-size:16px">
      <b> 删除管理员成功！<span id="ShowDiv" style="color:red"></span> 秒后跳转到回到原页面!</b>
     </div>
<script language="javascript"> 
Load("findallmanager.do"); //要跳转到的页面 
</script> 
</body> 

</html>
