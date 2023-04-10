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
	<div>
    <h1>New Ninja</h1>
	<a href="/dojos">Return to Dojos</a>
	</div>
    <form:form action="/ninja" method="post" modelAttribute="ninja">
    	<div class="mb-3 row">
    		Dojo:<form:select path="dojo" class="form-label col">
    		<c:forEach var="dojo" items="${dojos}">	
			<form:option path="dojo" class="col" value="${dojo.id}">${dojo.name}</form:option>
    		</c:forEach>
    		</form:select>
    		<form:label path="firstName" class="form-label col">First Name:</form:label>
    		<form:errors path="firstName" class="text-danger"/>
    		<form:input path="firstName" class="col"/>
    		<form:label path="lastName" class="form-label col">Last Name:</form:label>
    		<form:errors path="lastName" class="text-danger"/>
    		<form:input path="lastName" class="col"/>    		
    		<form:label path="age" class="form-label col">Age:</form:label>
    		<form:errors path="age" class="text-danger"/>
    		<form:input path="age" class="col" type="number"/>
 		 	<button type="submit" class="btn btn-primary" value="submit_form">Submit</button>
    	</div>
    </form:form>
        
</body>
</html>
