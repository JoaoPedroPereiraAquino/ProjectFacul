angular.module('crudApp', [])
  .controller('MainCtrl', ['$scope', '$http', function($scope, $http) {
    const apiUrl = 'http://localhost:8080/api/books';
    $scope.books = [];
    $scope.newBook = {};

    function loadBooks() {
      $http.get(apiUrl).then(response => {
        $scope.books = response.data;
      });
    }
    loadBooks();

    $scope.addBook = function() {
      $http.post(apiUrl, $scope.newBook).then(() => {
        $scope.newBook = {};
        loadBooks();
      });
    };

    $scope.editBook = function(book) {
      book.editing = true;
    };

    $scope.updateBook = function(book) {
      $http.put(`${apiUrl}/${book.id}`, book).then(() => {
        book.editing = false;
      });
    };

    $scope.deleteBook = function(book) {
      $http.delete(`${apiUrl}/${book.id}`).then(() => {
        loadBooks();
      });
    };
  }]);
