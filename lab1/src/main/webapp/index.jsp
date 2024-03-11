<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Lab1</title>
</head>
<body>
    <h1>
        WELCOME
    </h1>
    <br>
    <h1>
        <a href="form-jsp.html">Go to form ?</a><br>
        <a href="items.html">Go to item list ?</a>
    </h1>

    <h1>
        <a href="ReadCookie">Read your cookies ?</a><br>
        <a href="VisitCounter">Look at your visit counter ?</a>
        <form action="ReadCookie" method="post">
            <button type="submit" name="reset">Reset cookies ?</button>
        </form>
    </h1>
    <!--
<h1>
    <a href="hello-servlet">Hello Servlet</a>
</h1>
-->
</body>
</html>