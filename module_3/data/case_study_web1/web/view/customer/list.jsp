<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 5/30/2021
  Time: 2:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <style>
        img {
            width: 150px;
            height: 60px;
        }
    </style>
</head>
<body>
<!--// logo-->
<div class="row">
    <div class="container-fluid d-flex justify-content-between  align-items-center py-3 bg-info text-light">
        <div class="  d-flex align-items-center">
            <a class="navbar-brand" href="#"><img src="https://lh3.googleusercontent.com/proxy/94-AB_Nj57VJmxN2rqrOo3SYQdVPqKKN4fFcBtllyobuIWUJ3JG0QRcd0p-WqDAS4podvG2RsyoTDBbNesZqGsI1JREMl-nhRaebWWlRLQ5K8eqUuomAONab0yA" height=200px width=425px/>
            </a>

            <h2 class=" align-items-center">WelCome to Furama Resorf Đà Nẵng</h2>
        </div>
        <div class="col-md-2 h3">
            <p>Dương Thanh Hậu</p>
        </div>
    </div>
</div>
<!--head-->
<div class="row">
    <nav class="container-fluid navbar navbar-expand-lg navbar-light  bg-light">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto h5">
                <li class="nav-item active px-5 h4">
                    <a class="nav-link" href="/index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item px-5">
                    <a class="nav-link" href="#">Employee</a>
                </li>
                <li class="nav-item px-5">
                    <a class="nav-link" href="customers">Customer</a>
                </li>
                <li class="nav-item px-5">
                    <a class="nav-link" href="#">Service</a>
                </li>
                <li class="nav-itempx px-5">
                    <a class="nav-link" href="#">Contract</a>
                </li>
            </ul>
            <form  method="post" action="/customers?action=search"><input type="text" name="key"  ><input type="submit"value="Search"></form>
        </div>
    </nav>
</div>
<!--body-->
<div class="row" style="width: 100%; height: 1000px ;background: #e5ffe8">
    <div class="col-3" style="background: #03ccff ">
        <p> day la the p</p>
        <p> day la the p</p>
        <p> day la the p</p>
    </div>
    <div class="col-9" style="background: white ">
        <h1>Customers</h1>
        <p>
            <a href="/customers?action=create">Create new customer</a>
        </p>

       <br>

        <table class="table table-striped table-hover">
            <tr>
                <td>Name</td>
                <td>Email</td>
                <td>Address</td>
                <td>Edit</td>
                <td>Delete</td>
            </tr>
            <c:forEach items='${requestScope["customers"]}' var="customer">
                <tr>
                    <td><a href="/customers?action=view&id=${customer.id}">${customer.getName()}</a></td>
                    <td>${customer.email}</td>
                    <td>${customer.address}</td>
                    <td><a href="/customers?action=edit&id=${customer.id}">edit</a></td>
                    <td><a href="/customers?action=delete&id=${customer.id}">delete</a></td>
<%--                    <td>--%>
<%--                        <a href="edit.jsp" class="edit" ><i class="far fa-edit" style="font-size: 30px;color: red" ></i></a>--%>
<%--                        <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i data-toggle="tooltip" class="fas fa-trash-alt mb-1 style=" style="font-size: 30px; color: red" title="Delete">&#xE872;</i></a>--%>
<%--                    </td>--%>
                </tr>

            </c:forEach>
        </table>


    </div>
</div>
<%--</div>--%>
<%--<div id="deleteEmployeeModal" class="modal fade">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <form>--%>
<%--                <div class="modal-header">--%>
<%--                    <h4 class="modal-title">Delete</h4>--%>
<%--                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>--%>
<%--                </div>--%>
<%--                <div class="modal-body">--%>
<%--                    <p>Are you sure you want to delete these Records?</p>--%>
<%--                    <p class="text-warning"><small>This action cannot be undone.</small></p>--%>
<%--                </div>--%>
<%--                <div class="modal-footer">--%>
<%--                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">--%>
<%--                    <input type="submit" class="btn btn-danger" value="Delete">--%>
<%--                </div>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>



<div class="row">
    <div class="card-footer " style="height: 50px ;width: 100% ">
        <p style="text-align: center;">Card footer</p>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>

</body>
</html>