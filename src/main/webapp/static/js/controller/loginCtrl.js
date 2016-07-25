var loginModule = angular.module('loginModule', ['restangular']);
loginModule.controller('loginCtrl', ['$scope', 'Restangular', '$location', '$state', function($scope, Restangular,$location, $state){
	$scope.user = {};
	$scope.loginResult = false;
	$scope.login = function() {
		console.log('login processed');
		var params = {
			username : $scope.user.username,
			password : $scope.user.password
		}
	
		console.log(params);
		var loginUrl = Restangular.all('/mediasys/login');
		loginUrl.post(params).then(function(obj) {
			console.log(obj);
			if(obj) {
				console.log('jump to home page');
				$location.path("/home");
				// $state.go('home');

			} else {
				$scope.loginResult = true;
			}
		});

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