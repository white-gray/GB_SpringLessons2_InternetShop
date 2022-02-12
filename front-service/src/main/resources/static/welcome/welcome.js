angular.module('market-front').controller('welcomeController', function ($scope, $http) {
    const contextPath = 'http://localhost:5555/recommendations/';

    $scope.MaxBuyed = function () {
        $http.get(contextPath + 'api/v1/maxbuyed5')
            .then(function (response) {
                $scope.ProductsPageMaxBuyed = response.data;
            });
    }

    $scope.MaxHitCart = function () {
        $http.get(contextPath + 'api/v1/maxhitcart5')
            .then(function (response) {
                $scope.ProductsPageMaxHitCart = response.data;
            });
    }
});