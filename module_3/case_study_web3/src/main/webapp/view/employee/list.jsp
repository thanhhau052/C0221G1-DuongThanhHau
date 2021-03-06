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
    <title>List Employees</title>
    <link rel="stylesheet" href="../../dataweb/bootstrap.min.css">
    <link rel="stylesheet" href="../../dataweb/dataTables.bootstrap.min.css">
</head>
<body>
<div class="container-fluid border pt-5 mt-5">
    <h1>List Employee</h1>
    <p><a href="index.jsp">Back to menu</a></p>
    <div class="row">
        <div class="col-6">
            <p> <a href="/employees?action=create">Create new employee</a></p>
        </div>
        <div class="col-6 d-flex justify-content-end">
            <form action="/employees?action=search" method="post">
                <input type="text" name="employeeName" placeholder="Enter name...">
                <input type="submit" value="Search">
            </form>
        </div>
    </div>
    <table id="tableEmployee" class="table table-bordered table-striped" >
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>ID Card</th>
            <th>Salary</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Position</th>
            <th>Education Degree</th>
            <th>Division</th>
            <th>Username</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td><a href="/employees?action=view&employeeId=${employee.employeeId}">${employee.employeeId}</a></td>
                <td id="name">${employee.employeeName}</td>
                <td>${employee.employeeBirthday}</td>
                <td>${employee.employeeIdCard}</td>
                <td>${employee.employeeSalary}</td>
                <td>${employee.employeePhone}</td>
                <td>${employee.employeeEmail}</td>
                <td>${employee.employeeAddress}</td>
                <c:forEach var="position" items="${requestScope['positions']}">
                    <c:if test="${position.positionId == employee.positionId}">
                        <td>${position.positionName}</td>
                    </c:if>
                </c:forEach>
                <c:forEach var="education" items="${educationDegrees}">
                    <c:if test="${education.educationDegreeId == employee.educationDegreeId}">
                        <td>${education.educationDegreeName}</td>
                    </c:if>
                </c:forEach>
                <c:forEach var="division" items="${divisions}">
                    <c:if test="${division.divisionId == employee.divisionId}">
                        <td>${division.divisionName}</td>
                    </c:if>
                </c:forEach>
                <td>${employee.username}</td>
                <td>
                    <a href="/employees?action=edit&employeeId=${employee.employeeId}">
                        <button type="button" class="btn btn-primary">Edit</button>
                    </a>
                </td>
                <td>
                    <button class="btn btn-primary" data-toggle="modal" data-target="#myModal" onclick=" myFunction(${employee.employeeId})">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="modal fade" id="myModal" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <form action="/employees?action=delete" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="myModalLabel">Accept delete customer</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Do you want to delete this employee?
                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-secondary" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-danger btn-ok" value="Delete">
                        <input type="hidden" id="employeeId" name="employeeId">
                    </div>
                </div>
            </form>

        </div>
    </div>
</div>
<script src="../../dataweb/jquery-3.6.0.min.js"></script>
<script src="../../dataweb/jquery.dataTables.min.js"></script>
<script src="../../dataweb/dataTables.bootstrap4.min.js"></script>
<script src="../../dataweb/popper.min.js"></script>
<script src="../../dataweb/bootstrap.min.js"></script>
<script>
    $(document).ready(function() {
        $('#tableEmployee').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        } );
    } );
</script>
<script>
    function myFunction(id){
        document.getElementById("employeeId").value=id;
    }
</script>
</body>
</html>
