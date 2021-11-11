<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 06/11/2021
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <head>
        <title>List service</title>
    </head>
<body>
<p>
    <a class="navbar-brand" href="index.jsp">Home</a>
</p>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="service?action=service">List All Service</a>
    </h2>
</center>

<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New service</h2>
                <p>
                    <c:if test='${requestScope["message"] != null}'>
                        <span class="message">${requestScope["message"]}</span>
                    </c:if>
                </p>
            </caption>
            <tr>
                <th>Service Name:</th>
                <td>
                    <select name="name" id="name">
                        <option>Villa</option>
                        <option>House</option>
                        <option>Room</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Service Area:</th>
                <td>
                    <input type="text" name="area" id="area" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Service people :</th>
                <td>
                    <input type="number" required name="people" id="people" size="15" pattern="[1-3][0-9]"/>
                </td>
            </tr>
            <tr>
                <th>Service Standard Room :</th>
                <td>
                    <input type="text" name="standardRoom" id="standardRoom" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Service Description:</th>
                <td>
                    <input type="text" required minlength="5" maxlength="25" name="description" id="description" size="45"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
<%--//id, name, area, people, standardRoom, description--%>
