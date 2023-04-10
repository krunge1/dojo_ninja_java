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
    <h1>New Dojo</h1>
    <a href=""></a>
    <form:form action="/dojos" method="post" modelAttribute="dojo">
    	<div class="mb-3 row">
    		<form:label path="name" class="form-label col">Name:</form:label>
    		<form:errors path="name" class="text-danger"/>
    		<form:input path="name" class="col"/>
 		 	<button type="submit" class="btn btn-primary" value="submit_form">Submit</button>
    	</div>
    </form:form>
    <c:forEach var="dojo" items="${dojos}">
    <a href="/dojos/${dojo.id}">${dojo.name}</a>
	</c:forEach>
    
    <a href="/ninja">New Ninja</a>
</body>
</html>
