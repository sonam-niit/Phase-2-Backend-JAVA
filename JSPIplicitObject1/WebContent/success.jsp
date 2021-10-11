<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name=(String)session.getAttribute("USER");
%>
<H2>Welcome <%=name %></H2>

<a href="logout.jsp">Logout</a>
</body>
</html>