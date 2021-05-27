<%--
  Created by IntelliJ IDEA.
  User: Thanh Hậu
  Date: 5/26/2021
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>c:out example</h2>
  <c:out value="${'This is true: 10 > 1 '}" />
  <br/>
  Tag: <c:out value="${'<atag> , &'}"/>
  </body>
</html>
