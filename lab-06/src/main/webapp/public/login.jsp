<%--
  Created by IntelliJ IDEA.
  User: red21
  Date: 6/13/2017
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/j_spring_security_check" method="post">
    Username:
    <input type="text" name="j_username">
    <br>

    Password:
    <input type="password" name="j_password">
    <br>

    <input type="submit" value="Login">

</form>


</body>
</html>
