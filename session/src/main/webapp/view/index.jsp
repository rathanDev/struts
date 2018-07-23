<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head><title>jsp</title></head>
<body>
<h1>Index Page</h1>
<p>Today's date: <%= (new java.util.Date()).toString()%></p>

Please <a href="view/login.jsp">log in</a>

</body>
</html>