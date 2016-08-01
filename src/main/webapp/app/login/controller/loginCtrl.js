var loginCtrlModule = angular.module('loginCtrlModule', []);
loginCtrlModule.controller('loginCtrl', ['$scope', '$location', '$state', 'loginService', function($scope, $location, $state, loginService){
	
//	loginService.isLogin(para).then(function(obj) {
//		console.log(obj);
//		if(obj) {
//			console.log('jump to home page!');
//			$location.path("/home");
//		} 
//	})
	
	
	$scope.user = {};
	$scope.loginResult = false;
	$scope.login = function() {
		console.log('login processed');
		var param = {
			username : $scope.user.username,
			password : $scope.user.password
		}
	
		console.log(param);
	//	var loginUrl = Restangular.all('/mediasys/app/login');
		loginService.doLogin(param).then(function(obj) {
	//	loginUrl.post(params).then(function(obj) {	
		console.log(obj);
		if(obj) {
			console.log('jump to home page!!');
			$location.path("/home");
			// $state.go('home');

		} else {
			$scope.loginResult = true;
		}
	});
	
	$scope.toMaterial = function() {
		console.log("turn to app/material/default");
		$state.go("app/material/default");
	}

	}
}])

// var loginModule = angular.module('loginModule',[]);
// loginModule.controller('loginCtrl', ['$scope', '$http', function($scope, $http){
// 	$scope.user = {
// 		username : 'ddddd'
// 	};
	

// 	$scope.login = function() {
		
// 	}
// }
	
// }])

// loginModule.controller('loginCtrl', ['$scope', '$http', function($scope, $http){
// 	$scope.user = {
// 		username : 'ddddd'
// 	};

// 	$scope.login = function() {
// 		console.log('login processed!');
// 		$scope.user.username = 'dddrrrd';
// 	}
// }])