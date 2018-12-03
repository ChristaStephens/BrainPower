<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Scientist List</title>
</head>
<body>

<div class="navbar">
		<a href="/">Home</a>

		<div class="dropdown">
			<button class="dropbtn">
				See List <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="/table">Scientist</a>
			</div>
		</div>
	</div>

	<table class="tabledata" id="science">
		<tr>

			<th>Year</th>
			<th><a href="/details?id=${id }">Name</a></th>
			<th>Field</th>
			<th>Country</th>
			<th>Rationale</th>
			<th>Profession</th>
			<th>Strength</th>
		</tr>
		<c:forEach var="science" items="scientist">
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>


			</tr>
		</c:forEach>
	</table>
	
	

</body>
</html>