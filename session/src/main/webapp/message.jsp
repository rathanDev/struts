<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<h1>Message</h1>

<p>Messaged Count: <s:property value="messagedCount" />  times</p>
<p>a sample message below</p>
<s:property value="messageStore.message"/>

</body>
</html>