$(document).ready(function() {
    var cities = [
        "Paris",
        "Hong Kong",
        "New York",
        "Los Angeles",
        "Chicago",
        "Shanghai",
        "Beijing",
        "Seoul",
        "Busan",
        "Osaka",
        "Tokyo",
        "Singapore"
    ];
    $("#cityInput").autocomplete({
        source: cities
    });
});