<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/27/2018
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customers</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
            crossorigin="anonymous"></script>

    <style>
        img {
            width: 75px;
            height: 75px;
        }
    </style>
</head>
<body>
<div>
    <h1>Danh sach khach hang</h1>
    <table border="1" class="table table-dark table-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Date</th>
            <th>Address</th>
            <th>Image</th>
        </tr>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td><c:out value="${customer.id}"></c:out></td>
                <td><c:out value="${customer.name}"></c:out></td>
                <td><c:out value="${customer.date}"></c:out></td>
                <td><c:out value="${customer.address}"></c:out></td>
                <td><img src="images/<c:out value="${customer.image}"></c:out>"/></td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>