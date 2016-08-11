

var defaultModule = angular.module('defaultModule',['ui.router', 'defaultCtrlModule']);

defaultModule.run(function($rootScope, $state, $stateParams) {
	$rootScope.$state = $state;
	$rootScope.$stateParams = $stateParams;
	$rootScope.activeClass2 = 'active';
	$rootScope.activeClass1 = '';
	$rootScope.activeClass3 = '';
	$rootScope.activeClass4 = '';
	$rootScope.activeClass5 = '';
	$rootScope.activeClass6 = '';
});


// defaultModule.config(function($stateProvider, $urlRouterProvider) {
// 	$urlRouterProvider.otherwise("/default");
// 	$stateProvider
// 		.state('/default', {
// 			url:'/default',
// 			views:{
// 				'':{templateUrl : 'default/tpls/home_tpl.html'}
// 			}
// 		})
	
		
// })