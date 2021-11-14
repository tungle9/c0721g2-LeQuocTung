<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 12/11/2021
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="color: darkslateblue;"> You added spice to the Sandwich :
    <c:forEach items="${requestScope.spice}" var="show">${show}</c:forEach>;
</h1>
</body>
</html>
