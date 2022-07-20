<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bg color = "green">

 <%@include file="Header.jsp"%> 
 <%@ page errorPage="ErrorView.jsp"%>
<form action="regctl" method="post">

		<div align="center">
			<h1>USER REGISTRATION</h1>
				<%
				String s = (String) request.getAttribute("fmsg");
				String L = (String) request.getAttribute("lmsg");
				String q = (String) request.getAttribute("lomsg");
				String w = (String) request.getAttribute("Pmsg");
			//	String e = (String) request.getAttribute("gmsg");
				String r = (String) request.getAttribute("dmsg");
				String t = (String) request.getAttribute("mmsg");
			
			%>
		
			<table>
				<tr>
					<th>First Name :</th>
					<td><input type="text" name="fname"></td>
						<td>
						<%
							if (s != null) {
						%><p>
							<font color="red"><%=s%></font>
						</p>
						<%
							}
						%>
					</td>
				</tr>
				
				<tr>
					<th>Last Name :</th>
					<td><input type="text" name="lname"></td>
						<td>
						<%
							if (L != null) {
						%><p>
							<font color="red"><%=L%></font>
						</p>
						<%
							}
						%>
					</td>
				</tr>
				
				<tr>
					<th>Login :</th>
					<td><input type="text" name="login"></td>
						<td>
						<%
							if (q != null) {
						%><p>
							<font color="red"><%=q%></font>
						</p>
						<%
							}
						%>
					</td>
				</tr>
				
				<tr>
					<th>Password :</th>
					<td><input type="password" name="pwd"></td>
						<td>
						<%
							if (w != null) {
						%><p>
							<font color="red"><%=w%></font>
						</p>
						<%
							}
						%>
					</td>
				</tr>
				
				<tr>
					<th>Gender :</th>
					<td><input type="radio" name="gender" value="male">Male <input
						type="radio" name="gender" value="Female">female <input type="radio"
						name="gender" value = "Other">other</td> 
						<%-- 	<td>
						<%
							if (e != null) {
						%><%=e%>
						
						<%
							}
						%> --%>
					</td>
               </tr>
               
				<tr>
					<th>DOB :</th>
					<td><input type="date" name="dob"></td>
						<td>
						<%
							if (r != null) {
						%><p>
							<font color="red"><%=r%></font>
						</p>
						<%
							}
						%>
					</td>
				</tr>
				
				<tr>
					<th>Mob No :</th>
					<td><input type="text" name="mob"></td>
						<td>
						<%
							if (t != null) {
						%><p>
							<font color="red"><%=t%></font>
						</p>
						<%
							}
						%>
					</td>
				</tr>
				
				
				
				<tr>
					<th></th>
					<td><input type="submit" name ="Register" value="Register"></td>
				</tr>

			</table>
		</div>

	</form>
<%@include file="Footer.jsp"%> 
</body>
</html>