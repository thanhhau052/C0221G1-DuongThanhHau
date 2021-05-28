<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 5/28/2021
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create product</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
</head>
<body>
<p>
    <a href="/products">back to list pages</a>
</p>

<table class="table table-striped">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Discription</td>
        <td>Produrce</td>
    </tr>
    <tr>
        <form method="post">
            <td>
                <label>Name</label>
                <input type="text" name="name" id="name" value="${products.getName()}">
            </td>
            <td>
                <label>Price</label>
                <input type="text" name="price" id="price" value="${products.getPrice()}">
            </td>
            <td>
                <label>Discriptsion</label>
                <input type="text" name="discription" id="discription" value="${products.getDesription()}">
            </td>
            <td>
                <input type="text" name="produrce" id="produrce" value="${products.getProducer()}">
                <button type="submit">update</button>
            </td>
        </form>
    </tr>

</table>
</body>
</html>