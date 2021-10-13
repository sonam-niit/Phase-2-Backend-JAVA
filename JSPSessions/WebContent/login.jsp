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
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
	
	if(name==null || name.equals("")|| pass.equals("") || pass==null){
		response.sendRedirect("index.jsp?error=1");
	}
	else{
		session.setAttribute("name", name);
		response.sendRedirect("dashboard.jsp");
	}
%>
</body>
</html>