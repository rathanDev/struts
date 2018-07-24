<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>register</title>
</head>
<body>
<h3>Register</h3>

<s:form action="register">
    <s:textfield name="person.firstName" label="First name"/>
    <s:textfield name="person.lastName" label="Last name"/>
    <s:textfield name="person.email" label="Email"/>
    <s:textfield name="person.age" label="Age"/>
    <s:submit/>
</s:form>
</body>
</html>