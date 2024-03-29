<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-13
  Time: 오후 5:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!--    bootstrap css cdn -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<%--  main.css import  --%>
    <link href="/resources/css/main.css" rel="stylesheet">
</head>
<body>
<%-- 부트스트랩 메뉴 --%>
<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <%--     1번째 메뉴 : Navbar -> Simple   --%>
        <a class="navbar-brand" href="#">
<%--     TODO: 이미지 넣기     --%>
            <img src="/resources/img/simple-coding.png" width="20" height="20"/>
            Simple</a>
        <%-- 부트스트랩 메뉴 : 화면이 작아지면 단축메뉴로 바뀜 : 아래 태그 --%>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <%--  메뉴 시작  --%>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <%--            대메뉴 시작 --%>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Menu
                    </a>
                    <%--                   소메뉴 --%>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/exam01/dept">Dept</a></li>
                        <li><a class="dropdown-item" href="/exam01/member">Member</a></li>
                    </ul>
                </li>
                    <%--            대메뉴2 시작 --%>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            종합문제
                        </a>
                        <%--                   소메뉴 --%>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/exam01/board">Board</a></li>
                            <li><a class="dropdown-item" href="/exam01/faq">Faq</a></li>
                        </ul>
                    </li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
