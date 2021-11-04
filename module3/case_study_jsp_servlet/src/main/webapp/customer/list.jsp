<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 03/11/2021
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customer list</h1>
<p>
    <a href="/customer?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Birthday</td>
        <td>Phone</td>
        <td>ID Card</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customer"]}' var="customer">
        <tr>
            <td><a href="/customer?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
            <td>${customer.getName()}</td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getBirthday()}</td>
            <td>${customer.getPhone()}</td>
            <td>${customer.getIdCard()}</td>
            <td><a href="/customer?action=edit&id=${customer.id}">edit</a></td>
            <td><a href="/customer?action=delete">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
