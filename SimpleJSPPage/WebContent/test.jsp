<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Declaration in JSP -->
<%! String message="Hello World"; %>
<!-- Scriptlet in JSP -->
<h2><% out.println(message); %></h2>
<br>
Message:<%= message %> <!-- Expression --> <br>

<%! int cube(int x){
		return x*x*x;
	}%>
	
<p>Cube of 5 is <%= cube(5) %> </p>

<%
	int a,b;
	a=10;
	b=20;
	out.println("Addition of a and b "+(a+b));
%>

<h2>Today's Date: <%= new Date() %></h2>

</body>
</html>