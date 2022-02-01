<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<center>
<h1>Employee Registration Form !!</h1>
<html:form action="RegController" method= "post">

	<table>
		<tr>
			<td>ID:</td>
			<td><html:text property="id"  /></td>
			<td><html:errors property="id_e" /></td>
		</tr>

		<tr>
			<td>NAME:</td>
			<td><html:text property="name"  /></td>
			<td><html:errors property="name_e" /></td>
		</tr>

		<tr>
			<td>EMAIL:</td>
			<td><html:text property="email" /></td>
			<td><html:errors property="email_e" /></td>
		</tr>

		<tr>
			<td>SALARY:</td>
			<td><html:text property="salary" /></td>
			<td><html:errors property="salary_e" /></td>
		</tr>

        <tr>
			<td></td>
			<td><html:submit value="Register" /></td>
			<td></td>
		</tr>

	</table>
</html:form>
</center>>