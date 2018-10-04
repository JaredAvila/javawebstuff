<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Button Clicker</title>
</head>
<body>
<h1>Count: <c:out value="${sessionScope.count }"/></h1>
	<form action="/Button_Clicker/Clicker" method="GET">
		<input type="hidden" value="1" name="count">
		<input type=submit value="submit">
	</form>
</body>
</html>