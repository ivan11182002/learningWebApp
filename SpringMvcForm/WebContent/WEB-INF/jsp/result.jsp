<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Result</title>
	</head>
	<body>
		 <table border="1" style="border-collapse: separate; border-spacing: 1px;">
		 	<tr>
		 		<th>Item</th>
		 		<th>Value</th>
		 	</tr>
		    <tr>
		        <td>Employee No</td>
		        <td>${empno}</td>
		    </tr>
		    <tr>
		        <td>Employee Name</td>
		        <td>${ename}</td>
		    </tr>
		    <tr>
		        <td>Job</td>
		        <td>${job}</td>
		    </tr>
		    <tr>
		        <td>Salary</td>
		        <td>${sal}</td>
		    </tr>
		</table>  
	</body>
</html>