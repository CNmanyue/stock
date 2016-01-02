<%@page import="java.io.PrintWriter"%>
<%@page import="my.tools.IPSeeker"%>
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
	<h1></h1>
	<h2>ip：${pageContext.request.remoteHost}</h2>
	<h2>userAgent:${pageContext.request.getHeader("User-Agent") }</h2>
	<table width="400px" border="1" cellpadding="1" cellspacing="1">

		<caption>学生成绩表</caption>

		<tr>
			<th>学号</th>
			<th>期中</th>
			<th>期末</th>
			<th>总评</th>
		</tr>

		<tr>
			<td>20094401</td>
			<td>80</td>
			<td>90</td>
			<td>100</td>
		</tr>

		<tr>
			<td>20094402</td>
			<td>70</td>
			<td>88</td>
			<td>95</td>
		</tr>

		<tr>
			<td>20094403</td>
			<td>90</td>
			<td>92</td>
			<td>90</td>
		</tr>

		<tr>
			<th>备注</th>
			<td colspan="3">所有学生考核合格</td>
		</tr>

	</table>
	<br>
	<!-- 	<img alt="合照" src="./img/bin0.jpg" /> -->
	<img alt="photo" src="./img/lyc01.jpg">
	<br />
	<!-- 	<img alt="ou" src="./img/psb.jpg"> -->
</body>
</html>
