<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-14
  Time: 오후 5:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 머리말 --%>
<jsp:include page="../../common/header.jsp"/>

<div class="container">
    <form action="" method="post">
        <%--        TODO: 아래 input(hidden) 사용하면 put 방식으로 전송됨 --%>
        <input type="hidden" name="_method" value="put"/>
        <%--        TODO: 상세조회 값을 input 태그에 출력 : value=값 --%>
        <%--        TODO: 부서번호(기본키) 숨김 : 수정불가 --%>
        <input type="hidden" name="eno" value="${member.eno}"/>
        <div class="mb-3">
            <%--            사원명 입력양식 --%>
            <label for="ename" class="form-label">ename</label>
            <input type="text"
                   class="form-control"
                   id="ename"
                   name="ename"
                   value="${member.ename}"
                   placeholder="사원명입력">
        </div>
        <div class="mb-3">
            <%--            직위 입력양식 --%>
            <label for="job" class="form-label">job</label>
            <input type="text"
                   class="form-control"
                   id="job"
                   name="job"
                   value="${member.job}"
                   placeholder="직위 입력">
        </div>

            <div class="mb-3">
                <%--            관리자 사원번호 입력양식 --%>
                <label for="manager" class="form-label">manager</label>
                <input type="text"
                       class="form-control"
                       id="manager"
                       name="manager"
                       value="${member.manager}"
                       placeholder="관리자 사원번호 입력">
            </div>

        <%--     수정버튼       --%>
        <div class="mb-3">
            <button type="submit" class="btn btn-warning">수정</button>
        </div>
    </form>
</div>
<%-- 꼬리말 --%>
<jsp:include page="../../common/footer.jsp"/>
</body>
</html>