<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: iveci
  Date: 2020-07-21
  Time: 10:31
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Select</title>
</head>
<body>
<h1><a href="selectAll">Welcome to select.</a></h1>
<hr>
<c:forEach var="p" items="${personList}">
    <a href="selectPart?id=${p.id}">${p.id} ${p.firstName} ${p.lastName}</a><br>
</c:forEach>
<h2>
    ${person.id} ${person.firstName} ${person.lastName}<br>
</h2>
</body>
</html>
