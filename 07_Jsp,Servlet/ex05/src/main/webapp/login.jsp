<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오전 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="navbar.jsp"%>
</head>
<body>
    <h1>EL 실습</h1>

    사용자 아이디 : ${userid} <br>
    <%-- <%= request.getAttribute("userid")%> --%>
    사용자 비밀번호 : ${passwd} <br>

<br>
    ${login.name} / ${login.password}
    <%-- ${키값.속성값}--%>

</body>
</html>
