<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Old View MVC application</title>
</head>
<body>
<h1>Old View MVC application</h1>

<jsp:useBean id="person" type="lab.mvc.model.Person" scope="request"/>


<p> First Name: 
   <jsp:getProperty name="person" property="firstName"/>
</p>
<p> Last Name: 
   <jsp:getProperty name="person" property="lastName"/>
</p>
<p> Birth Date: 
   <jsp:getProperty name="person" property="birthDay"/>
</p>
<p> Sex: 
   <jsp:getProperty name="person" property="sex"/>
</p>

</body>
</html>