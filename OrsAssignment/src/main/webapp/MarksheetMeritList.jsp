<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<%@ page errorPage="ErrorView.jsp"%>
<center>
    <h1>Marksheet Merit List</h1>
    <form action="">
        <br>
        <table border="1" cellspacing="0" width="90%">
            <tbody>
                <tr>
                    <th>ID</th>
                    <th>Roll No</th>
                    <th>Name</th>
                    <th>Physics</th>
                    <th>Chemistry</th>
                    <th>Maths</th>
                </tr>
                <tr>

                    <td>1</td>
                    <td>0101EC171122</td>
                    <td>Ravi Patidar</td>
                    <td>78</td>
                    <td>89</td>
                    <td>67</td>

                </tr>
                <tr>

                    <td>2</td>
                    <td>0101EC171124</td>
                    <td>Shubham Kumawat</td>
                    <td>80</td>
                    <td>74</td>
                    <td>58</td>

                </tr>

                <tr>

                    <td>3</td>
                    <td>0101EC171121</td>
                    <td>Vaibhav Gehlot</td>
                    <td>80</td>
                    <td>60</td>
                    <td>72</td>

                </tr>
                <tr>

                    <td>4</td>
                    <td>0101EC171125</td>
                    <td>Utkarsh Verma</td>
                    <td>86</td>
                    <td>58</td>
                    <td>42</td>

                </tr>
                <tr>

                    <td>5</td>
                    <td>0101EC171123</td>
                    <td>Aniket Sirota</td>
                    <td>50</td>
                    <td>62</td>
                    <td>69</td>

                </tr>

            </tbody>
        </table>
        <table>
            <tbody>
                <tr>
                    <td align="right"><input type="submit" name="operation" value="Back"></td>
                </tr>
            </tbody>
        </table>
        <input type="hidden" name="pageNo" value="1"> <input type="hidden" name="pageSize" value="10">
    </form>
</center>
<%@ include file="Footer.jsp" %>
</body>
</html>