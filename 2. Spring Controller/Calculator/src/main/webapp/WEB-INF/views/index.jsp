<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 17-Sep-21
  Time: 6:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form:form action="calculator" method="post">
    <input type="number" name="number1" value ="${num1}" placeholder="First Number"><br>
    <input type="number" name="number2"  value="${num2}" placeholder="Second Number"><br>
    <input type="submit" name="calculation"  value="Additon(+)">
    <input type="submit" name="calculation" value="Subtraction(-)">
    <input type="submit" name="calculation" value="Multiplication(X)">
    <input type="submit" name="calculation" value="Division(/)">
</form:form>
<h3>Result ${result}</h3>
</body>
</html>
