<%@page import="java.util.ArrayList"%>
<%@page import="java.util.*"%>
<%@page import="in.co.Bean.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="Header.jsp"%>
	<form action="getctl" method="post">
		<center>


			<h1>Get Marksheet..</h1>

			<table>
				<tr>
					<th><b>Enter Roll No. - </b></th>
					<td><input type="text" size="15" name="rno"><br>



					</td>
					<td><input type="submit" value="Search" name="operation">
					</td>
				</tr>
			</table>
		</center>
		<br> <br> <br>

		<center>
			<table border="1" cellspacing="0" width="50%">
				<tr>
					<td>Id</td>
					<td>Rollno</td>
					<td>Name</td>
					<td>Physics</td>
					<td>Chemistry</td>
					<td>Maths</td>
				</tr>

				<%
					ArrayList a = (ArrayList) request.getAttribute("ok");
					Iterator<MarksheetBean> it = a.iterator();
					while (it.hasNext()) {
						MarksheetBean mb = it.next();
				%>


				<tr>
					<td><%=mb.getId()%></td>
					<td><%=mb.getRollno()%></td>
					<td><%=mb.getName()%></td>
					<td><%=mb.getPhy()%></td>
					<td><%=mb.getChem()%></td>
					<td><%=mb.getMaths()%></td>
				</tr>


						<%
				}
			%>
</table>

		</center>







		<%@ include file="Footer.jsp"%>
	</form>
</body>
</html>