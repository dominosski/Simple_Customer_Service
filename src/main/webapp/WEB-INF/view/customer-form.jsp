<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Customer</title>
	

</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Save customer</h3>
		
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
		
		<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td>First name:</td>
						<td><form:input path="firstName"/></td>
					</tr>
					<tr>
						<td>Last name:</td>
						<td><form:input path="lastName"/></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><form:input path="email"/></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save"/></td>
					</tr>
					
				</tbody>
			</table> 
		</form:form>
		
		<div style="clear; both;"></div>
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to list of customers</a>
		</p>
	</div>

</body>
</html>