<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 5/26/2021
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/calculator" method="post">
    <label>Description : </label> <br/>
    <input type="text" name="description" placeholder="Ten san pham" value="xe may"/> <br/>
    <label>List Price: </label> <br/>
    <input type="text" name= "price" placeholder="Gia san pham" value="1200" /><br/>
    <label>Discount Percent: </label> <br/>
    <input type="text" name= "percent" placeholder="Chiet khau"  value="10"/>(%)<br/>
    <label>Discount Percent: </label> <br/>
    <input type="submit"   value="DISCOUNTACOUNT"/>

</form>
</body>
</html>
