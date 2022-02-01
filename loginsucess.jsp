<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align ="center">
<h1><%=request.getAttribute("res")%></h1>
<h2> Welcome </h2>
<table>
<tr><td></td><td><a href="index.jsp">Logout</a> </td></tr>
</table>
</div>
</body>
</html>