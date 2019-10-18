<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/10/15
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>ssmtest</title>
</head>
<body>
<h2>Hello World!</h2>
<table>
    <thead>
    <th>
    <td>id</td>
    <td>name</td>
    <td>age</td>
    <td>time</td>
    </th>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="sysuser">
        <tr>
            <td>${sysuser.id}</td>
            <td>${sysuser.name}</td>
            <td>${sysuser.age}</td>
            <td>${sysuser.createTime}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
