

var myApp = angular.module('myApp',['ui.router', 'loginModule']);

myApp.run(function($rootScope, $state, $stateParams) {
	$rootScope.$state = $state;
	$rootScope.$stateParams = $stateParams;
});


myApp.config(function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.otherwise("/login");
	$stateProvider
		.state('/login', {
			url:'/login',
			views:{
				'':{templateUrl : 'tpls/login_tpl.html'}
			}
		})
		.state('/home', {
			url:'/home',
			views:{
				'':{templateUrl : 'tpls/home_tpl.html'}
			}
		})
		
})