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
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	
	if(uname.equals("admin")&& pass.equals("admin123")){
%>

	<jsp:forward page="success.jsp">
		<jsp:param value="<%=uname %>" name="user"/>
	</jsp:forward>
<%} 
	else{
%>
	<p style="color:red">Wrong Username or password</p>
	<jsp:include page="login.html"></jsp:include>
<%	}
%>
</body>
</html>