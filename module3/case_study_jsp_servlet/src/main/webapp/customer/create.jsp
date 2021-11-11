<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 03/11/2021
  Time: 08:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Furama resort</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <link rel="icon" href="https://image.flaticon.com/icons/png/512/458/458625.png" type="image/i-icon"/>
    <style>
        .menu_top {
            height: 100px;
        }

        .menu {
            background: cornflowerblue;
        }

        .row {
            height: 700px;
        }

        .col-3 {

            background: aliceblue;
        }

        .footer {
            background: lightskyblue;
            height: 110px;
            width: 100%;
        }

        .container-fluid {
        }

    </style>
</head>
<body>
<div style="width: 100%">
    <div class="menu_top">
        <div class="col-2"><img style="width: 150px;height: 100% ;padding: 15px 10px 10px 10px ;margin-left:50px "
                                src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/51e2b2d8-39bd-4c3a-8d40-2c5228123156/dcp56ql-83ab9bca-3b88-4db5-a19d-1133f9a78e06.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzUxZTJiMmQ4LTM5YmQtNGMzYS04ZDQwLTJjNTIyODEyMzE1NlwvZGNwNTZxbC04M2FiOWJjYS0zYjg4LTRkYjUtYTE5ZC0xMTMzZjlhNzhlMDYucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.vaXaCTu9BgQNUMLljbTw2JaZJg_o1Lnt2ySwy-X9KRc">
        </div>
    </div>
    <div class="menu">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="index.jsp">Home</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Employee</a>
                        </li>
                        <a class="nav-link disabled">Customer</a>
                        </li>
                        </li>
                        <a class="nav-link disabled">Service</a>
                        </li>
                        </li>
                        <a class="nav-link disabled">Contract</a>
                        </li>
                    </ul>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
    </div>
    <div class="row">
        <div class="col-3">
            <div class="list-group">
                <a href="#" class="list-group-item list-group-item-action active" aria-current="true">
                    The current link item
                </a>
                <a href="/customer" class="list-group-item list-group-item-action">Customer</a>
                <a href="#" class="list-group-item list-group-item-action">Employee</a>
                <a href="#" class="list-group-item list-group-item-action">Service</a>
                <a class="list-group-item list-group-item-action disabled">Contract</a>
            </div>
        </div>
        <div class="col-9">
            <h1>Customers</h1>
            <p>
                <c:if test='${requestScope["message"] != null}'>
                    <span class="message">${requestScope["message"]}</span>
                </c:if>
            </p>
            <p>
                <a class="navbar-brand" href="index.jsp">Home</a>
            </p>
            <form method="post">
                <fieldset>
                    <legend>Customer information</legend>
                    <table border="1">
                        <tr>
                            <td>ID</td>
                            <td><input type="text" name="id" id="ID"></td>
                        </tr>
                        <tr>
                            <td>Name</td>
                            <td><input type="text" name="name" value="${customer.getName()}" id="Name">
                                <p style="color: brown"><c:if test="${nameError != null }">
                                    ${nameError}
                                </c:if></p>
                            </td>
                        </tr>
                        <tr>
                            <td>Email</td>
                            <td><input type="text" name="email" id="Email"></td>
                        </tr>
                        <tr>
                            <td>Birthday</td>
                            <td><input type="date" name="birthday" id="Birthday"></td>
                        </tr>
                        <tr>
                            <td>Phone</td>
                            <td><input type="text" name="phone" id="Phone"></td>
                        </tr>
                        <tr>
                            <td>ID Card</td>
                            <td><input type="text" name="idCard" id="ID Card"></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Create customer"></td>
                        </tr>
                    </table>
                </fieldset>
            </form>
        </div>
    </div>
    <div class="footer"></div>
</div>
</body>
</html>
