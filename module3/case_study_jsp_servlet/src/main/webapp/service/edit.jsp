<%--
  Created by IntelliJ IDEA.
  service: WIN-PRO
  Date: 06/11/2021
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>service Management</h1>
    <a class="navbar-brand" href="index.jsp">Home</a>
    <h2>
        <a href="service?action=service">List All Service</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit service
                </h2>
                <p>
                    <c:if test='${requestScope["message"] != null}'>
                        <span class="message">${requestScope["message"]}</span>
                    </c:if>
                </p>
            </caption>
            <c:if test="${service != null}">
                <input type="hidden" name="id" value="<c:out value='${service.id}' />"/>
            </c:if>
<%--            <tr>--%>
<%--                <th>service Name:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="name" size="45"--%>
<%--                           value="${service.name}"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
            <tr>
                <th>Service Name:</th>
                <td>
                    <select name="name">
                            Service name
                        <option>Villa</option>
                        <option>House</option>
                        <option>Room</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>service area:</th>
                <td>
                    <input type="text" name="area" size="45"
                           value="<c:out value='${service.area}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>People:</th>
                <td>
                    <input type="text" name="people" size="15"
                           value="<c:out value='${service.people}'/>"
                    />
                </td>
            </tr>
            <tr>
                <th>Standard Room:</th>
                <td>
                    <input type="text" name="standardRoom" size="15"
                           value="<c:out value='${service.standardRoom}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Description:</th>
                <td>
                    <input type="text" name="people" size="15"
                           value="<c:out value='${service.description}' />"
                    />
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