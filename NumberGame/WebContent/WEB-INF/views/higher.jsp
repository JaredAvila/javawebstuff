<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<h1 style="color:red;">Too Low</h1>
	<form action="/NumberGame/guess" method="post">
		<input type="text" placeholder="Guess" name="guess">
		<input type="submit" value="Sumbit">
	</form>
</body>
</html>