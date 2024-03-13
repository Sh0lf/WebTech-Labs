$(document).ready(function() {
    $('#submit').click(function(event) {
        event.preventDefault();
        var login = $('#login').val();
        var pwd = $('#pwd').val();

        console.log("log: " + login);
        console.log("pwd: " + pwd)

        /*
        $.post("LoginServlet", {login: login, pwd: pwd}, function (response, status){
            if (response === 1 || response === "1" ) {
                $('#result').text('Login successful');
            } else {
                $('#result').text('Invalid login credentials');
            }
        }); */
        $.ajax({
            url: 'LoginServlet',
            method: 'POST',
            data: {
                login: login,
                pwd: pwd
            },
            success: function(response) {
                if (response === 1 || response === "1" ) {
                    $('#result').text('Login successful');
                } else {
                    $('#result').text('Invalid login credentials');
                }
            },
            error: function(xhr, status, error) {
                alert("Error : " + error);
            }
        });
    });
});