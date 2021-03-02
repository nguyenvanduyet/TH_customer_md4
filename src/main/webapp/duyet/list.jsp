<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 01/03/2021
  Time: 4:21 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="s">
        ${s.getId()}
        ${s.getName()}
    </c:forEach>
</body>
</html>
