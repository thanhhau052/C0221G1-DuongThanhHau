<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 5/30/2021
  Time: 2:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new customer</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <style>
        .message {
            color: green;
        }
    </style>
</head>
<body>


<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 5/30/2021
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
    >
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
            <a class="navbar-brand" href="#"><img src="img/logo_furama.png" height=200px width=425px/>
            </a>

            <h2 class=" align-items-center">WelCome to Furama Resorf Đà Nẵng</h2>
        </div>
        <div class="col-md-2 h3">
            <p>Duong Thanh Hau</p>
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
            <form class="form-inline my-2 my-lg-0 mr-3">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
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
        <h1>Create new customer</h1>
        <p>
            <c:if test='${requestScope["message"] != null}'>
                <span class="message">${requestScope["message"]}</span>
            </c:if>
        </p>
        <p>
            <a href="/customers">Back to customer list</a>
        </p>


        <form method="post">
            <fieldset>
                <legend>Customer information</legend>
                <table class="table table-striped table-hover">
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="name" id="name"></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email" id="email"></td>
                    </tr>
                    <tr>
                        <td>Address:</td>
                        <td><input type="text" name="address" id="address"></td>
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


<div class="row">
    <div class="card-footer " style="height: 50px ;width: 100% ">
        <p style="text-align: center;">Card footer</p>
    </div>
</div>


</body>
</html>


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