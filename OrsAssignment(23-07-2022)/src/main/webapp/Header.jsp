<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.Header {
	width: 100%;
	background-color: Lightgrey;
	color: Red;
}
</style>
</head>
<body>
	<div class="Header">
		<table>
			<tbody>
				<th>
				<td>
				<tr>


					<img align="right" src="logo.png" height="15%" width="15%">
				</tr>
				</td>
				</th>


				<%
					String name = (String) session.getAttribute("Nmsg");
				%>


				<%
					if (name != null) {
				%>
				<h2>
					Hii , "<%=name%>"
				</h2>
				<%
					} else {
				%>

				<h3>Hi, guest</h3>
				<%
					}
				%>
				<%
					if (name != null) {
				%>
				<a href="Login">Logout</a> |
				<a href="AddMarksheet.jsp">Add Marksheet</a> |
				<a a href="Marksheetctl">Marksheet List</a> |
				<a a href="MeritCtl">Marksheet Merit List</a> |
				<a a href="StudentManagementView.jsp">StudentManagement</a> |
				<a a href="getctl">GetMarksheet</a> |
				<a href="VisitorCount">VistorsCount</a> |
				<%
					} else {
				%>
				<a href="RegView.jsp">Register</a> |
				<a href="LoginView.jsp">Login</a> |
				<%
					}
				%>

				<hr>

			</tbody>

		</table>
	</div>
</body>
</html>