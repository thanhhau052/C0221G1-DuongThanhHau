<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/14/2021
  Time: 9:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Email Validation</title>
</head>
<body>

<h1>Email Validate</h1>
<h3 style="color:red">${message}</h3>

<form action="validate" method="post">
  <input style="color: red" type="text" name="email" value="${email}"><br>
  <input type="submit" value="Validate">
</form>

</body>
</html>