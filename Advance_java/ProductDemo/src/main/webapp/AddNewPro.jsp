<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addpro" method="post">
	
		<label for="id">ID:</label>
		<input type="text" id="id" name="id" > <br>
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" > <br>
		<label for="price">Price:</label>
		<input type="number" id="price" name="price"> <br>
		<button type="submit">submit</button>
	</form>
</body>
</html>