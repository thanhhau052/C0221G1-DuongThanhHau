<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 5/26/2021
  Time: 10:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Calculator</title>
</head>
<body>
<form action="/result" method="POST">
  <lable for="first">First operand</lable>
  <input id="first" type="text" name="first" /><br />

  <lable for="operand">Operand</lable>
  <select name="operand" id="operand">
    <option value="+">Addition</option>
    <option value="-">Subtraction</option>
    <option value="*">Multiplication</option>
    <option value="/">Division</option>
  </select><br/>

  <lable for="second">Second operand</lable>
  <input id="second" type="text" name="second" />

  <button type="submit">Calculate</button>
</form>
</body>
</html>
