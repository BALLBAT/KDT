<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-14
  Time: 오후 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    머리말--%>
<jsp:include page="../../common/header.jsp"/>
<%--    본문--%>
<div class="container">
    <form action="/exam01/member/add" method="post">
        <%--    부트스트랩 input 양식    --%>
        <div class="mb-3">
            <%--            사원명 입력양식 --%>
            <label for="ename" class="form-label">ename</label>
            <input type="text"
                   class="form-control"
                   id="ename"
                   name="ename"
                   placeholder="사원명 입력">
        </div>

        <div class="mb-3">
            <%--            부서 위치 입력양식 --%>
            <label for="job" class="form-label">Job</label>
            <input type="text"
                   class="form-control"
                   id="job"
                   name="job"
                   placeholder="직급 입력">
        </div>

            <div class="mb-3">
                <%--            매니저 입력양식 --%>
                <label for="manager" class="form-label">Manager</label>
                <input type="text"
                       class="form-control"
                       id="manager"
                       name="manager"
                       placeholder="관리자 사원번호 입력">
            </div>

        <div class="mb-3">
            <%--     저장하기 버튼      --%>
            <button type="submit" class="btn btn-primary">저장</button>
        </div>
    </form>

</div>
<%--    꼬리말--%>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>
