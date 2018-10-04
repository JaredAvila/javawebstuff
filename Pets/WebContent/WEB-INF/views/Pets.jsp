<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pets</title>
	<style type="text/css">
		<%@include file="css/style.css"%>
	</style>

</head>
<body>
	<div class="container">
		<div class="left boxes">
			<h2 class="titleClass">Make a cat!</h2>
			<form action="/Pets/Cats" method="GET">
				<input type="text" placeholder="Name" name="name">
				<input type="text" placeholder="Breed" name="breed">
				<input type="text" placeholder="Weight" name="weight">
				<input type="submit" value="submit">
			</form>
		</div>
		<div class="right boxes">
			<h2 class="titleClass">Make a Dog!</h2>
			<form action="/Pets/Dogs" method="GET">
				<input type="text" placeholder="Name" name="name">
				<input type="text" placeholder="Breed" name="breed">
				<input type="text" placeholder="Weight" name="weight">
				<input type="submit" value="submit">
			</form>
		</div>
		
	</div>
</body>
</html>