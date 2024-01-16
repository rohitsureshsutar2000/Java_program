<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css"><%@include file="table.css" %></style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
		
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->

<link href="${contextPath}/resource/bootstrap.min.css" rel="stylesheet">
</head>
<body>
 <div class="container">
  <h1>Employee Register Form:</h1>
  <div class="card">
   <div class="card-body">
   
   
    <form action="updateform" method="Get">
     <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label" >Route_id</label>
      <div class="col-sm-7">
       <input type="text" class="form-control"  name="rid"  value="${p.route_id}" readonly />
      </div>
     </div>

     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label" >Status_id</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="status_id"
        value="${p.status_id}">
      </div>
     </div>

     <div class=" form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Start Point</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="startpoint"
        value="${p.start_point}">
      </div>
     </div>

     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">End Point</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="endpoint"
        value="${p.end_point}">
      </div>
     </div>

     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Date</label>
      <div class="col-sm-7">
       <input type="date" class="form-control" name="dt"
        >
      </div>
     </div>

     <div class="form-group row">
      <label for="contact" class="col-sm-2 col-form-label">Description
       No</label>
      <div class="col-sm-7">
       <input type="description" class="form-control" name="des"
        value="${p.description}">
      </div>
     </div>

     <button type="submit" class="btn btn-primary">Submit</button>
       <!--<button class="btn aqua-gradient">Aqua</button>  -->
    </form>
   </div>
  </div>

 </div>
 
 
 </body>
 
 </html>
 