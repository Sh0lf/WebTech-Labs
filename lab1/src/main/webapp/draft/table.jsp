<%--
  Created by IntelliJ IDEA.
  User: vincentyap
  Date: 04/03/2024
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr><th>Field</th><th>Value</th></tr>
    <tr><td>First Name</td><td>request.getParameter("fname")</td></tr>
    <tr><td>Last Name</td><td>request.getParameter("lname")</td></tr>
    <tr><td>Birth date</td><td>request.getParameter("birthdate")</td></tr>
    <tr><td>Sex</td><td>request.getParameter("sex")</td></tr>
</table>
</body>
</html>
