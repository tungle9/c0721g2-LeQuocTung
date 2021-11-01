<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 31/10/2021
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to product list</a>
</p>
<legend>product information</legend>
<table>
    <tr>
        <td>Id : </td>
        <td><input type="number" name="id" id="id"></td>
    </tr>
    <tr>
        <td>Name: </td>
        <td><input type="text" name="name" id="name"></td>
    </tr>
    <tr>
        <td>Description: </td>
        <td><input type="text" name="description" id="description"></td>
    </tr>
    <tr>
        <td>Price: </td>
        <td><input type="text" name="price" id="price"></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="submit" value="update product"></td>
    </tr>
</table>
</fieldset>
</form>
</body>
</html>
