<%--
  Created by IntelliJ IDEA.
  User: vincentyap
  Date: 11/03/2024
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="person" type="com.webtech.lab1mvc.model.Person" scope="request" />
<html>
<head>
    <title>New Person Details</title>
</head>
<body>
    <h2>New Person Details</h2>
    <p>First Name: <jsp:getProperty name="person" property="firstName" /></p>
    <p>Last Name: <jsp:getProperty name="person" property="lastName" /></p>
    <p>Birthday: <jsp:getProperty name="person" property="birthDay" /></p>
    <p>Sex: <jsp:getProperty name="person" property="sex" /></p>
</body>
</html>
