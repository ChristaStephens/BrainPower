<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
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

	<table id="science">
		<tr>

			<th>Year</th>
			<th>Name</th>
			<th>Field</th>
			<th>Country</th>
			<th>Rationale</th>
			<th>Profession</th>
		</tr>
		<c:forEach var="science" items="scientist">
			<tr>
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