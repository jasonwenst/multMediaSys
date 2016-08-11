

var materialModule = angular.module('materialModule',['ui.router', 'loginServiceModule', 'loginCtrlModule']);

materialModule.run(function($rootScope, $state, $stateParams) {
	$rootScope.$state = $state;
	$rootScope.$stateParams = $stateParams;
});


materialModule.config(function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.otherwise("/default");
	$stateProvider
		.state('/default', {
			url:'/default',
			views:{
				'':{templateUrl : 'material/tpls/materialHome.html'}
			}
		})
})