<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Matriculation Details</h1>
	Name :${ exp1.name}<br/>
	RollNo :${ exp1.empId}<br/>
	School :${ exp1.companyName}<br/>
	Standard And Subjects : ${ exp1.profile}<br/>
	Start Date :${ exp1.startDate}<br/>
	End Date :${ exp1.endDate}<br/>
	<a href = "/profile">Home Page</a>
</body>
</html>