<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/13/2021
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="abc" method="post">
    <p>RATE</p>
    <label>
        <input type="number" name="rate" value="${rate}" placeholder="Rate">
    </label>
    <br>
    <p>USD</p>
    <label>
        <input type="number" name="usd" value="${usd}" placeholder=" USD">
    </label>
    <br>
    <button type="submit"> Submit</button>
    <p>Result : ${result}</p>
</form>
</body>
</html>
