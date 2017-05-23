/*
var app = angular.module('MyApp', []);

app.controller('myCtrl', function($scope, $http) {
    $http.jsonp("http://localhost:8080/equipamento")
    	.then(function (response) {
    		$scope.myWelcome = response.data;
    	});
	});



var members = [
            { username: 'SheoNarayan', address: 'Hyderabad' },
            { username: 'Munna', address: 'Bokaro' },
            { username: 'Jay', address: 'Aurangabad' },
            { username: 'Sreeni', address: 'New York' }
    ];

    var app = angular.module("MyApp", []);
    app.controller("myCtrl", ["$scope", function ($scope) {
        $scope.myWelcome = members;
    }]);
    
*/
var app = angular.module("MyApp", []);

app.controller('myCtrl', ['$scope', '$http', function($scope, $http) {
  $scope.users;
  var baseUrl = 'http://localhost:8080/equipamento';

  $http.get(baseUrl).then(function(response) {
    $scope.myWelcome = response.data;
  }, function(err) {
    console.log(err);
  });
}]);