<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 13/11/2021
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DETAIL STUDENT</title>
</head>
<body>
<h3> id: ${student.id}</h3>
<h3> name : ${student.name}</h3>
<br>
<h3> date of birth : ${student.dateOfBirth}</h3>
<br>

<h3> : ${student.grade} point </h3>
<c:if test="${student.gender == 0}">
    <h1> female</h1>
</c:if>
<c:if test="${student.gender == 1 }">
    <h1> male</h1>
</c:if>
</body>
</html>
