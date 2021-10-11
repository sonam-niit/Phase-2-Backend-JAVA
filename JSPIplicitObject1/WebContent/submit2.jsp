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
	String password= request.getParameter("pass");
	
	if(uname.equals("sonam") && password.equals("admin123")){
		session.setAttribute("USER", uname);
		response.sendRedirect("success.jsp");
	}
	else{
 %> 
 	<h3 style="color:red">Wrong User name and password</h3> 
	<a href="login.html">Login Again</a> 
	<%} %> 

</body>
</html>