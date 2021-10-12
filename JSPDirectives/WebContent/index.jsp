<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>include login file</h2>
<%@include file="login.html" %>

<p>
	Currency = <fmt:formatNumber  value="234" type="currency"></fmt:formatNumber>

</p>
<p>
	Current Date and time: <fmt:formatDate value="<%= new Date() %>" pattern="yyy-MM-dd hh:mm:ss" />
</p>
</body>
</html>