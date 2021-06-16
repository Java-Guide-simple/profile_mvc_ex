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
	Name :${ exp4.name}<br/>
	RollNo :${ exp4.empId}<br/>
	School :${ exp4.companyName}<br/>
	Standard And Subjects : ${ exp4.profile}<br/>
	Start Date :${ exp4.startDate}<br/>
	End Date :${ exp4.endDate}<br/>
	<a href = "/profile">Home Page</a>
</body>
</html>