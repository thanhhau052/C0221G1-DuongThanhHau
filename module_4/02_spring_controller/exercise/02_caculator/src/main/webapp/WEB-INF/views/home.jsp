<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/15/2021
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
    <style>
        div{
            text-align: center;
            font-size: 120%;
            background: azure;
            margin-top: 100px;
        }

    </style>
</head>
<body>
<div>
<h1>Welcome</h1>
    <br>
    <br>
    <br>

<form action="calculate">
    <input type="text" name="num1" width="100px" placeholder="number1" value="${num1}">
    <input type="text" name="num2" width="100px" placeholder="number2" value="${num2}">
    <br>
    <br>
    <button name="operator" type="submit"  value="+">Addition(+)</button>
    <button name="operator" type="submit"  value="-">Subtraction(-)</button>
    <button name="operator" type="submit" value="*">Multiplication(X)</button>
    <button name="operator" type="submit"  value="/">Division(/)</button>

</form>

<h1>Result ${num1} ${operator} ${num2} = ${result}</h1>

</div>
</body>
</html>
