/**
 * Created by Yaacov on 29/12/2015.
 */
app = angular.module("root", ["ui.router"]);
app.config(function($stateProvider, $urlRouterProvider) {
    //
    // For any unmatched url, redirect to /state1
    $urlRouterProvider.otherwise("/login");
    //
    // Now set up the states
    $stateProvider
        .state('Login', {
            url: "/login",
            templateUrl: "template/Login.html",
            controller : 'Login'
        })
        .state('Register', {
            url: "/register",
            templateUrl: "template/Register.html",
            controller : 'Register'
        })
        .state('Main', {
            url: "/main",
            templateUrl: "template/Main.html",
            controller : 'mainControl'
        });
});