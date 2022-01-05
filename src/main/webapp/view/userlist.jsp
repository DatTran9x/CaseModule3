`<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 1/5/2022
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/view/user.css">
</head>
<body>
<table>
    <caption>User List</caption>
    <thead>
    <tr>
        <th scope="col"> Id User </th>
        <th scope="col">Name</th>
        <th scope="col">Password</th>
        <th scope="col">Phone number</th>
        <th scope="col">Email</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="p" varStatus="loop">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.password}</td>
            <td>${p.phoneNumber}</td>
            <td>${p.email}</td>
            <td>
                <button formmethod="post"><a href="/user?action=deleteUser&id_user=${p.id}"> Remove </a></button>
            </td>
            <td>
                <button formmethod="get"><a href="/user?action=showEditUserForm&id_user=${p.id}"> Edit </a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
