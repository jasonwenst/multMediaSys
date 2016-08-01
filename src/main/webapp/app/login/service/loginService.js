angular.module('loginServiceModule', ['restangular'])
.factory('loginService', ['$rootScope', 'Restangular', function($rootScope, Restangular){
	var login = Restangular.all('mediasys/app/login');
	var isLogin =  Restangular.all('mediasys/app/login/isLogined');
	var factory = {};
//	var param = {
//		username : $rootScope.username,
//		password : $rootScope.password
//	}
	return {
		doLogin : function(param) {
			return login.post(param);
		},
	
		isLogin : function(param) {
			return isLogin.post(param);
		}
	};
	
//	this.doLogin = function() {
//		return login.post(param);
//	}
//	
//	return factory;
}])