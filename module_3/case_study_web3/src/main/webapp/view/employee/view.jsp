<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/4/2021
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>View employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<div class="row">
    <div class="container d-flex justify-content-center">
        <div class="col-6 d-flex flex-column">
            <h1>View employee</h1>
            <p>
                <a href="/employees">Back to menu</a>
            </p>
            <form class="container border border-dark mb-3 pt-3">
                <div class="form-group">
                    <label>ID:</label>
                    <input type="text" class="form-control" value="${employee.employeeId}">
                </div>
                <div class="form-group">
                    <label>Name:</label>
                    <input type="text" class="form-control" value="${employee.employeeName}">
                </div>
                <div class="form-group">
                    <label>Birthday:</label>
                    <input type="date" class="form-control" value="${employee.employeeBirthday}">
                </div>
                <div class="form-group">
                    <label>ID Card: </label>
                    <input type="text" class="form-control" value="${employee.employeeIdCard}">
                </div>
                <div class="form-group">
                    <label>Salary: </label>
                    <input type="number" class="form-control" value="${employee.employeeSalary}">
                </div>
                <div class="form-group">
                    <label>Phone: </label>
                    <input type="number" class="form-control" value="${employee.employeePhone}">
                </div>
                <div class="form-group">
                    <label>Email: </label>
                    <input type="email" class="form-control" value="${employee.employeeEmail}">
                </div>
                <div class="form-group">
                    <label>Address: </label>
                    <input type="text" class="form-control" value="${employee.employeeAddress}">
                </div>
                <div class="form-group">
                    <label>Position ID: </label>
                    <c:forEach var="position" items="${requestScope['positions']}">
                        <c:if test="${position.positionId == employee.positionId}">
                            <input type="text" class="form-control" value="${position.positionName}">
                        </c:if>
                    </c:forEach>
                </div>
                <div class="form-group">
                    <label>Education degree ID: </label>
                    <c:forEach var="education" items="${requestScope['educationDegrees']}">
                        <c:if test="${education.educationDegreeId == employee.educationDegreeId}">
                            <input type="text" class="form-control" value="${education.educationDegreeName}">
                        </c:if>
                    </c:forEach>
                </div>
                <div class="form-group">
                    <label>Division ID: </label>
                    <c:forEach var="division" items="${requestScope['divisions']}">
                        <c:if test="${division.divisionId == employee.divisionId}">
                            <input type="text" class="form-control" value="${division.divisionName}">
                        </c:if>
                    </c:forEach>
                </div>
                <div class="form-group">
                    <label>Username: </label>
                    <input type="text" class="form-control" value="${employee.username}">
                </div>
            </form>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"
        integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF"
        crossorigin="anonymous"></script>
</body>
</html>