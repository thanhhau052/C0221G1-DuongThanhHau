<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/13/2021
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ứng dụng từ điển đơn giản </title>
    <style>
        div {
            margin: auto;
            text-align: center;
            padding-top: 30px;
            width: 35%;
        }
    </style>
</head>
<body>
<div>
    <form action="abc" method="post">
        <h2>Ứng dụng từ điển đơn giản</h2>
        <br>
        <label>Input : </label>
        <input type="text" placeholder="input" name="input" value="${input}">
        <br>
        <br>
        <button type="submit"> translate</button>
        <p> Result :
            ${result}
        </p>


    </form>
</div>
</body>
</html>
