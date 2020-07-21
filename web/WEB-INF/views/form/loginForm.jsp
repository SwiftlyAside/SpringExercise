<%--
  User: iveci
  Date: 2020-07-21
  Time: 11:09
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>좋았어</h1>
<hr>
당신의 아이디와 비밀번호가 유출되었습니다.<br>
<%=request.getAttribute("userId")%><br>
<%=request.getAttribute("userPass")%> <br>
이미 당신의 계정은 삭제되었습니다.<br>
복구하시려면 bitCoin 지갑= 86ukHWSLyiASL8X6VyiAS6ukHW5XH85X6VyiA6uk6VW5L로 5 비트코인을 전송하세요.
</body>
</html>
