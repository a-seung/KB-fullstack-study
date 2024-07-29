<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<header>
    <%@include file="header.jsp"%>
</header>
    <h1> 작성하신 글의 내용은</h1>
    <h2>${post}</h2>
    <%--<%= request.getAttribute("post")%>--%>
</body>
</html>
