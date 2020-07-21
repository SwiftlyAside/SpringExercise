<%--
  User: iveci
  Date: 2020-07-21
  Time: 14:42
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>AuthForm</title>
</head>
<body>
<form action="authProc" method="get">
    <table>
        <tr>
            <td>
                <label>
                    <input type="text" name="email">
                    <input type="submit" value="인증번호 전송">
                </label>
            </td>
        </tr>
    </table>
</form>
<form action="authProc" method="post">
    <table>
        <tr>
            <td>
                <label>
                    <input type="text" name="email">
                    <input type="submit" value="인증번호 전송 (POST)">
                </label>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
