<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 31/10/2021
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Products</h1>
<a href="">Create new product</a>
<table border="1">
    <tr>
        <td>STT</td>
        <td>ID</td>
        <td>Name</td>
        <td>Description</td>
        <td>Price</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${requestScope['products']}" var="product" >
        <tr>
            <td></td>
            <td><a href="/products?action=view&id=${product.getIdProduct()}"${product.getName()}></a></td>
            <td>${product.getName()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getPrice()}</td>
            <td><a href="/products?action=edit&name=${product.getName()}">Edit</a></td>
            <td><a href="/products?action=delete&id=${product.getIdProduct()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
