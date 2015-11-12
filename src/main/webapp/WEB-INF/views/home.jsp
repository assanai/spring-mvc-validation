<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Home page</title>
</head>
<body>

<spring:message code="label.switch.language"/> : <a href="?lang=en">English</a> | <a href="?lang=th">ไทย</a>

<h2><spring:message code="label.welcome"/> </h2>

</body>
</html>
