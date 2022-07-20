<%@page import="in.co.Bean.MarksheetBean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>

<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Marksheet List</title>
</head>
<body>
<center>
	<table border="">
		<tr>
			<td>id</td>
			<td>rollno</td>
			<td>name</td>
			<td>physics</td>
			<td>chemistry</td>
			<td>maths</td>
		</tr>
		<%
			ArrayList al = (ArrayList) request.getAttribute("ok");
			Iterator<MarksheetBean> it = al.iterator();
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
	</center>
	</table>
	<center>
		<form action="markView2" method="post">
			<h1>Get Marksheet..</h1>

			<table>
				<tr>
					<th><b>Enter Roll No. - </b></th>
					<td><input type="text" size="15" name="rollNo"><br>



					</td>
					<td><input type="submit" value="Search" name="operation">
					</td>
				</tr>
			</table>
	</center>

	<%@ include file="Footer.jsp"%>
	</form>




</body>
</html>