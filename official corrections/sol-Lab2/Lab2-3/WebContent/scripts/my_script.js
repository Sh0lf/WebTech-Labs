/**
 * 
 */
$(document).ready(function() {
	$("#myButton").click(function(e){
		e.preventDefault();
        var login = $("input#login").val(); 
        var pass = $("input#pass").val(); 
		$.post("LoginServlet",{login : login,pass : pass} , function(response, status) {
			if (response==1)
				$('#error').text("*id ok");
				//alert("OK");
			else
				$('#error').text("*Wrong id");
				//alert("NOT OK");
			});
	});
});

/**
 * Another way to send form's data
 */
/*$(document).ready(function() {
	$("#myButton").click(function(e){
		e.preventDefault();
        var formData = $("#f1").serialize();
		$.post("LoginServlet",formData , function(response, status) {
			if (response==true)
				alert("ok");
			else
				alert("no");
			});
	});
});*/