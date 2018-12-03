<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>
<h1>Details</h1>
		<a href="/">Home</a>

	

	<table id="science">
		<tr>
			<th>Image</th>
			<th>Year</th>
			<th>Name</th>
			<th>Field</th>
			<th>Country</th>
			<th>Rationale</th>
			<th>Profession</th>
			<th>Wiki Link</th>
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