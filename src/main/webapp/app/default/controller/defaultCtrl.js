var defaultCtrlModule = angular.module('defaultCtrlModule', []);

defaultCtrlModule.controller('defaultCtrl','$rootScope' ['$scope','$rootScope', function($scope){
	
	$rootScope.module = 'show';

	$rootScope.activeClass2 = 'active';
	$rootScope.activeClass1 = '';
	$rootScope.activeClass3 = '';
	$rootScope.activeClass4 = '';
	$rootScope.activeClass5 = '';
	$rootScope.activeClass6 = '';
	
}])