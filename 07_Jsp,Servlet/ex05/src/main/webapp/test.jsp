<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오전 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    //    int age = 10; // 지역변수
    //    request.setAttribute("age",40); // request스코프에 age라는 이름으로 40을 저장한 것

    Integer age = null;
//    request.setAttribute("age", null);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
변수 age : <%= age%> <br>
El age : ${age}
<%--스코프의 키 이름임
    EL age에서는 null을 출력 안 해줌, 아예 설정을 안해줘도 출력 안 해줌
    page < request < session < application
    --%>
</body>
</html>
