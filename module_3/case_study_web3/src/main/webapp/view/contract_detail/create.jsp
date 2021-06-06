<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: Thanh Hậu--%>
<%--  Date: 6/5/2021--%>
<%--  Time: 10:56 PM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--f<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Create customer</title>--%>
<%--    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"--%>
<%--          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="container">--%>
<%--    <div class="row m-3">--%>
<%--        <div class="col-3"></div>--%>
<%--        <div class="col-6 border border-secondary rounded shadow">--%>
<%--            <h2 class="text-white rounded bg-info px-5 py-2 mt-2">Create new contract detail</h2>--%>
<%--            <p class="text-success">--%>
<%--                ${message}--%>
<%--            </p>--%>

<%--            <form method="post">--%>
<%--                <div class="container-fluid">--%>
<%--                    <div class="form-group row">--%>
<%--                        <label class="col-sm-4 col-form-label">Contract id</label>--%>
<%--                        <div class="col-sm-8">--%>
<%--                            <select name="cId" >--%>
<%--                                <c:forEach items="${contractList}" var="contract">--%>
<%--                                    <option value="${contract.getId()}">${contract.getId()}</option>--%>
<%--                                </c:forEach>--%>
<%--                            </select>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <div class="form-group row">--%>
<%--                        <label class="col-sm-4 col-form-label">Attach Service</label>--%>
<%--                        <div class="col-sm-8">--%>
<%--                            <select name="aId" >--%>
<%--                                <c:forEach items="${attachList}" var="attachService">--%>
<%--                                    <option value="${attachService.getId()}">${attachService.getName()}</option>--%>
<%--                                </c:forEach>--%>
<%--                            </select>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <div class="form-group row">--%>
<%--                        <label class="col-sm-4 col-form-label">Quantity</label>--%>
<%--                        <div class="col-sm-8">--%>
<%--                            <input type="number" class="form-control" name="quantity">--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <div class="d-flex justify-content-between mb-2">--%>
<%--                        <a href="/contractDetails" class="btn btn-secondary">Close</a>--%>
<%--                        <input class="btn btn-success" type="submit" value="Create">--%>
<%--                    </div>--%>

<%--                </div>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--        <div class="col-3"></div>--%>
<%--    </div>--%>
<%--</div>--%>

<%--<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"--%>
<%--        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"--%>
<%--        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"--%>
<%--        integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF"--%>
<%--        crossorigin="anonymous"></script>--%>

<%--</body>--%>
<%--</html>--%>
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
            <h1>Create new Contract Detail </h1>
            <c:if test="${message != null}">
                <span>${message}</span>
            </c:if>
            <p>
                <a href="/index.jsp">Back to menu</a>
            </p>
            <form action="/contractDetails?action=create" method="post" class="container border border-dark mb-3 pt-3">
                <div class="form-group">
                    <label>Contract id  </label>
                    <select  name="ContactId" class="form-control">
                        <c:forEach var="contract" items="${contracts}">
                            <option value="${contract.contractId}">${contract.contractId}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Attach Service </label>
                    <select  name="ContactId" class="form-control">
                        <c:forEach var="service" items="${attachServices}">
                            <option value="${service.attachServiceId}">${service.attachServiceId}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Quantity </label>
                    <input type="number" class="form-control" name="quantity" placeholder="quantity ">
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