<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>股票实时行情</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript" src="jslib/jquery-easyui-1.4.4/jquery.min.js"></script>
<script type="text/javascript" src="jslib/jquery-easyui-1.4.4/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jslib/jquery-easyui-1.4.4/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="jslib/jquery-easyui-1.4.4/themes/default/easyui.css" type="text/css"></link>
<link rel="stylesheet" href="jslib/jquery-easyui-1.4.4/themes/icon.css" type="text/css"></link>
</head>
<script type="text/javascript">
$(function() {
	$.post({
		
	});
	$('#user_login_loginForm').form({
		url : '${pageContext.request.contextPath}/userAction!login.action',
		success : function(r) {
			var obj = jQuery.parseJSON(r);
			if (obj.success) {
				$('#user_login_loginDialog').dialog('close');
			}
			$.messager.show({
				title : '提示',
				msg : obj.msg
			});
		}
	});
	$('#user_login_loginForm input').bind('keyup', function(event) {/* 增加回车提交功能 */
		if (event.keyCode == '13') {
			$('#user_login_loginForm').submit();
		}
	});

	window.setTimeout(function() {
		$('#user_login_loginForm input[name=name]').focus();
	}, 0);
});
</script>
<body class="easyui-layout">
	<div data-options="region:'north',title:'north'" style="height:60px;"></div>
	<div data-options="region:'south',title:'south'" style="height:20px;"></div>
	<div data-options="region:'west',title:'west'" style="width:200px;"></div>
	<div data-options="region:'east',title:'east',split:true" style="width:200px;"></div>
	<div data-options="region:'center',title:'欢迎使用满月股票监控系统'" style="overflow: hidden;">
		<div id="stockInfo"></div>
	</div>
</body>
</html>
