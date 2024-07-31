
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
    <%@include file="header.jsp"%>
</head>
<body>
    <h1>JSTL 사용하기 실습</h1>
    boolean 값은? ${condition}

    <h2>조건 처리</h2>
    <c:if test="${condition}">
        <p>${msg1}</p>
    </c:if>
    <c:if test="${!condition}">
        <p>${msg2}</p>
    </c:if>

    <h2>리스트 컬렉션 출력하기</h2>
    <c:forEach var="item" items="${lunchList}">
        <li>${item}</li>
    </c:forEach>
</body>
</html>
