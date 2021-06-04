<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/4/2021
  Time: 6:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Edit employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<div class="row">
    <div class="container d-flex justify-content-center">
        <div class="col-6 d-flex flex-column">
            <h1>Edit employee</h1>
            <c:if test="${message != null}">
                <span>${message}</span>
            </c:if>
            <p>
                <a href="/employees">Back to menu</a>
            </p>
            <form action="/employees?action=edit&employeeId=${employee.employeeId}" method="post" class="container border border-dark mb-3 pt-3">
                <div class="form-group">
                    <label>ID:</label>
                    <input type="text" class="form-control" name="employeeId" value="${employee.employeeId}" disabled>
                </div>
                <div class="form-group">
                    <label>Name:</label>
                    <input type="text" class="form-control" name="employeeName" value="${employee.employeeName}">
                </div>
                <div class="form-group">
                    <label>Birthday:</label>
                    <input type="date" class="form-control" name="employeeBirthday" value="${employee.employeeBirthday}">
                </div>
                <div class="form-group">
                    <label>ID Card: </label>
                    <input type="text" class="form-control" name="employeeIdCard" value="${employee.employeeIdCard}">
                </div>
                <div class="form-group">
                    <label>Salary: </label>
                    <input type="number" class="form-control" name="employeeSalary" value="${employee.employeeSalary}">
                </div>
                <div class="form-group">
                    <label>Phone: </label>
                    <input type="number" class="form-control" name="employeePhone" value="${employee.employeePhone}">
                </div>
                <div class="form-group">
                    <label>Email: </label>
                    <input type="email" class="form-control" name="employeeEmail" value="${employee.employeeEmail}">
                </div>
                <div class="form-group">
                    <label>Address: </label>
                    <input type="text" class="form-control" name="employeeAddress" value="${employee.employeeAddress}">
                </div>
                <div class="form-group">
                    <label>Position ID: </label>
                    <select class="form-control" name="positionId">
                        <c:forEach var="position" items="${requestScope['positions']}">
                            <c:choose>
                                <c:when test="${position.positionId == employee.positionId}">
                                    <option value="${position.positionId}" selected>${position.positionName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${position.positionId}">${position.positionName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Education degree ID: </label>
                    <select class="form-control" name="educationDegreeId">
                        <c:forEach var="education" items="${requestScope['educationDegrees']}">
                            <c:choose>
                                <c:when test="${education.educationDegreeId == employee.educationDegreeId}">
                                    <option value="${education.educationDegreeId}" selected>${education.educationDegreeName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${education.educationDegreeId}">${education.educationDegreeName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Division ID: </label>
                    <select class="form-control" name="divisionId">
                        <c:forEach var="division" items="${requestScope['divisions']}">
                            <c:choose>
                                <c:when test="${division.divisionId == employee.divisionId}">
                                    <option value="${division.divisionId}" selected>${division.divisionName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${division.divisionId}">${division.divisionName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Username: </label>
                    <input type="text" class="form-control" name="username" value="${employee.username}">
                </div>
                <div class="d-flex justify-content-center ">
                    <button type="submit" class="btn btn-primary mb-3">Update</button>
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
