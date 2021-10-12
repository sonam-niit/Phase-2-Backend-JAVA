<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="veggi">
	<vegetables>
		<vegetable>
			<name>Potato</name>
			<price>35</price>
		</vegetable>
		<vegetable>
			<name>Onion</name>
			<price>40</price>
		</vegetable>
		<vegetable>
			<name>Chiily</name>
			<price>100</price>
		</vegetable>
	</vegetables>
</c:set>
<x:parse xml="${veggi }" var="v"></x:parse>
<x:set var="pota" select="$v/vegetables/vegetable[2]/price"/>
Price of Potato <x:out select="$pota"/>
</body>
</html>