<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H2>successfully logged out</H2>
<a href="login.html">Click here to login again</a>
<%
	session.invalidate();
%>
</body>
</html>