<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>股票监控系统</title>

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
	var dd;
	$(function() {
		dd = $('#dg').datagrid({
			url : '${pageContext.request.contextPath}/szallStock.action',
			queryParams:{
				'aaa':1,
				'bbb':18
			},
			title:'深圳股市',
			rownumbers:true,
			singleSelect:true,
			pagination:true,
			//fitColumns:true,
			fit : true,
			border : false,
			pagePosition:'both',
			pageNumber:1,
			pageSize:20,
			pageList:[20,40,60,80],
			loadMsg:'正在更新实时数据，请稍等...',
		    columns:[[
		        {field:'symbol',title:'代码',width:100},
		        {field:'name',title:'名称',width:100},
		        {field:'trade',title:'最新价',width:50,align:'right'},
		        {field:'pricechange',title:'涨跌额',width:50,align:'right'},
		        {field:'changepercent',title:'涨跌幅',width:50,align:'right'},
		        {field:'buy',title:'买入',width:50,align:'right'},
		        {field:'sell',title:'卖出',width:50,align:'right'},
		        {field:'settlement',title:'昨收',width:50,align:'right'},
		        {field:'open',title:'今开',width:50,align:'right'},
		        {field:'high',title:'最高',width:50,align:'right'},
		        {field:'low',title:'最低',width:50,align:'right'},
		        {field:'volume',title:'成交量',width:100,align:'right'},
		        {field:'amount',title:'成交额',width:100,align:'right'},
		        {field:'ticktime',title:'时间',width:80,align:'right'}
		    ]]
		});	
		setInterval(refreshStockDg,60000);// 注意函数名没有引号和括弧！
	});
	
	/* 刷新股票面板数据*/
	function refreshStockDg(){
		dd.datagrid('reload',{});
	}
</script>
<body class="easyui-layout">
<!-- 	<div data-options="region:'north',title:'north'" style="height:60px;"></div> -->
<!-- 	<div data-options="region:'south',title:'south'" style="height:20px;"></div> -->
	<div data-options="region:'west',title:'个人中心'" style="width:200px;"></div>
<!-- 	<div data-options="region:'east',title:'east',split:true" style="width:200px;"></div> -->
	<div data-options="region:'center',title:'欢迎使用满月股票监控系统'" style="overflow: hidden;">
		<table id="dg"></table>
	</div>
</body>
</html>
