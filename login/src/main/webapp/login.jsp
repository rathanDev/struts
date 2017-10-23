<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>

<head>
    <title>Login</title>
</head>

<body>
<s:form action="login">
    <s:textfield name="username" label="User Name"></s:textfield>
    <s:textfield name="password" label="Password" type="password"></s:textfield>
    <s:submit value="login"></s:submit>
</s:form>
</body>

</html>
