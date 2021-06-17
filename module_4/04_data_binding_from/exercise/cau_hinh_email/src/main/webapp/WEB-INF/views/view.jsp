<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 6/16/2021
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Title</title>
    <style>
        div{
            /*text-align: center;*/
            font-size:120% ;
            margin-left: 500px;
            margin-top: 80px;
        }
    </style>
</head>
<body>
<div>


    <h2>Setting mail info</h2>
    <table>
        <tr>
            <td>Languages</td>
            <td>${email.languages}</td>
        </tr>
        <tr>
            <td>Page size</td>
            <td>${email.pageSize}</td>
        </tr>
        <tr>
            <td>Spam filter</td>
            <td>${email.filter}</td>
        </tr>
        <tr>
            <td>Signature</td>
            <td>${email.signature}</td>
        </tr>


    </table>

    <h1>View Mail</h1>
    <button>
        <a href="/">Back to Menu</a>
    </button>
</div>
</body>
</html>