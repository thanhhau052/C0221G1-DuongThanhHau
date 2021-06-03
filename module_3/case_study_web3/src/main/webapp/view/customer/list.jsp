<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 5/30/2021
  Time: 2:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>List product</title>
    <link rel="stylesheet" href="../../dataweb/bootstrap.min.css">
    <link rel="stylesheet" href="../../dataweb/dataTables.bootstrap.min.css">

</head>
<body>
<div class="container border pt-5 mt-5">
    <h1>List Customer</h1>
    <p><a href="/index.jsp">Back to menu</a></p>
    <div class="row">
        <div class="col-6">
            <p><a href="/customers?action=create">Create new customer</a></p>
        </div>
        <div class="col-6 d-flex justify-content-end">
            <form action="/customers?action=search" method="post">
                <input type="text" name="customer_name" placeholder="Enter name...">
                <input type="submit" value="Search">
            </form>
        </div>
    </div>
    <table id="tableCustomer" class="table table-bordered table-striped ">
        <thead>
        <tr>
            <th>ID</th>
            <th>Customer Type</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Gender</th>
            <th>ID Card</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td><a href="/customers?action=view&customer_id=${customer.customerId}">${customer.customerId}</a>
                </td>
                <c:forEach var="type" items="${customerTypes}">
                    <c:if test="${type.customerTypeId == customer.customerTypeId}">
                        <td>${type.customerTypeName}</td>
                    </c:if>
                </c:forEach>
                <td>${customer.customerName}</td>
                <td>${customer.customerBirthday}</td>
                <td>${customer.customerGender}</td>
                <td>${customer.customerIdCard}</td>
                <td>${customer.customerPhone}</td>
                <td>${customer.customerEmail}</td>
                <td>${customer.customerAddress}</td>
                <td><a href="/customers?action=edit&customer_id=${customer.customerId}">
                    <button type="button" class="btn btn-primary">Edit</button>
                </a>
                </td>
                <td>
                    <button class="btn btn-primary"data-toggle="modal" data-target="#myModal" onclick="myFunction(${customer.customerId})">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


<div class="modal fade" id="myModal" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/customers?action=delete" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="myModalLabel">Accept delete customer</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    Do you want to delete this customer???
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-secondary" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-danger btn-ok" id="delete" value="Delete">
                    <input type="hidden" id="customer_id" name="customer_id">
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
    $(document).ready(function() {
        $('#tableCustomer').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        } );
    } );
</script>
<script type="text/javascript">
    function myFunction(id){
        document.getElementById("customer_id").value=id;
    }
</script>




</body>
</html>