<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 06/11/2021
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%--//id, name, area, people, standardRoom, description--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List service</title>
</head>
<body>
<center>
    <h1>List service</h1>
    <h2><a href="/service?action=create">Add new Service</a></h2>
</center>
<center>
    <a href="index.jsp"><input type="submit" value="HOME" style="size: 30px ;color: blueviolet"></a></center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of service Furama</h2></caption>
        <tr>
            <th>ID</th>
            <th>NameService</th>
            <th>Area</th>
            <th>People</th>
            <th>Standard Room</th>
            <th>Description</th>
        </tr>
        <c:forEach var="service" items="${listService}">
            <tr>
                <td>${service.id}</td>
                <td>${service.name}</td>
                <td>${service.area}</td>
                <td>${service.people}</td>
                <td>${service.standardRoom}</td>
                <td>${service.description}</td>
                <td>
                    <a href="/service?action=edit&id=${service.id}">Edit</a>
                    <a href="/service?action=delete&id=${service.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
