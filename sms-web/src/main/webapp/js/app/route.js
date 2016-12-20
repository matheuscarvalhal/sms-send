app.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
                .when('/', {
                    templateUrl: '../../sms-web/view/home.html',
                    controller: 'smsController'
                })
                .otherwise({redirectTo: '/'});
    }]);