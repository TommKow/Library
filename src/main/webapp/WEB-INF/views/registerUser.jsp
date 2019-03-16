<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registerUser</title>
</head>
<body>
    <form:form method="post" modelAttribute="user">
        <form:input path="email"/>
        <form:input path="password"/>

    <input type="submit" value="Save">
    </form:form>
</body>
</html>
