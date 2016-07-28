var homeApp = angular.module("homeApp", []);


homeApp.run(function($rootScope, $state, $stateParams) {
	$rootScope.$state = $state;
	$rootScope.$stateParams = $stateParams;
});


homeApp.config(function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.otherwise("/home");
	$stateProvider
		.state('/home', {
			url:'/home',
			views:{
				'':{templateUrl : 'static/js/tpls/home_tpl.html'}
			}
		})
	
		
})