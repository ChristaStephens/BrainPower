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
	<div id="filters">
		<div>
			<form action="/table-country">
				<select id="country" name="country">
					<option value="">Filter By Country</option>
					<c:forEach items="${ allCountries }" var="c">
						<option>${ c }</option>
					</c:forEach>
				</select>

				<button type="submit" class="btn btn-primary mb-2 mr-2">Search</button>
			</form>
		</div>
		<div>
			<form action="/table-field">
				<select id="field" name="field">
					<option value="">Filter By Field</option>
					<c:forEach items="${ fields }" var="f">
						<option>${ f }</option>
					</c:forEach>
				</select>

				<button type="submit" class="btn btn-primary mb-2 mr-2">Search</button>

			</form>
		</div>
		<div>
			<form action="/table-show-all-high">
				<button>Show all high-low</button>
			</form>
		</div>
		<div>
			<form action="/table-show-all-low">
				<button>Show all low-high</button>
			</form>
		</div>
		<div>
			<a href="/table">Clear Filter</a>
		</div>
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