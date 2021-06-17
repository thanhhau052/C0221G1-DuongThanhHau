<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/15/2021
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
<div  style="margin-top:100px;margin-left:500px;height: 200px;height: 300px  ">
    <h2>List Sandwich Condiments </h2>
    <c:if test="${condiment==null}">
        <span> pls tick on check box </span>
    </c:if>
    <c:if test="${condiment!=null}">
        <c:forEach var="list" items="${condiment}" varStatus="indx">
            <ul>
                    <%--            <li>${indx.index} </li>--%>
                <li>${list.toString()}</li>
            </ul>
        </c:forEach>
    </c:if>
    <br></br>
    <a href="http://localhost:8080/">back to menu</a>
</div>
</body>
</html>
