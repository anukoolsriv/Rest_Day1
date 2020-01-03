<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<title>Insert title here</title>
</head>
<body>

<table border='1'>
			<tr>
				<th>Customer Id</th>
				<th>Consumer Name</th>
				<th>Amount</th>				
			</tr>
			<!-- For loop -->
			<c:forEach  var="i" items="${myList}">
				<tr>
				<td>${i.customerId} </td>
				<td>${i.customerName } </td>
				<td>${i.amount} </td>
					</tr>
			</c:forEach>
			<!-- End for loop -->
		</table>
</body>
</html>