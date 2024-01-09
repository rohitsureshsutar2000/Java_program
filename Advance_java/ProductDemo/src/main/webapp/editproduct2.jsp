<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		label {
			display: block;
			margin-bottom: 5px;
		}
		input[type="text"], input[type="number"] {
			padding: 10px;
			width: 10%;
			border: none;
			border-radius: 5px;
		}
	</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="updatepro" method="post">
	<p>${seletedpd.name}</p>
		<label for="id">ID:</label>
		<input type="text" id="id" name="id" value="${seletedpd.id}" readonly> <br>
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" value="${seletedpd.name}"> <br>
		<label for="price">Price:</label>
		<input type="number" id="price" name="price" value="${seletedpd.price}"> <br>
		<button type="submit">submit</button>
	</form>
	

</body>
</html>