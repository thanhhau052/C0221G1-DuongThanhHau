
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
                    <select  name="contractId" class="form-control">
                        <c:forEach var="contract" items="${contracts}">
                            <option value="${contract.contractId}">${contract.contractId}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label>Attach Service </label>
                    <select  name="attachServiceId" class="form-control">
                        <c:forEach var="service" items="${attachServices}">
                            <option value="${service.attachServiceId}">${service.attachServiceId}-${service.attachServiceName}</option>
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