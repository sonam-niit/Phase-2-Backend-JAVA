<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="connect" driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/ecommerce?characterEncoding=utf8"
user="root" password="master"/>

<sql:query var="rs" dataSource="${connect }">
	select * from eproduct;
</sql:query>

<c:forEach var="p" items="${ rs.rows}">
<c:out value="${p.ID }"></c:out>
<c:out value="${p.name }"></c:out>
<c:out value="${p.price }"></c:out>
<c:out value="${p.date }"></c:out>
<br>
</c:forEach>
</body>
</html>