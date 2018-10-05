<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<style type="text/css">
		<%@include file="css/style.css"%>
	</style>
</head>
<body>
	<div id="createTeam">
		<h1>Create a new Player</h1>	
		<form action="/TeamRoster/Players" method="POST">
			<input type="text" placeholder="First Name" name="fName">
			<input type="text" placeholder="Last Name" name="lName">
			<input type="text" placeholder="Age" name="age">
			<input class="bttn" type="submit" value="Create">
		</form>
	</div>
</body>
</html>