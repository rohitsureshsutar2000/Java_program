<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
		<style type="text/css"><%@include file="table.css" %></style>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css "/>

</head>
<body style="background-color:DodgerBlue;">
	
		<div class="container">
		    <div class="row">
		        <div class="col-md-offset-1 col-md-10">
		            <div class="panel">
		                <div class="panel-heading">
		                    <div class="row">
		                        <div class="col col-sm-3 col-xs-12">
		                            <h4 class="title">Data <span>List</span></h4>
		                        </div>
		                        <div class="col-sm-9 col-xs-12 text-right">
		                            
		                        </div>
		                    </div>
		                </div>
		                <div class="panel-body table-responsive">
		                    <table class="table">
		                        <thead>
		                            <tr>
		                               
		                                <th>Route id</th>
		                                <th>status_id</th>
		                                <th>start_point</th>
		                                <th>end_point</th>
		                                <th>travel_date</th>
		                                <th>description</th>
		                                <th>Action</th>
		                            </tr>
		                        </thead>
		                       <c:forEach var="p" items="${lst}">
		                        <tbody class="table">
		                            <tr>
		                                
		                                <td>${p.route_id }</td>
		                                <td>${p.status_id }</td>
		                                <td>${p.start_point }</td>
		                                <td>${p.end_point }</td>
		                                <td>${p.travel_date }</td>
		                                <td>${p.description }</td>
		                                <td>
		                                    <ul class="action-list">
		                                        <li><a href="#" data-tip="edit"><i class="fa fa-edit"></i></a></li>
		                                        <li><a href="#" data-tip="delete"><i class="fa fa-trash"></i></a></li>
		                                    </ul>
		                                </td>
		                            </tr>
		                        </tbody>
		                      </c:forEach>
	
		                    </table>
		                </div>
		                
		            </div>
		        </div>
		    </div>
		</div>
		
</body>
</html>