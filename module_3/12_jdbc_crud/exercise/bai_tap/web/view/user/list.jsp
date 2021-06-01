<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/1/2021
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1>User List</h1>
    <div class="row">
        <div class="col-lg-4">
            <h5><a href="/user?action=create">Create User</a></h5>
        </div>
        <div class="col-lg-4">
            <h5><a href="/user?action=sort">Sort By Name</a></h5>
        </div>
        <div class="col-lg-4">
            <form method="get" action="/user">
                <input name="action" value="search" hidden>
                <input  type="text" name="search" id="search" placeholder="Input Search">
                <button class="btn btn-success">Search</button>
            </form>
        </div>
    </div>
    <table class="table table-striped">
        <tr>
            <th>STT</th>
            <th>ID</th>
            <th>Tên</th>
            <th>Email</th>
            <th>Country</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${users}" var="user" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.country}</td>
                <td><a href="user?action=edit&id=${user.id}">Edit</a></td>
                <td><a href="user?action=delete&id=${user.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>