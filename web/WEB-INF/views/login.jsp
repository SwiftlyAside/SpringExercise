<%--
  User: iveci
  Date: 2020-07-21
  Time: 10:30
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login.</h1>
<hr>
<form action="loginForm" method="post">
    <table>
        <tr>
            <td>
                <label>
                    아이디
                    <input type="text" name="userId">
                </label>
            </td>
        </tr>
        <tr>
            <td>
                <label>
                    패스워드
                    <input type="password" name="userPass">
                </label>
            </td>
        </tr>
    </table>
    <button type="submit">로그인</button>
    <button type="reset">취소</button>
</form>
</body>
</html>
