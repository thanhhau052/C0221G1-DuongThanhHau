<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Edit customer</title>
    <link rel="stylesheet" href="../../dataweb/bootstrap.min.css">
    <link rel="stylesheet" href="../../dataweb/dataTables.bootstrap.min.css">
</head>
<body>
<div class="row">
    <div class="container d-flex justify-content-center">
        <div class="col-6 d-flex flex-column">
            <h1>Edit customer</h1>
            <c:if test="${message != null}">
                <span>${message}</span>
            </c:if>
            <p>
                <a href="/customers">Back to menu</a>
            </p>
            <form action="/customers?action=edit&customer_id=${customer.customerId}" method="post"
                  class="container border border-dark mb-3 pt-3">
                <div class="form-group">
                    <label>ID:</label>
                    <input type="text" class="form-control" name="customer_id" value="${customer.customerId}" disabled>
                </div>
                <div class="form-group">
                    <label>Type ID: </label>
                    <select class="form-control" name="customer_type_id">
                        <c:forEach var="type" items="${customerTypes}">
                            <c:choose>
                                <c:when test="${type.customerTypeId == customer.customerTypeId}">
                                    <option value="${type.customerTypeId}" selected>${type.customerTypeName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${type.customerTypeId}">${type.customerTypeName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Name:</label>
                    <input type="text" class="form-control" name="customer_name" value="${customer.customerName}">
                </div>
                <div class="form-group">
                    <label>Birthday:</label>
                    <input type="date" class="form-control" name="customer_birthday"
                           value="${customer.customerBirthday}">
                </div>
                <div class="form-group">
                    <label>Gender: </label>
                    <select class="form-select form-control " name="customer_gender">
                        <c:if test="${customer.customerGender == '1'}">
                            <option value="1" selected>Male</option>
                            <option value="0">Female</option>
                        </c:if>
                        <c:if test="${customer.customerGender == '0'}">
                            <option value="0">Male</option>
                            <option value="1" selected>Female</option>
                        </c:if>
                    </select>
                </div>
                <div class="form-group">
                    <label>ID Card: </label>
                    <input type="text" class="form-control" name="customer_id_card" value="${customer.customerIdCard}">
                </div>
                <div class="form-group">
                    <label>Phone: </label>
                    <input type="number" class="form-control" name="customer_phone" value="${customer.customerPhone}">
                </div>
                <div class="form-group">
                    <label>Email: </label>
                    <input type="email" class="form-control" name="customer_email" value="${customer.customerEmail}">
                </div>
                <div class="form-group">
                    <label>Address: </label>
                    <input type="text" class="form-control" name="customer_address" value="${customer.customerAddress}">
                </div>
                <div class="d-flex justify-content-center ">
                    <button type="submit" class="btn btn-primary mb-3">Update</button>
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
</body>
</html>