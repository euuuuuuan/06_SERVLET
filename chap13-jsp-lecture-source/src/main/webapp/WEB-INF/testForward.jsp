<%--
  Created by IntelliJ IDEA.
  User: 80417
  Date: 2024-07-04
  Time: 오전 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><%= request.getAttribute("fullname")%>님 환영합니다.
</h1>
<h2>1. ${ name }</h2>
<h2>1. ${ param.name }</h2>
<h2>1. ${ fullname }</h2>
<h2>2. ${ member }</h2>
<%-- 동일한 키 값을 가지는 경우 작은 영역부터 넓은 영역 순으로 우선순위를 가진다.--%>
<%-- page -> request -> session -> context --%>
<h2>3. ${ requestScope.fullname } </h2>
<h2>3. ${ sessionScope.fullname } </h2>
</body>
</html>
