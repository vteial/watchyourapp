function testController($rootScope, $scope, $log, $http) {
	$rootScope.viewName = 'Test';

	$scope.mail = {
		message : ''
	};

	$scope.testMailService = function() {
		$http.get('/testMailService.groovy').success(function(response) {
			$scope.mail.message = response;
		}).error(function(error) {
			$log.error(error);
		});
	};
	$scope.urlFetch = {
		message : ''
	};

	$scope.testUrlFetchService = function() {
		$http.get('/testUrlFetchService.groovy').success(function(response) {
			$scope.urlFetch.message = response;
		}).error(function(error) {
			$log.error(error);
		});
	};

	$log.debug('testController...');
}
appControllers.controller('testController', testController);
