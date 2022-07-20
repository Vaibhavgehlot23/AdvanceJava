<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file = "Header.jsp" %>
<%@ page errorPage="ErrorView.jsp"%>
<center>
        <h1>Marksheet List</h1>
        <table>
            <tr>
                <td align="center"><b> Name :</b> <input type="text" name="name" value="">
                    <b>RollNo :</b> <input type="text" name="rollNo" value=""> 
                    <input type="submit" name="operation" value="Search">
                </td>
            </tr>
        </table><br>
        <table border="5" cellspacing="0" width="100%">
            <tbody>
                <tr>
                    <th>Select</th>
                    <th>ID</th>
                    <th>Roll No.</th>
                    <th>Name</th>
                    <th>Maths</th>
                    <th>Physics</th>
                    <th>Chemistry</th>
                    <th>Edit</th>
                </tr>
                <tr>
                    <td><input type="checkbox" name="id" value="1"></td>
                    <td>1</td>
                    <td>0101EC171121</td>
                    <td>Vaibhav Gehlot</td>
                    <td>80</td>
                    <td>60</td>
                    <td>72</td>
                    <td>Edit</td>
                </tr>
                <tr>
                    <td><input type="checkbox" name="id" value="2"></td>
                    <td>2</td>
                    <td>0101EC171122</td>
                    <td>Ravi Patidar</td>
                    <td>78</td>
                    <td>89</td>
                    <td>67</td>
                    <td>Edit</td>
                </tr>
                <tr>
                    <td><input type="checkbox" name="id" value="3"></td>
                    <td>3</td>
                    <td>0101EC171123</td>
                    <td>Aniket Sirota</td>
                    <td>50</td>
                    <td>62</td>
                    <td>69</td>
                    <td>Edit</td>
                </tr>
                <tr>
                    <td><input type="checkbox" name="id" value="4"></td>
                    <td>4</td>
                    <td>0101EC171124</td>
                    <td>Shubham Kumawat</td>
                    <td>80</td>
                    <td>74</td>
                    <td>58</td>
                    <td>Edit</td>
                </tr>
                <tr>
                    <td><input type="checkbox" name="id" value="5"></td>
                    <td>5</td>
                    <td>0101EC171125</td>
                    <td>Utkarsh Verma</td>
                    <td>86</td>
                    <td>58</td>
                    <td>42</td>
                    <td>Edit</td>
                </tr>

            </tbody>
        </table>
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
    
<%@ include file = "Footer.jsp" %>
</body>
</html>