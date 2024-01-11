<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin: 10%">
	<center>
	<form action="CookiesServlet">
		Name:-<input type="text" name="name" id="name"/>
		value:-<input type="text" name="val" id="value"/><br>
		<!-- <input type="hidden" name="data" value="23"> -->
		<button type="submit" name="btn" value="add" id="add" class="btn btn-success" style="margin: 4px">Add Cookies</button>
		<button type="submit" name="btn" value="show" id="show" class="btn btn-primary">Show Cookies</button><br>
		<input type="text" name="name1" id="name1"/ style="margin: 2px "><button type="submit" name="btn" value="delete" id="delete" class="btn btn-danger" style="margin: 2px ; padding: 3px">delete Cookies</button>
	</form>
	</center>
</body>
</html>