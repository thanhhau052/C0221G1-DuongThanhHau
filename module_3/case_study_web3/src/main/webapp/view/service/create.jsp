<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/4/2021
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Create new service</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<div class="row">
    <div class="container d-flex justify-content-center">
        <div class="col-6 d-flex flex-column">
            <h1>Create new service</h1>
            <c:if test="${message != null}">
                <span>${message}</span>
            </c:if>
            <p>
                <a href="/index.jsp">Back to menu</a>
            </p>
            <form action="/services?action=create" method="post" class="container border border-dark mb-3 pt-3">
                <div class="form-group">
                    <label>Name:</label>
                    <input type="text" class="form-control" name="service_name" placeholder="Enter name ">
                </div>
                <div class="form-group">
                    <label>Area:</label>
                    <input type="number" class="form-control" name="service_area" placeholder="Enter area ">
                </div>
                <div class="form-group">
                    <label>Cost:</label>
                    <input type="text" class="form-control" name="service_cost" placeholder="Enter cost ">
                </div>
                <div class="form-group">
                    <label>Max People:</label>
                    <input type="number" class="form-control" name="service_max_people"
                           placeholder="Enter max people">
                </div>
                <div class="form-group">
                    <label>Rent Type: </label>
                    <select  name="rent_type_id" class="form-control">
                        <c:forEach var="rent" items="${rentTypes}">
                            <option value="${rent.rentTypeId}">${rent.rentTypeName}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">
                    <label>Service Type: </label>
                    <select  name="service_type_id" class="form-control">
                        <c:forEach var="type" items="${serviceTypes}">
                            <option value="${type.serviceTypeId}">${type.serviceTypeName}</option>
                        </c:forEach>
                    </select>
                </div>

                <div id="standard_room" class="form-group">
                    <label>Standard room:</label>
                    <input type="text" class="form-control" name="standard_room" placeholder="Enter standard room... ">
                </div>
                <div id="description_other_convenience" class="form-group">
                    <label>Description other convenience:</label>
                    <input type="text" class="form-control" name="description_other_convenience" placeholder="Enter description other convenience... ">
                </div>
                <div id="pool_area" class="form-group">
                    <label>Pool area:</label>
                    <input type="number" class="form-control" name="pool_area" placeholder="Enter pool area... ">
                </div>
                <div id="number_of_floors" class="form-group">
                    <label>Number of floors:</label>
                    <input type="number" class="form-control" name="number_of_floors" placeholder="Enter number of floors... ">
                </div>
                <div class="d-flex justify-content-center ">
                    <button type="submit" class="btn btn-primary mb-3">Create</button>
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