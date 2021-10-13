<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Ssessions</title>
</head>
<body>
<%
	if(request.getParameter("error")!=null){
		out.println("Your session has expired or not valid");
	}
%>
<form action="login.jsp" method="post">
	Name: <input type="text" name="name" maxlength="30"><br><br>
	Password: <input type="password" name="pass" maxlength="10"><br><br>
	<input type="submit" value="Login"> 
</form>
</body>
</html>