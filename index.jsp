
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<center>
		<h1>Login Here!!</h1>
		<html:form action="LoginController" method="post">
			<table>
				
					<tr>
					<td>ID :</td>
					<td> <html:text property="id" /></td>
					</tr>
					
					   <tr>
					   <td> NAME :</td>
					   <td> <html:text property="name" /></td>
					   </tr>
					   
					   <tr>
					   <td></td>
					   <td> <html:submit value="login" /></td>
					   </tr>
						<tr>
						<td>Not a member?</td>
						<td><a href="registration.jsp">Sign up now</a><td>
						</tr>
						 </html:form>
						</center>
</body>
</html>