<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 13.01.2018
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CheckPage</title>
</head>
<body>
<spring:form modelAttribute="userFromServer" method="post" action="/user-system/users/check">
    <spring:input path="name"/>
    <spring:input path="password"/>
    <spring:button>validateUser</spring:button>
</spring:form>
</body>
</html>
