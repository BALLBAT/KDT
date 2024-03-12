<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-12
  Time: 오전 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%-- 부트스트랩 css cdn link --%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container">
    URL 매개변수로 dno=10, dName=Accounting, loc=NewYork 받았다. 아래 결과를 화면에 출력하세요.
<p>${dno}</p>
<p>${dname}</p>
<p>${loc}</p>
</div>
</body>
</html>
