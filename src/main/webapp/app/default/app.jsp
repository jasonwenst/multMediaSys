<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<html>
<head>
	<title></title>

	
	<script type="text/javascript" src="<%=basePath %>static/js/framework/jquery.min.2.0.0.js"></script>
	<script type="text/javascript" src="<%=basePath %>/static/js/framework/bootstrap.js"></script>

	<script type="text/javascript" src="<%=basePath %>static/js/framework/angular-1.5.8.min.js"></script>
	<script type="text/javascript" src="<%=basePath %>static/js/framework/angular-ui-router.js"></script>
	<script type="text/javascript" src="<%=basePath %>static/js/framework/restangular.js"></script>
	<script type="text/javascript" src="<%=basePath %>static/js/framework/lodash/lodash.min.js"></script>

	<link rel="stylesheet" type="text/css" href="<%=basePath %>static/css/bootstrap.css">


	<script type="text/javascript" src="<%=basePath %>app/default/app.js"></script>
	<script type="text/javascript" src="<%=basePath %>app/default/controller/defaultCtrl.js"></script>
	<script type="text/javascript" src="<%=basePath %>app/default/service/defaultService.js"></script>

</head>
<body ng-app="defaultModule">
	<%@ include file="/app/default/tpls/header.html" %>
	<!-- <div ui-view></div> -->
</body>
</html>