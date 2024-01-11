<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<form action="Login" method="post">
  <!-- Email input -->
	  <div class="form-outline mb-4">
	    <input type="text" id="form2Example1" class="form-control" name="userN"/>
	    <label class="form-label" for="form2Example1" >Email address</label>
	  </div>

	  <!-- Password input -->
	  <div class="form-outline mb-4">
	    <input type="password" id="form2Example2" class="form-control"  name="passN"/>
	    <label class="form-label" for="form2Example2">Password</label>
	  </div>

  <!-- 2 column grid layout for inline styling -->
  <div class="row mb-4">
    

    <div class="col">
    

  <!-- Submit button -->
  <button type="submit" class="btn btn-primary btn-block mb-4">Sign in</button>

  
</form>

</body>
</html>