<%--
  Created by IntelliJ IDEA.
  User: kuwu
  Date: 2017/07/24
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<form method="post" action = "/addUser">
    First Name: <input type="text" name="c_first">
    <br>
    Last Name: <input type="text" name="c_last">
    <br>
    Email: <input type="email" name="c_email">
    <br>
    Phone Number: <input type="tel" name="c_tel">
    <br>
    Password: <input type="password" name="c_password">
    <br>
    <input type="submit" value="Register">
</form>

</body>
</html>
