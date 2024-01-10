<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- action="/" -->
	<table border='2' class="table" >
		<tr class="table-primary">
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
	<div align="center" >
	<a href="AddNewPro.jsp" >add new product</a>
	</div>
</body>
</html>