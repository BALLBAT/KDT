<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-13
  Time: 오전 9:39
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
    <h2>MultiPathVariable 연습</h2>
    <%-- jsp el 표현식 --%>
    <p>${dno}</p>
    <p>${dname}</p>
    <p>${loc}</p>
</div>
</body>
</html>
