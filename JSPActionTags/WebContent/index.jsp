<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="stuBean" class="com.sample.Student" scope="session"></jsp:useBean>
<!--Setting property using setProperty actions-->
<jsp:setProperty property="fname" name="stuBean" value="sonam"/>
<jsp:setProperty property="lname" name="stuBean" value="soni"/>
<jsp:setProperty property="email" name="stuBean" value="sonam@gmail.com"/>

<a href="showbean.jsp">Show Bean Properties in Another Page</a>
</body>
</html>