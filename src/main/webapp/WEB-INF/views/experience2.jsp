<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Intermediate Details</h1>
	Name :${ exp2.name}<br/>
	RollNo :${ exp2.empId}<br/>
	School :${ exp2.companyName}<br/>
	Standard And Subjects : ${ exp2.profile}<br/>
	Start Date :${ exp2.startDate}<br/>
	End Date :${ exp2.endDate}<br/>
	<a href = "/profile">Home Page</a>
</body>
</html>