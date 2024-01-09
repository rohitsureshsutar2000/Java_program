<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- action="/" -->
	<table border='2'>
		<tr>
			<td>Product id</td>
			<td>Product Name</td>
			<td>Product Price</td>
			<td>Link</td>
		</tr>
		<c:forEach var="pd" items="${lst}">
			<tr>
				<td>${pd.id}</td>
				<td>${pd.name}</td>
				<td>${pd.price}</td>
				<td><a href="editpd?pid=${pd.id}">edit</a>/<a href="deletepd?pid=${pd.id}">delete</a> </td>
			</tr>
		
		</c:forEach>
		
		
	</table>
	<a href="AddNewPro.jsp">add new product</a>
</body>
</html>