<%--
  Created by IntelliJ IDEA.
  User: BALLBAT
  Date: 2024-03-18
  Time: 오전 10:57
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
    <form action="/exam01/faq/add" method="post">
        <%--    부트스트랩 input 양식    --%>
        <div class="mb-3">
            <label for="subject" class="form-label">subject</label>
            <input type="text"
                   class="form-control"
                   id="subject"
                   name="subject"
                   placeholder="제목 입력">
        </div>

        <div class="mb-3">
            <label for="text" class="form-label">text</label>
            <input type="text"
                   class="form-control"
                   id="text"
                   name="text"
                   placeholder="내용 입력">
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
