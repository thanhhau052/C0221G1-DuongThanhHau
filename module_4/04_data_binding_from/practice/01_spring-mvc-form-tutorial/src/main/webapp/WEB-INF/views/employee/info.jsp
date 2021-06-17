<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/16/2021
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information</title>
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
<h2>Submitted Employee Information</h2>
<table class="table table-striped">
    <tr>
        <td>Name:</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>ID:</td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>Contact Number:</td>
        <td>${contactNumber}</td>
    </tr>
</table>
<button><a href="http://localhost:8080/employee/showForm"> back to menu</a></button>
</body>
</html>
