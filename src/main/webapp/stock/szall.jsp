<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<script type="text/javascript">
	var dd;
	$(function() {
		dd = $('#dg').datagrid({
			url : '${pageContext.request.contextPath}/szallStock.action',
			queryParams : {
				'aaa' : 1,
				'bbb' : 18
			},
			title : '深圳股市',
			rownumbers : true,
			singleSelect : true,
			pagination : true,
			//fitColumns:true,
			fit : true,
			border : false,
			pagePosition : 'both',
			pageNumber : 1,
			pageSize : 20,
			pageList : [ 20, 40, 60, 80 ],
			loadMsg : '正在更新实时数据，请稍等...',
			columns : [ [ {
				field : 'symbol',
				title : '代码',
				width : 100
			}, {
				field : 'name',
				title : '名称',
				width : 100
			}, {
				field : 'trade',
				title : '最新价',
				width : 50,
				align : 'right'
			}, {
				field : 'pricechange',
				title : '涨跌额',
				width : 50,
				align : 'right'
			}, {
				field : 'changepercent',
				title : '涨跌幅',
				width : 50,
				align : 'right'
			}, {
				field : 'buy',
				title : '买入',
				width : 50,
				align : 'right'
			}, {
				field : 'sell',
				title : '卖出',
				width : 50,
				align : 'right'
			}, {
				field : 'settlement',
				title : '昨收',
				width : 50,
				align : 'right'
			}, {
				field : 'open',
				title : '今开',
				width : 50,
				align : 'right'
			}, {
				field : 'high',
				title : '最高',
				width : 50,
				align : 'right'
			}, {
				field : 'low',
				title : '最低',
				width : 50,
				align : 'right'
			}, {
				field : 'volume',
				title : '成交量',
				width : 100,
				align : 'right'
			}, {
				field : 'amount',
				title : '成交额',
				width : 100,
				align : 'right'
			}, {
				field : 'ticktime',
				title : '时间',
				width : 80,
				align : 'right'
			} ] ]
		});
		setInterval(refreshStockDg, 5 * 60 * 1000);// 注意函数名没有引号和括弧！
	});

	/* 刷新股票面板数据*/
	function refreshStockDg() {
		dd.datagrid('reload', {});
	}
</script>

<div id="layout_center_tabs" class="easyui-tabs" data-options="fit:true,border:false" style="overflow: hidden;">
	<table id="dg"></table>
</div>
