<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--c:out ; c:forEach etc.-->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!-- formatting (dates -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title> </title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/style.css">
	<script type="text/javascript" src="/script.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    </head>
<body>
	<div class="header header_line_group">
    <h1>${dojo.name} Location Ninjas</h1>
	<a href="/dojos">Return to Dojos</a>
	</div>
	<table class="table table-dark table-striped-columns box_sizing">
	  <thead class="thead-dark">
	    <tr>
	    	<th>First Name</th>
	      	<th>Last Name</th>
 		    <th>Age</th>   
	   </tr>
	  </thead>
	  <tbody>
    		<c:forEach var="ninjas" items="${dojo.ninjas}">
    		<tr>
			<td>${ninjas.firstName}</td>
			<td>${ninjas.lastName}</td>
			<td>${ninjas.age}</td>
    		</c:forEach>		
    		</tr>	
	  </tbody>
	</table> 	
</body>
</html>