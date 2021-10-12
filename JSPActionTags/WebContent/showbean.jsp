<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Access Bean Property in Another Page</h2>
<jsp:useBean id="stuBean" class="com.sample.Student" scope="session"></jsp:useBean>

First Name:<jsp:getProperty property="fname" name="stuBean"/><br>
Last Name: <jsp:getProperty property="lname" name="stuBean"/><br>
Email Id: <jsp:getProperty property="email" name="stuBean"/><br>
</body>
</html>