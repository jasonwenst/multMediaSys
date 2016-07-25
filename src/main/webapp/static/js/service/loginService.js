var loginModule = angular.module('loginModule',['restangular']);
loginModule.factory('loginService', ['$scope', 'restangular', function($scope, Restangular){
	var login = Restangular.All('login');
	var param = {
		username : $scope.username,
		password : $scope.password
	}
	return function name(){
		doLogin : function() {
			login.post(param);
		}
	};
}])