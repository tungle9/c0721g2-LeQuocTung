<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 27/10/2021
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>SIMPLE CALCULATOR</h2>

<form action="tinh_toan" method="post">
    <label> First operand : </label>
    <input type="number" name="num1"><br>
    <label>Operator</label>
    <select name="operator">
        <option value="+">addition</option>
        <option value="-">subtraction</option>
        <option value="*">multiplication</option>
        <option value="/">division</option>
    </select><br>
    <label>Second operand</label>
    <input type="number" name="num2"><br>
    <input type="submit">
</form>
</body>
</html>
