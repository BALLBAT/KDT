<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-12
  Time: 오후 2:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>매개변수 전달 받아 출력 : 조건문 (연습)</h2>
    <p>${title}</p>
    <p>${color}</p>
    <p>${kind}</p>

    <c:if test="${title == '아반떼'}">
        <p>아반떼가 맞습니다.</p>
    </c:if>
    <c:choose>
        <c:when test="${color == 'grey'}">
            <p>회색입니다.</p>
        </c:when>

        <c:when test="${kind == 'suv'}">
            <p>suv가 맞습니다.</p>
        </c:when>
    </c:choose>
</div>
</body>
</html>
