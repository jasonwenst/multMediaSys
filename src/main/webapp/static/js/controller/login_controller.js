'use strict';

//App.controller("login_controller", )

var loginMoudle = angular.moudle("loginMoudle", []);

loginMoudle.controller('loginCtrl', ['$scope', '$resource', '$http', '$location', function($scope, $resource, $http, $location){
	var User = new User();	
	$scope.user.username = "";
	$scope.user.password = "";	
	var login = function() {
		
		var para = {
			username: $scope.user.username,
			password : $scope.user.password
		}
		var res = $http.post('/mediasys/login', para);

		res.success(function(data, status, headers, config)) {
			$location.path("index");
		}
		
		return def.promise;
	}
}])