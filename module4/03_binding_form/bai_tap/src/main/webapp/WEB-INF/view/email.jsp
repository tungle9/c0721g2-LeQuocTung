<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 15/11/2021
  Time: 16:11
  To change this template use File | Settings | File Templates.



  String languages;
    int page;
    String filler;
    String signature;
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--@elvariable id="email" type="codegym"--%>

<html>
<head>
    <title>Hòm thư điện tử</title>

    <style>
        b {
            padding: 30px;
            margin: 30px;
        }

        span {
            padding: 30px;
            margin: 30px;


        }


    </style>
</head>
<body>
<h1>Settings</h1>
<fieldset>
    <legend>Bridget's diary</legend>
    <div style="width: 100%;">
        <form:form action="update_email" method="post" modelAttribute="email">
        <b>Languages</b>
            <form:select path="languages" items="${languages}"/>
        <br>
        <b>Page size</b>
        <span>Show <form:select path="page" items="${page}"/> email her page</span>
        <br>
        <b>Spams filter</b>
        <span><input type="checkbox">Enable spams filter</span>
        <br>
        <b>Signature</b>
            <form:textarea path="signature"/>
        <button type="submit">Update</button>
        <button>Cancel</button>
</fieldset>
</form:form>
</div>
</body>
</html>
