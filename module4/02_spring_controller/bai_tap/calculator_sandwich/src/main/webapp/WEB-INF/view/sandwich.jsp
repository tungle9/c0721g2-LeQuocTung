<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 12/11/2021
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu sandwich</title>
</head>
<body>
<H1>MENU SPICE SANDWICH</H1>

<form method="post" action="/finish_sandwich">
    <input type="checkbox" value="lettuce" name="spice">
    <span>Lettuce</span><br>
    <input type="checkbox" value="tomato" name="spice">
    <span>tomato</span><br>
    <input type="checkbox" value="mustard" name="spice">
    <span>mustard</span><br>
    <input type="checkbox" value="sprouts" name="spice">
    <span>sprouts</span><br>
    <hr>
    <input type="submit" value="save">
</form>
</body>
</html>
