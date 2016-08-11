

var loginModule = angular.module('loginModule',['ui.router', 'loginServiceModule', 'loginCtrlModule']);

loginModule.run(function($rootScope, $state, $stateParams) {
	$rootScope.$state = $state;
	$rootScope.$stateParams = $stateParams;
});


loginModule.config(function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.otherwise("/login");
	$stateProvider
		.state('/login', {
			url:'/login',
			views:{
				'':{templateUrl : 'login/tpls/login_tpl.html'}
			}
		})
	
		
})