<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
	<%@ include file="Header.jsp"%>
	<%@ page errorPage="ErrorView.jsp"%>
	<center>
		<h2>STUDENT MANAGEMENT</h2>
		<form action="Student" method="post">
		
				<%
			String s = (String) request.getAttribute("ok");
			if (s != null) {
		%>
		<h1>
			<font color="red"> <%=s%>
			</font>
		</h1>


		<%
			}
		%>
		
		
		
		
		
		
			<table>
				<tr>
					<th><b>Roll No. - </b></th>
					<td><input type="text" value="" name="rollNo"></td>

				</tr>

				<tr>
					<th><b>First Name - </b></th>
					<td><input type="text" value="" name="firstName"></td>

				</tr>
				<tr>
					<th><b> Last Name - </b></th>
					<td><input type="text" value="" name="lastName"></td>

				</tr>
				<tr>
					<th><b>Session - </b></th>
					<td><input type="text" value="" name="session"></td>

				</tr>


				<tr>

					<th>
					<td><input type="submit" name="operation" value="Add">

						<input type="submit" name="operation" value="Delete"> 
						<input
						type="submit" name="operation" value="Modify"></td>
					</th>
				</tr>
			</table>
		</form>
	</center>
	<%@ include file="Footer.jsp"%>




</body>
</html>