<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: vincentyap
  Date: 10/03/2024
  Time: 00:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP - Scriptlets</title>
</head>
<body>
<h1>
    Testing scriptlets:<br>
    Displaying current date:
    <%
        Date currentDate = new Date();
        out.print(currentDate);
    %>
    <br>
    Display server remote host IP:
    <%
        String ipAddress = request.getRemoteHost();
        out.print(ipAddress);
    %>
</h1>
</body>
</html>
