<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 04/11/2021
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/customer?action=customer">List All customer</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Customer
                </h2>
            </caption>
            <c:if test="${customer != null}">
                <input type="hidden" name="id" value="<c:out value='${Customer.id}' />"/>
            </c:if>
            <tr>
                <th>Customer Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${customer.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${customer.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer birthday:</th>
                <td>
                    <input type="date" name="birthday" size="15"
                           value="<c:out value='${customer.birthday}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer number phone:</th>
                <td>
                    <input type="text" name="phone" size="15"
                           value="<c:out value='${customer.phone}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer Id Card:</th>
                <td>
                    <input type="text" name="idCard" size="15"
                           value="<c:out value='${customer.idCard}' />"
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
