<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Registration</title>
    <style>
        .error{
            background-color: #ffa7a7;
            color: #ff3f6b;
        }
    </style>
</head>
<body>
<h1>Registration Page</h1>
<form:form modelAttribute="Registration">
    <form:errors path="name" cssClass="error" element="div"/>
    <table>
        <tr>
            <td>
                <spring:message code="name"/>
            </td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add Registration">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
