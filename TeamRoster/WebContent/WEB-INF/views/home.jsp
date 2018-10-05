<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

	<meta charset="ISO-8859-1">
	<title>Rosters</title>
	<style type="text/css">
		<%@include file="css/style.css"%>
	</style>
	
</head>
<body>

	<div id="header">
		<h1>Team Rosters</h1>
		<a class="bttn" href="/TeamRoster/Teams">New Team</a>
	</div>
	<br>
	<br>
	<br>
	<table class="steelBlueCols">
		<thead>
			<tr>
				<th>Team</th>
				<th>Players</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>	
		<c:forEach items="${teamList}" var="team">
			<tr>
				<td><c:out value="${team.getTeamName()}"/></td>
				<td><c:out value="${team.getNumOfPlayers()}"/></td>
				<td><form method="POST" action="/TeamRoster/DeleteTeam" class="links"><input type="hidden" name="teamId" value='<c:out value="${ team.getTeamName() }"/>'><input class="bttn" type="submit" value="Delete"><a href="/TeamRoster/Teams?teamId=<c:out value="${ team.getTeamName() }"/>" class="bttn">View Team</a></form></td>
			</tr>	
		</c:forEach>		
		</tbody>
	</table>
	
</body>
</html>