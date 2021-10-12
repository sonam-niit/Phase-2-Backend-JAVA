<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
  <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="Hello World"></c:out>
<c:set var="name" value="Sonam Soni"></c:set>
Length of name: ${fn:length(name) }

<h2>Use of for each loop: table of 5</h2>
<c:forEach begin="1" end="10" var="x">
	5 X ${x } = ${x*5 } <br>
</c:forEach>
<h3>Format Date</h3>

<p>format Date:
	<fmt:formatDate value="<%= new Date()%>" type="date" />
</p>
<p>format Time:
	<fmt:formatDate value="<%= new Date()%>" type="time" />
</p>
</body>
</html>