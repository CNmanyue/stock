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
<body>
	<div class="easyui-layout" data-options="fit:true">
		<div data-options="region:'center',title:'系统功能 &gt; 股票查询',border:false" style="background: #eee;">
			<div class="button_bar">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="doSearch('');">查询</a> 
<!-- 				<a class="easyui-linkbutton" data-options="iconCls:'icon-back',plain:true" onclick="back('');">返回</a>  -->
<!-- 				<a class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="saveCreate();">保存</a> -->
			</div>
			<form id="form1" method="post">
				<table class="query_form_table" id="table1">
					<tr>
						<th>股票类型</th>
						<td><input type="text" id="stockType" data-options="required:true,missingMessage:'种类不能为空'" /><span class="red_star">*</span></td>
						<th>股票代码</th>
						<td><input type="text" id="stockId" data-options="required:true,missingMessage:'股票代码不能为空'" /><span class="red_star">*</span></td>
						
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
<script type="text/javascript">
	function doSearch(){
		alert('doSearch');
	}
</script>
</html>
