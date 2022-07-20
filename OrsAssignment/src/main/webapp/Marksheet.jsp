<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="darkolivegreen">

	<%@ include file="Header.jsp"%>
	<%@ page errorPage="ErrorView.jsp"%>
	<center>
	<form action="Mark" method="post">
		<%
			String s = (String) request.getAttribute("ok");
			if (s != null) {
		%>
		<h1>
			<font color="White"> <%=s%>
			</font>
		</h1>


		<%
			}
		%>
</center>
		<center>
			<h1>Add Marksheet</h1>

			<table>
				<tr>
					<th><b>Roll No. - </b></th>
					<td><input type="text"  name="Rollno"></td>
				</tr>
				<tr>
					<th><b>Name - </b></th>
					<td><input type="text"  name="Name"></td>
				<tr>
					<th><b>Physics - </b></th>
					<td><input type="text"name="Physics"></td>
				</tr>
				<tr>
					<th><b>Chemistry - </b></th>
					<td><input type="text" name="Chemistry"></td>
					</td>
				</tr>

				</tr>
				<th><b>Maths - </b></th>
				<td><input type="text"  name="Maths"></td>
				</tr>
				<td colspan="2" align="center"><input type="submit"
					value="Save"> <input type="submit" value="Cancel"></td>

			</table>

			<%@ include file="Footer.jsp"%>
</body>
</html>