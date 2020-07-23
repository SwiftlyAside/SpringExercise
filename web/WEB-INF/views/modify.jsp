<%--
  User: iveci
  Date: 2020-07-21
  Time: 10:31
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Modify</title>
</head>
<body>
<form action="modifyProc" method="post">
    <label>
        ID:
        <input type="text" name="id" value="${person.id}" readonly>
    </label>
    <label>
        First Name:
        <input type="text" name="firstName" value="${person.firstName}">
    </label>
    <label>
        Last Name:
        <input type="text" name="lastName" value="${person.lastName}">
    </label>
    <input type="submit" value="수정">
</form>
</body>
</html>
