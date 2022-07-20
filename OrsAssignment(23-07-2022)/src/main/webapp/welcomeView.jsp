<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="Header.jsp"%>
<body bgcolor="LightSeaGreen">

	<%@ page errorPage="ErrorView.jsp"%>
	<h1 style="color: red;">
		<%
			String s = (String) request.getAttribute("Nmsg");
			String s1 = (String) request.getAttribute("visitCount");
			if (s != null) {
		%><h1 style="color: green">
			Hi "<%=s%>"
			<%=s1%></h1>
		<br> <a href="LoginView.jsp"><b>LogOut</b></a>
		<%
			}
		%>
		<center>
			<h1 style="color: red">Welcome to ORS</h1>
		</center>
	</h1>
	<%@include file="Footer.jsp"%>
</body>
</html>