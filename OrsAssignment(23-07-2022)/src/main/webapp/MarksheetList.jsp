<%@page import="in.co.Bean.MarksheetBean" %>
	<%@page import="java.util.Iterator" %>
		<%@page import="java.util.ArrayList" %>
			<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
				<!DOCTYPE html>
				<html>

				<head>
					<meta charset="ISO-8859-1">
					<title>Insert title here</title>
				</head>

				<body>

					<%@ include file="Header.jsp" %>


						<%@ page errorPage="ErrorView.jsp" %>
							<form action="Marksheetctl" method="post"></form>
							<center>
								<h1>Marksheet List</h1>

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

										<% ArrayList a=(ArrayList) request.getAttribute("ok"); Iterator<MarksheetBean>
											it = a.iterator();

											while (it.hasNext()) {
											MarksheetBean mb = it.next();
											%>


											<tr>
												<td>
													<%=mb.getId()%>
												</td>
												<td>
													<%=mb.getRollno()%>
												</td>
												<td>
													<%=mb.getName()%>
												</td>
												<td>
													<%=mb.getPhy()%>
												</td>
												<td>
													<%=mb.getChem()%>
												</td>
												<td>
													<%=mb.getMaths()%>
												</td>
											</tr>



											<% } %>
									</table>
								</center>
								<table>
									<tbody>
										<tr>
											<td><input type="submit" name="operation" value="Previous"></td>
											<td><input type="submit" name="operation" value="New"></td>
											<td><input type="submit" name="operation" value="Delete"></td>
											<td><input type="submit" name="operation" value="Next"></td>
										</tr>

									</tbody>
								</table>
							</center>

							<%@ include file="Footer.jsp" %>
				</body>

				</html>