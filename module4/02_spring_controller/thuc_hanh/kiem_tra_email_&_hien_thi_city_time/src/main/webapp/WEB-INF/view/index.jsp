<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 11/11/2021
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<h1>Email Validate</h1>
<h3 style="color:red">${message}</h3>

<form action="view"  method="post">
  <input type="text" name="email"><br>
  <input type="submit" value="Validate">
</form>

  </body>
</html>
