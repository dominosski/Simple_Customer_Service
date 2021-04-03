<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of customers</title>

<link type="text/css"
	rel="stylesheet"
	href="src/webapp/WEB-INF/resources/css/style.css"/>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Customer relationship manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				<c:forEach var="tempCustomer" items="${customers}">
				<tr>
					<td> ${tempCustomer.firstName}</td>
					<td> ${tempCustomer.lastName}</td>
					<td> ${tempCustomer.email}</td>
				</tr>
				</c:forEach>
			</table>
		</div>
		
	</div>
</body>
</html>