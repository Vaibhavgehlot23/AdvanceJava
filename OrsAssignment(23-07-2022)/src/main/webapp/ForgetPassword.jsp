

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="LightSkyBlue">
	<%@include file="Header.jsp"%>
	<%@ page errorPage="ErrorView.jsp"%>

	<center>
		<form action="Forget" method="post">
			<%
				String s = (String) request.getAttribute("Nmsg");
				if (s != null) {
			%>
			<h1>
				<font color="green"> <%=s%>
				</font>
			</h1>

			<%
				}
			%>
			<h1>Forget your password ?</h1>
			<h2>Submit your Email address and we will send you password</h2>
			<p>Password will be sent to your registered Email Id.</p>
			<table>
				<tbody>
					<tr>
						<td class="label">Email Id:</td>
						<td><input type="text" name="login"
							placeholder="Enter ID Here"> <input
							type="submit" name="operation" value="Go"></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><font color="Red">
								Email Id is required</font></td>
					</tr>
				</tbody>
			</table>
	</center>
	<%@include file="Footer.jsp"%>
</body>
</html>