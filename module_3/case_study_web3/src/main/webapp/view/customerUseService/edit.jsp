<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/7/2021
  Time: 6:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css" rel="stylesheet" media="screen">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row border">
        <form class="form-horizontal" id="form-edit-client" method="post" action="/userService?action=edit">
            <div class="border">
                <h1 class="text-center">edit</h1>
                <c:if test="${message!=null}">
                    <span>${message}</span>
                </c:if>
                <div class="form-group">
                    <label class="col-md-4 control-label">ID</label>
                    <div class="col-md-4">
                        <input id="contractId" name="contractId" value="${contract.contractId}" type="hidden"
                               class="form-control input-md">
                        <span class="help-block"> Id of your contract</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">Employee</label>

                    <div class="col-md-4">
                        <input class="form-control" type="text" readonly value="${employee.employeeName}">
                        <input class="form-control" type="hidden"  name="employeeId" value="${employee.employeeId}">


                        <%--                        <select class="form-control" name="employeeId">--%>
                        <%--                            <c:forEach items="${employees}" var="employee">--%>
                        <%--                                <option  value="${contract.employeeId}" ${contract.employeeId==employee.employeeId?"selected":""}>${employee.employeeName}</option>--%>
                        <%--                            </c:forEach>--%>
                        <%--                        </select>--%>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">customer</label>
                    <div class="col-md-4">
                        <button class="form-control" type="text" readonly name="customerId"
                                value="${customer.customerId}">${customer.customerName}</button>

                        <%--                        <select class="form-control" name="customerId">--%>
                        <%--                            <c:forEach items="${customers}" var="customer">--%>
                        <%--                                <option value="${customer.customerId}" ${contract.customerId==customer.customerId?"selected":""}>${customer.customerName}</option>--%>
                        <%--                            </c:forEach>--%>
                        <%--                        </select>--%>

                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">service</label>

                    <div class="col-md-4">
                        <select class="form-control" name="serviceId">
                            <c:forEach items="${services}" var="service">
                                <option value="${service.serviceId}" ${contract.serviceId==service.serviceId?"selected":""}>${service.serviceName}</option>
                            </c:forEach>
                        </select>

                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">contract start date</label>
                    <div class="col-md-4">
                        <input name="contractStartDate" id="contractStartDate" type="date"
                               value="${contract.contractStartDate}"
                               class="form-control input-md">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">contract end date</label>
                    <div class="col-md-4">
                        <input name="contractEndDate" id="contractEndDate" type="date"
                               value="${contract.contractEndDate}"
                               class="form-control input-md">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">deposit</label>
                    <div class="col-md-4">
                        <input name="contractDeposit" id="contractDeposit" type="text"
                               value="${contract.contractDeposit}"
                               class="form-control input-md">

                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">total</label>
                    <div class="col-md-4">
                        <input name="contractTotal" id="contractTotal" type="text" value="${contract.contractTotal}"
                               class="form-control input-md">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label"></label>
                    <div class="col-md-4">
                        <button type="submit" class="btn btn-success">edit</button>
                        <button name="btn-save" class="btn btn-success">
                            <a href="/userService">back to list</a>
                        </button>
                    </div>
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

</body>
</html>
