<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 26-Jul-21
  Time: 12:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Email</title>
</head>
<body>
<h1>Setting</h1>
<form:form action="/result" method="post" modelAttribute="email">
    <table>
        <tr>
            <th><form:label path="languages">Languages</form:label></th>
            <td>
            <form:select path="languages">
                <form:option value="English"/>
                <form:option value="VietNamese"/>
                <form:option value="Chinese"/>
                <form:option value="Japanese"/>
            </form:select>
            </td>
        </tr>
        <tr>
            <th><form:label path="pageSize">PageSize: </form:label> </th>
            <td>Show
                <form:select path="pageSize">
                    <form:option value="5"/>
                    <form:option value="15"/>
                    <form:option value="25"/>
                    <form:option value="50"/>
                    <form:option value="100"/>
                </form:select>
                emails per page
            </td>
        </tr>
        <tr>
            <th><form:label path="spamsFilter">Spams filter:</form:label>
            <td>
                <input type="checkbox" path="spamsFilter" name="spamsFilter" value="Enable spams filter"></th>
<%--                <form:checkbox disabled="true" path="spamsFilter"></form:checkbox>--%>
                <form:label path="spamsFilter">Enable spams filter</form:label>
            </td>
        </tr>
        <tr>
            <th><form:label path="signature">Signature</form:label></th>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"></td>
            <td><input type="reset" value="Cancel"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
