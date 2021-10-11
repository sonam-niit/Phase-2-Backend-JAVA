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
String responseCheck=request.getParameter("office");
if(responseCheck!=null)
out.println("Temprray office details "+responseCheck);
else
	out.println("No value for Office found");
%>
</body>
</html>