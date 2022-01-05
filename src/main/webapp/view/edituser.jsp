<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 1/5/2022
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <form action="/user?action=editUser&id=${requestScope["user"].id}" method="post">
        <h1>Edit user</h1>
        <td>ID</td>
        <td><p>${requestScope["user"].id}</p></td>
        <td><p>Name</p></td>
        <td><input type="text" name="name"></td>
        <td><p>Password</p></td>
        <td><input type="text" name="password"></td>
        <td><p>Phone Number</p></td>
        <td><input type="text" name="phoneNumber"></td>
        <td>Email</td>
        <td><input type="text" name="email"></td>
        <td><input type="submit" value="edit"></td>
    </form>
</table>
</body>
</html>
