<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Employee Home</title>
	</head>
	<body>
		<form:form commandName="empObj" method="POST" action="/SpringMvcForm/addEmp">
			<table>
			    <tr>
			        <td><form:label path="empno">Employee No</form:label></td>
			        <td><form:input path="empno" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="ename">Employee Name</form:label></td>
			        <td><form:input path="ename" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="job">Job</form:label></td>
			        <td><form:input path="job" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="sal">Salary</form:label></td>
			        <td><form:select path="sal" items="${salOptions}" /></td>
			    </tr>
			    <tr>
			        <td colspan="2">
			            <input type="submit" value="Submit"/>
			        </td>
			    </tr>
			</table>  
		
		
		</form:form>
		
	</body>
</html>