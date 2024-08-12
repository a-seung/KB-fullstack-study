<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="ko">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Firefly</title>

    <%--외부 라이브러리 먼저 써주고 내부 파일 써줌 (순서 중요)--%>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" href="/resources/css/main.css" />

    <%--스크립트 부분도 순서 중요--%>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="/resources/js/main.js"></script>
</head>

<body>
<header class="jumbotron mb-0 rounded-0">
    <h1>Backend Study</h1>
    <p>자바 기반의 백엔드 기술을 배웁니다.</p>
</header>
<%@ include file="menu.jsp"%>
<div class="container my-5">
<%--div 닫는태그는 footer에 있음--%>