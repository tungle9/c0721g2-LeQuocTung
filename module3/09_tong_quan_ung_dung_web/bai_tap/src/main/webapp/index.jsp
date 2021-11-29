<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 26/10/2021
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="result">
    <p>List price</p>
    <input type="number" name="price">
    <p> Discount Percent</p>
    <input type="number" name="dp">
    <p>Discount Amount</p>
    <input type="submit" value="calculator">
</form>
<p>Kết quả là</p> <a name="result"></a>
</body>
</html>
