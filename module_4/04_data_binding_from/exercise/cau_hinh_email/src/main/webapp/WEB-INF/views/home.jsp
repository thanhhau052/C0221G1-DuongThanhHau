<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Home</title>
    <style>
        div {
            /*text-align: center;*/
            font-size: 120%;
            margin-left: 500px;
            margin-top: 80px;
        }
    </style>
</head>
<body>
<div>

    <h1>Settings</h1>
    <form:form action="/addEmail" method="post" modelAttribute="email">
        <table>
            <tr>
                <td><form:label path="languages">Languages</form:label></td>
                <td>
                    <form:select path="languages">
                        <form:options items="${listLanguages}"/>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="pageSize">Page size</form:label></td>
                <td>Show
                    <form:select path="pageSize">
                        <form:options items="${listSize}"/>
                    </form:select>
                    emails per page
                </td>
            </tr>
            <tr>
                <td><form:label path="filter">Spam filter</form:label></td>
                <td>
                    <form:checkbox path="filter"/>
                    <form:label path="filter">Enable spams filter</form:label>
                </td>
            </tr>

            <tr>
                <td><form:label path="signature">Signature</form:label></td>
                <td><form:textarea path="signature"/></td>
            </tr>
            <tr>
                <td><input style="background:#0f86ff" type="submit" value="Update"></td>
                <td><input type="reset" value="Cancel"></td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>
