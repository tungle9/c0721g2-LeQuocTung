<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 27/10/2021
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Danh sách khách hàng</title>
    <style>
      tr td {
        padding: 50px;
      }
    </style>

  </head>
  <body>
<h2>DANH SÁCH KHÁCH HÀNG</h2>
  <table  border="1" bgcolor="#f5f5dc" style=" border: 1px solid aqua">
    <tr>
      <th>STT</th>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach var="kh" items="${KhachHangServlet}" varStatus="stt">
    <tr>
      <td>${stt.count}</td>
      <td><c:out value="${kh.name}"/></td>
      <td>${kh.dateOfBirth}</td>
      <td><c:out value="${kh.address}"/></td>
      <td>hình ảnh</td>
    </tr>
    </c:forEach>
  </table>
  </body>
</html>
