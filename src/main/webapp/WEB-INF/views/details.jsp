<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Details</title>
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
<h1>Details</h1>

	
	<table class="tabledata" id="science">
		<tr>

			<th>Year</th>
			<th>Name</th>
			<th>Field</th>
			<th>Country</th>
			<th>Accolade</th>
			<th>Bio Link</th>
		</tr>

			<tr>
				<td>${scientist.year }</td>
				<td>${scientist.name }</td>
				<td>${scientist.field }</td>
				<td>${scientist.country }</td>
				<td>${scientist.rationale }</td>
				<td><a href = "${scientist.bioLink}" target="_blank">BioLink</a></td>
			


			</tr>
	
	</table>

</body>
</html>