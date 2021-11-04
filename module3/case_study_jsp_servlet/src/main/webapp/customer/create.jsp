<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 03/11/2021
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create new customer</title>
</head>
<body>
<div style="background-image: url('https://image.freepik.com/free-photo/frame-spanish-oyster-thistle-flowers-blue-background_23-2148268362.jpg') ;width: 100%;height: 100%">
<h1>Customers</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="index.jsp">Back to home</a>
</p>
<form method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table border="1">
            <tr>
                <td>ID</td>
                <td><input type="text" name="id" id="ID"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" id="Name"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" id="Email"></td>
            </tr>
            <tr>
                <td>Birthday</td>
                <td><input type="date" name="birthday" id="Birthday"></td>
            </tr>
            <tr>
                <td>Phone</td>
                <td><input type="text" name="phone" id="Phone"></td>
            </tr>
            <tr>
                <td>ID Card</td>
                <td><input type="text" name="idCard" id="ID Card"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create customer"></td>
            </tr>
        </table>
    </fieldset>
</form>
</div>
</body>
</html>
