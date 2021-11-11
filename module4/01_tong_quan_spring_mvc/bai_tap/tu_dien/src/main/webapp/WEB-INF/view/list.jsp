<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 11/11/2021
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>từ điển</title>
</head>
<body>
<h1>Từ điển thế giới</h1>
<form method="post">
    <input type="text" name="words" placeholder="từ của bạn">
    <input type="submit" value="search">
</form>
<h1> ${translate}</h1>

<h1>${message}</h1>

</body>
</html>
