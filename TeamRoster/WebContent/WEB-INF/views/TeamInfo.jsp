<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Team Rosters</title>
	<style type="text/css">
		<%@include file="css/style.css"%>
	</style>
</head>
<body>
	<div id="header">
		<h1><c:out value="${ teamName }"/></h1>
		<a class="bttn" href="/TeamRoster/Players">New Player</a>
	</div>
	<br>
	<br>
	<br>
	<table class="steelBlueCols">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Jared</td>
				<td>Avila</td>
				<td>36</td>
				<td><form method="post" action="/TeamRoster/DeletePlayer"><input type="hidden" name="playerId" value="PLAYER ID NUMBER"><input class="bttn" style="border: none; background-color: darkred;" type="Submit" value="Delete"></form></td>
			</tr>
			<tbody>	
		<c:forEach items="${teamList}" var="team">
			<tr>
				<td><c:out value="${team.getTeamName()}"/></td>
				<td><c:out value="${team.getNumOfPlayers()}"/></td>
				<td><form method="POST" action="/TeamRoster/DeleteTeam" class="links"><input type="hidden" name="teamId" value='<c:out value="${ team.getTeamName() }"/>'><input class="bttn" type="submit" value="Delete"><a href="/TeamRoster/Teams?teamId=<c:out value="${ team.getTeamName() }"/>" class="bttn">View Team</a></form></td>
			</tr>	
		</c:forEach>		
		</tbody>
		</tbody>
	</table>
	
</body>
</html>