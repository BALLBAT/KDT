<%--
  Created by IntelliJ IDEA.
  User: BALLBAT
  Date: 2024-03-20
  Time: 오후 4:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--머리말--%>
<jsp:include page="../../common/header.jsp" />
<%--본문--%>
<div class="container">
    ${emp}
</div>
<%--꼬리말--%>
<jsp:include page="../../common/footer.jsp" />
</body>
</html>
