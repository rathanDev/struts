<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<h1>Message</h1>

Messaged Count: <s:property value="messagedCount"/>
<p>a sample message below</p>
<s:property value="messageStore.message"/>

</body>
</html>