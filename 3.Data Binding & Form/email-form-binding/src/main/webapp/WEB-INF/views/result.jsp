<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 26-Jul-21
  Time: 12:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Information</title>
</head>
<body>
<h2>Email information</h2>
<table>
    <tr>
        <td>Languages: </td>
        <td>${languages}</td>
    </tr>
    <tr>
        <td>Page size: </td>
        <td>${pageSize}</td>
    </tr>
    <tr>
        <td>Spam filter: </td>
        <td>${spamsFilter}</td>
    </tr>
    <tr>
        <td>Signature: </td>
        <td>${signature}</td>
    </tr>
</table>

</body>
</html>
