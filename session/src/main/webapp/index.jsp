<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title>jsp</title></head>
<body>
<h1>~ Index Page ~</h1>
<p>Today's date: <%= (new java.util.Date()).toString()%>
</p>

<p>
    <a href="<s:url action='message'/>">message</a>
</p>

<p>
    <a href="<s:url action='register'/>">register</a>
</p>

Please <a href="login.jsp">log in</a>

</body>
</html>