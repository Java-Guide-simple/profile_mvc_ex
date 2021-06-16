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
	Name :${ exp3.name}<br/>
	RollNo :${ exp3.empId}<br/>
	School :${ exp3.companyName}<br/>
	Standard And Subjects : ${ exp3.profile}<br/>
	Start Date :${ exp3.startDate}<br/>
	End Date :${ exp3.endDate}<br/>
	<a href = "/profile">Home Page</a>
</body>
</html>