<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-06
  Time: 오후 2:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>할 일 목록</title>
</head>
<body>
    <%@ include file="../header.jsp"%>
    <h1>할 일 목록 V3</h1>
    <ul>
        <li><b>할 일 리스트</b></li>
        <c:forEach var="todo" items="${todoDtoList}">
            <li>${todo.todo}</li>
        </c:forEach>
    </ul>
</body>
</html>
