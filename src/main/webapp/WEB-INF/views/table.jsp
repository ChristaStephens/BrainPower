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
	<div>
		<form action="/table-country">
			<select id="country" name="country">
				<option value="">Filter By Country</option>
				<c:forEach items="${ allCountries }" var="c">
					<option <c:if test="${ c eq param.country }">selected</c:if>>${ c }</option>
				</c:forEach>
			</select>

			<button type="submit" class="btn btn-primary mb-2 mr-2">Search</button>
			<c:if test="${not empty param.country}">
				<%-- c:if determines whether its contents should show or not --%>
				<a href="/table" class="btn btn-secondary mb-2">Clear</a>
			</c:if>
		</form>
	</div>

	<table class="tabledata" id="science">
		<tr>


			<th>Name</th>
			<th>Strength</th>
		</tr>
		<c:forEach var="s" items="${scientists }">
			<tr>

				<td><a href="/details?id=${s.id}">${s.name }</a></td>

				<td>${s.strength}</td>




			</tr>
		</c:forEach>

	</table>


</body>
</html>