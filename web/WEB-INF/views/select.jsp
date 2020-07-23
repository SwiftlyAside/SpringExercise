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
    <title>Select</title>
    <script>
      function proc(cmd) {
        document.getElementById('form').action = cmd;
        document.getElementById('form').submit();
      }
    </script>
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
<c:if test="${!(empty person)}">
    <form id="form" method="post">
        <input type="hidden" name="id" value="${person.id}">
        <input type="hidden" name="firstName" value="${person.firstName}">
        <input type="hidden" name="lastName" value="${person.lastName}">
        <input type="button" onclick="proc('modify')" value="수정">
        <input type="button" onclick="proc('deleteProc')" value="삭제">
    </form>
</c:if>
</body>
</html>
