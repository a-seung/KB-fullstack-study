<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오전 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

  <hr>
  <c:if test="${empty user}">
  <a href="/login_form.jsp">로그인</a> | <a href="#">회원가입</a>
  </c:if>

  <c:if test="${!empty user}">
  ${user.name} | <a href="/logout">로그아웃</a>
  </c:if>
<hr>