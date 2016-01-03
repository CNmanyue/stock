<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>股票监控系统</title>
<jsp:include page="/js.jsp"></jsp:include>
<body class="easyui-layout">
	<!-- 	<div data-options="region:'north',title:'north'" style="height:60px;"></div> -->
	<!-- copyright © -->
	<div data-options="region:'south',split:false,border:false" style="height: 20px;">
		<div align="center">
			<span style="color: blue;">推荐放大浏览器窗口使用</span>&copy;&nbsp;Manyue 2016 联系方式：0735-7512952 地址：战争学院0999号
		</div>
	</div>
	<div data-options="region:'west',title:'个人中心'" style="width:200px;">
		<ul id="menu"></ul>
	</div>
	<!-- 	<div data-options="region:'east',title:'east',split:true" style="width:200px;"></div> -->
	<div data-options="region:'center',title:'操作面板'" style="overflow: hidden;">
		<div id="centerTabs" class="easyui-tabs" data-options="fit:true,border:false">
			<div title="欢迎使用满月股票监控系统" style="overflow: hidden;">
<!-- 				<div id="p" class="easyui-panel" style="background: #fafafa;" data-options="title:'满月股票监控系统',border:false,fit:true"> -->
<!-- 					<img alt="首页" src="${pageContext.request.contextPath }/material/pic/Tulips.jpg"> -->
<!-- 				</div> -->
					<jsp:include page="szall.jsp"></jsp:include>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	var menu;
	var centerTabs;
	$(function(){
		menu = $('#menu').tree({
		    url:'${pageContext.request.contextPath}/stock/tree_data2.json',
			lines : true,
			onClick : function(node) {
				if (node.attributes.url != null && node.attributes.url != "") {
					addTab(node);
				}
			},
			onDblClick : function(node) {
				if (node.state == 'closed') {
					$(this).tree('expand', node.target);
				} else {
					$(this).tree('collapse', node.targer);
				}
			}
		});
		centerTabs = $('#centerTabs');
		
	});
	/*tree 和 tabs 的联合*/
	function addTab(node) {
		if (centerTabs.tabs('exists', node.text)) {//如果 已经存在这个tab
			centerTabs.tabs('select', node.text);
		} else { //如果不存在这个tab
			if (node.attributes.url && node.attributes.url.length > 0) {
				//如果这个节点的属性中url有值
				/* $.messager.progress({
					text:'页面加载中.....',
					interval:100
				}); */
				centerTabs.tabs('add', {
					title : node.text,
					closable : true,
					content : '<iframe src="' + node.attributes.url + '" frameborder="0" style="border:0;width:100%;height:99.4%;" ></iframe>',
					tools : [ {
						iconCls : 'icon-mini-refresh',
						handler : function() {
							refreshTab(node.text);
						}
					} ]
				});
			} else { //如果没有url属性，或者url属性没有值
				centerTabs.tabs('add', {
					title : node.text,
					closable : true,
					//展示失败页面！
					content : '<iframe src="error/err.jsp" framebordre="0" style="border:0;width:100%;height:99.4%;"></iframe>',
					tools : [ {
						iconCls : 'icon-mini-refresh',
						handler : function() {
							refreshTab(node.text);
						}
					} ]
				});
			}
		}
	}
	function refreshTab(title) {
		var tab = centerTabs.tabs('getTab', title);
		centerTabs.tabs('update', {
			tab : tab,
			options : tab.panel('options')
		});
	}
</script>
</html>
