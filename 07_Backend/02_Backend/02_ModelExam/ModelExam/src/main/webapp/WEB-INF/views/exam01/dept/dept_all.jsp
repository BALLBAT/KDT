<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-13
  Time: 오후 2:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <!--    bootstrap css cdn -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<%-- TODO: jsp 파일 끼워넣기 사용법 : <jsp:include page="jsp 경로"/>--%>
<%-- 머리말 --%>
<jsp:include page="../../common/header.jsp"/>
<%-- 본문 --%>
<div class = "container">
    <h2>전체 조회</h2>
    <p>${list}</p>
    <table class="table">
        <thead>
        <tr>
<%--      테이블 행      --%>
<%--     TODO: 부서번호(dno) : 클릭하면 => 수정 페이지 열기      --%>
<%--  수정 페이지 url : /exam01/dept/edition/부서번호  --%>
            <th scope="col">dno</th>
            <th scope="col">dname</th>
            <th scope="col">loc</th>
        </tr>
        </thead>
        <tbody>
        <%-- 복습 : tr : 1행, td/th : 1열(컬럼) --%>
        <%-- jsp 반복문(jstl 표현식, taglib 임포트) --%>
        <%-- 사용법 : <c:forEach var="변수" items="${배열}"> --%>
        <c:forEach var="data" items="${list}">
            <tr>
                <td>
                    <a href="/exam01/dept/edition/${data.dno}">${data.dno}</a>
                </td>
                <td>${data.dname}</td>
                <td>${data.loc}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

<%--  TODO: 추가버튼 추가 : a href="이동페이지수소" 태그 --%>
    <div class="text-center">
        <a href="/exam01/dept/addition" class="btn btn-primary">추가</a>
    </div>
</div>

<%-- 꼬리말 --%>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
