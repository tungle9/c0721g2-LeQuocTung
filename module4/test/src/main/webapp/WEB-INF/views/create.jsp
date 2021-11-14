<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 13/11/2021
  Time: 09:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create student</title>
</head>
<body>
<h1 style="color:dodgerblue;">${msg}</h1>

<form action="create" method="post">
    <p>Name</p>
    <input type="text" name="name" required>
    <p>date of birth</p>
    <input name="dateOfBirth" required>
    <button type="submit">Save</button>
    <a href="list">Back to list</a>
</form>
</body>
</html>
