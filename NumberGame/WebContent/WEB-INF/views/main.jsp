<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>The Great Number Game</title>
</head>
<body>
	<div class="container">
		<h1>Welcome to the Great Number Game!</h1>
		<h3>I am thinking of dinner... and a number between 1 and 100</h3>
		<h3>Take a guess!</h3>
		<form action="/NumberGame/guess" method="POST">
			<input type="text" name="guess" placeholder="Enter guess">
			<input type="submit" value="Submit that shit!">
		</form>
	</div>
</body>
</html>