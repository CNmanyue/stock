<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Good Evening!</title>
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
	<h1>Welcome to zhouxw.com/api</h1>
	<h2>ip：${pageContext.request.remoteHost}</h2>
	
    <ul>
    	<li><a href="${pageContext.request.contextPath}/stock/home.jsp">股票监控系统</a></li>
    	<li><a href="${pageContext.request.contextPath}/wow/index.html">可爱的程序员</a></li>
    </ul>
</body>
</html>
