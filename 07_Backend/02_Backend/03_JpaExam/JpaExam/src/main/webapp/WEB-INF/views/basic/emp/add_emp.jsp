<%--
  Created by IntelliJ IDEA.
  User: BALLBAT
  Date: 2024-03-20
  Time: 오후 5:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 머리말 --%>
<jsp:include page="../../common/header.jsp"/>

<%-- 본문 --%>
<div class="container">
    <div>
        <%--    TODO: 저장(insert - post 방식 - @PostMapping)    --%>
        <form action="/basic/emp/add" method="post">
            <%--      input 태그 : 사원명      --%>
            <div class="mb-3">
                <label for="ename" class="form-label">ename</label>
                <input type="text" class="form-control" id="ename" name="ename" placeholder="사원명 입력">
            </div>
            <%--      input 태그 : 부서위치      --%>
            <div class="mb-3">
                <label for="job" class="form-label">loc</label>
                <input type="text" class="form-control" id="job" name="job" placeholder="직급 입력">
            </div>
            <%--      저장 버튼      --%>
            <div class="mb-3">
                <button type="submit" class="btn btn-primary">저장</button>
            </div>
        </form>
    </div>
</div>
<%-- 꼬리말 --%>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
