<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Edit employee</title>
    <link rel="stylesheet" href="../../dataweb/bootstrap.min.css">
    <link rel="stylesheet" href="../../dataweb/dataTables.bootstrap.min.css">
</head>
<body>
<div class="row">
    <div class="container d-flex justify-content-center">
        <div class="col-6 d-flex flex-column">
            <h1>Edit employee</h1>
            <p>${map.msg}</p>
            <p>
                <a href="/employees">Back to menu</a>
            </p>
            <form action="/employees?action=edit&id=${employee.id}" method="post"
                  class="container border border-dark mb-3 pt-3">
                <div class="form-group">
                    <label>ID:</label>
                    <input type="text" class="form-control" name="id" value="${employee.id}" disabled>

                </div>
                <div class="form-group">
                    <label>Name:</label>
                    <input type="text" class="form-control" name="name" value="${employee.name}">
                    <span style=" color:red;">${map.name}</span>
                </div>
                <div class="form-group">
                    <label>Birthday:</label>
                    <input type="date" class="form-control" name="birthday"
                           value="${employee.birthday}">
                    <span style="color:red;">${map.birthday}</span>
                </div>
                <div class="d-flex justify-content-center ">
                    <button type="submit" class="btn btn-primary mb-3">Update</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="../../dataweb/jquery-3.6.0.min.js"></script>
<script src="../../dataweb/jquery.dataTables.min.js"></script>
<script src="../../dataweb/dataTables.bootstrap4.min.js"></script>
<script src="../../dataweb/popper.min.js"></script>
<script src="../../dataweb/bootstrap.min.js"></script>
</body>
</html>