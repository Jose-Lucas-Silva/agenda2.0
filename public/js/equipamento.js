
var app = angular.module("MyApp", []);

app.controller('myCtrl', ['$scope', '$http', function($scope, $http) {
	
  //$scope.users;
  var baseUrl = 'http://localhost:8080/equipamento';
  
  function listarTodos(){
	  $http.get(baseUrl).then(function(response) {
	//    $scope.myWelcome = response.data._embedded.equipamento;
		$scope.myWelcome = response.data;
		// limpa os dados do formulario
			$scope.taskName="";
	        $scope.taskDesc="";
	  }, function(err) {
	    console.log(err);
	  });
	  
  }
  listarTodos();
  
//add a new task
  var urlBase="http://localhost:8080";

  $scope.addTask = function addTask() {
   //if($scope.descricao=="" || $scope.status==""){
   // alert("Insufficient Data! Please provide values for task name, description, priortiy and status");
   //}
   //else{
    $http.post(urlBase + '/equipamento', {
              descricao: $scope.taskDesc,
              status: $scope.taskName
          }).
     success(function(data, status, headers) {
     alert("Salvo com sucesso");
              var newTaskUri = headers()["location"];
              console.log("Seu equipamento " + $scope.taskDesc + " foi adicionado(a) com sucesso. "+ newTaskUri);
              listarTodos();
       });
   //}
  };
  
//HTTP DELETE- delete employee by Id
  $scope.removeEmployee = function(equipamento) {
  $http({
	    method : "DELETE",
	    url : "http://localhost:8080/equipamento/" + equipamento.id
	}).then( _success, _error );
  };
  
}]);

