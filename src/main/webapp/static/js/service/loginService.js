var myApp.services = angular.module('myApp.services',['restangular']);
myApp.services.factory('loginService', ['$scope', 'Restangular', function($scope, Restangular){
	var login = Restangular.All('login');
	var param = {
		username : $scope.username,
		password : $scope.password
	}
	return {
		doLogin : function() {
			return login.post(param);
		}
	};
}])