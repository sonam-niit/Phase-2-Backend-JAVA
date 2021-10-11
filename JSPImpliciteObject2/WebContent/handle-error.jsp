<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Handling Page</title>
</head>
<body>
<h3>Exception Occured</h3>
<h4>Following are the exception Details</h4>
<%
	out.println(exception.getMessage());
	//exception.printStackTrace(response.getWriter());
%>
</body>
</html>