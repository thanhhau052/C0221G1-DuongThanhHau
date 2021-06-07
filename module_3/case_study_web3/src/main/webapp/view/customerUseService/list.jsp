<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/6/2021
  Time: 11:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>List</title>
    <link rel="stylesheet" href="../../dataweb/bootstrap.min.css">
    <link rel="stylesheet" href="../../dataweb/dataTables.bootstrap.min.css">

</head>
<body>

<div class="container-fluid border pt-5 mt-5">
    <div style="height: 50px;margin-bottom: 50px">
        <h1 class="text-center">list of customers using the service </h1>
    </div>
    <table id="tableEmployee" class="container table table-bordered table-striped ">
        <thead>
        <tr>
            <th>Contract ID</th>
            <th>Customer Id</th>
            <th>Customer Name</th>
            <th>Service Name</th>
            <th>Contract Start Date</th>
            <th>Contract End Date</th>
            <th>Accompanied service</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerUseServices}" var="customerUseService">
            <tr>
                <td>${customerUseService.contractId}</td>
                <td>${customerUseService.customerId}</td>
                <td>${customerUseService.customerName}</td>
                <td>${customerUseService.serviceName}</td>
                <td>${customerUseService.contractStartDay}</td>
                <td>${customerUseService.contractEndDay}</td>
                <td>${customerUseService.attachServiceName}</td>

                <td><a href="/userService?action=edit&contractId=${customerUseService.contractId}">
                    <button type="button" class="btn btn-primary">Edit</button>
                </a>
                </td>
                <td>
                    <button class="btn btn-primary" data-toggle="modal" data-target="#myModal"
                            onclick="myFunction(${customerUseService.contractId})">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%--modal--%>
<div class="modal fade" id="myModal" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/userService?action=delete" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="myModalLabel">Accept delete Employee</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    Do you want to delete this employee?
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-secondary" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-danger btn-ok" id="delete" value="Delete">
                    <input type="hidden" id="contractId" name="contractId">
                </div>
            </div>
        </form>

    </div>
</div>
<c:if test="${message != null}">
    <input type="hidden" id="message" value="${message}">
    <script>
        let message = document.getElementById("message").value;
        alert(message);
    </script>
</c:if>


<script src="../../dataweb/jquery-3.6.0.min.js"></script>
<script src="../../dataweb/jquery.dataTables.min.js"></script>
<script src="../../dataweb/dataTables.bootstrap4.min.js"></script>
<script src="../../dataweb/popper.min.js"></script>
<script src="../../dataweb/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
<script type="text/javascript">
    function myFunction(id) {
        document.getElementById("contractId").value = id;
    }
</script>


</body>
</html>