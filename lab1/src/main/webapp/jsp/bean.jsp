<%@ page import="com.webtech.lab1.bean.Person" %><%--
  Created by IntelliJ IDEA.
  User: vincentyap
  Date: 11/03/2024
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>JSP - Form result</title>
</head>
<body>
<h1>
<jsp:useBean id="person" scope="application" class="com.webtech.lab1.bean.Person"/>

<jsp:setProperty name="person" property="*" />
<p> First Name:
    <jsp:getProperty name="person" property="fname"/>
</p>
<p> Last Name:
    <jsp:getProperty name="person" property="lname"/>
</p>
<p> Birthdate:
    <jsp:getProperty name="person" property="birthdate"/>
</p>
<p> Sex:
    <jsp:getProperty name="person" property="sex"/>
</p>
</h1>
</body>
</html>
