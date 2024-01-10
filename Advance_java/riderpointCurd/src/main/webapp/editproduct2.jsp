<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

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
	<div class="form-row">
	<form action="updatepro" method="post" class="form-group">
	<p>${seletedpd.name}</p>
		<label for="id">ID:</label>
		<input type="text" id="id" name="id" value="${seletedpd.id}" readonly> <br>
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" value="${seletedpd.name}"> <br>
		<label for="price">Price:</label>
		<input type="number" id="price" name="price" value="${seletedpd.price}"> <br>
		<button type="submit" class="btn btn-primary mb-2">submit</button>
	</form>
	</div>
	

</body>
</html>