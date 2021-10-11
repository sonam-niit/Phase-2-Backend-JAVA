<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="handle-error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String responseCheck=request.getParameter("office");
	if(responseCheck!=null){
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", "redirect.jsp?office="+responseCheck);
		
	}
	
	String errorCheck=request.getParameter("error");
	if(errorCheck!=null){
		int x=0;
		x=10/0;
			//throw new RuntimeException("Exception Occured");
	}
%>
<%
	int serverPort=request.getServerPort();
	out.println("Server is running on port number "+String.valueOf(serverPort)+"<br>");
	out.println("Servlet Nmae is "+config.getServletName()+"<br>");
	out.println("Server Info "+application.getServerInfo()+"<br>");
	String pageName=page.toString();
	
	out.println("The name of page is "+pageName+"<br>");
	pageContext.setAttribute("user", "sonam soni");
	out.println("User Id attribute from page Contect "+pageContext.getAttribute("user"));
%>
<a href="index.jsp?office=head_office">Show usage of Response object</a>
<br>
<a href="index.jsp?error=1">Show usage of error Object</a>

<%
	if(response.containsHeader("office"))
		out.println("Current Location is "+response.getHeader("office"));
%>
</body>
</html>