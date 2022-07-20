
<%@page import="org.omg.CORBA.Request"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>

<body bgcolor="palegoldenrod">

	<%@include file="Header.jsp"%>
	<%@ page errorPage="ErrorView.jsp"%>

	<center>
		<form action="Login" method="post">
			<h1>Login..</h1>
			<%
				String s = (String) request.getAttribute("msg");

				String L = (String) request.getAttribute("Lmsg");
				String P = (String) request.getAttribute("Pmsg");
				if (s != null) {
			%>
			<h1>
				<font color="Red"> <%=s%>

				</font>
			</h1>


			<%
				}
			%>
			<%
				String s1 = (String) request.getAttribute("Error");
				if (s1 != null) {
			%>
		<h1>	<font color="Red"> <%=s1%></font></h1>
			<%
				}
			%>
			<table>
				<tr>
					<th><b>Login Id - </b></th>
					<td><input type="text" size="15" name="login"></td>
					<td>
						<%
							if (L != null) {
						%>
						<h3>
							<font color="red"><%=L%></font>
						</h3> <%
 	}
 %>
					</td>

				</tr>
				<tr>
					<th><b>Password - </b></th>
					<td><input type="password" size="15" name="pwd"></td>
					<td>
						<%
							if (P != null) {
						%><h3>
							<font color="red"><%=P%></font>
						</h3> <%
 	}
 %>
					</td>
				</tr>
				<tr>
					<th></th>
					<td><input type="Submit" value="SignIn" name="SignIn">
				</tr>
				<tr>
					<th></th>
					<td colspan="2" align="left"><a href="RegView.jsp"><b>Create
								Account </b></a> -- <a href="ForgetPassword.jsp"><b>Forget
								password</b></a>&nbsp;</td>
				</tr>
			</table>
		</form>



	</center>



	<%@include file="Footer.jsp"%>

</body>
</html>