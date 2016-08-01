<!DOCTYPE html >

<head>
	<title></title>
	 <meta charset="utf-8" >
	<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../../static/js/framework/angular-1.5.8.min.js"></script>
	<script type="text/javascript" src="../../static/js/framework/angular-ui-router.js"></script>
	<script type="text/javascript" src="../../static/js/framework/restangular.js"></script>
	<!-- <script type="text/javascript" src="framework/restangular.min.js"></script> -->
	<script type="text/javascript" src="../../static/js/framework/lodash/lodash.min.js"></script>

	<script type="text/javascript" src="app.js"></script>
	<script type="text/javascript" src="controller/materialCtrl.js"></script>
	<script type="text/javascript" src="service/materialService.js"></script>
	
</head>
<body ng-app="materialModule">
	<div ui-view></div>
</body>
</html>