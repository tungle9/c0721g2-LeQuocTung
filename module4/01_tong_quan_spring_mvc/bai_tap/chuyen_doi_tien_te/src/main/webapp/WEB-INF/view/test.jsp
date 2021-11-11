<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 11/11/2021
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change money</title>
</head>
<body>

<form method="post">
    <h5>VND</h5>
    <input type="text" placeholder="VND" name="vnd" value="23000" readonly>
    <br>
    <h5>USD</h5>
    <input type="number" placeholder="USD" name="usd">
    <input type="submit" value="change">
</form>

<h5>VND : ${change}</h5>
</body>
</html>
