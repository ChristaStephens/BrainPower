<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script>
	$(function() {
		$(document)
				.tooltip(
						{
							items : "[data-tooltip]",
							content : function() {
								var element = $(this);
								var text = element.text();
								var url = element.attr('data-tooltip');
								return "<img class='map' alt='" + text +
        "' src='" + url + "'>";
							}
						});
	});
</script>
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
				<a href="/table">Scientists</a>
			</div>
		</div>
	</div>
	<div id="filters">
	
			<form action="/table-filter" method="post">
				<select id="country" name="country">
					<option selected="selected" value="" style="display:none">-Country-</option>
					<c:forEach items="${ allCountries }" var="c">
						<option>${ c }</option>
					</c:forEach>
				</select>
	

			<select id="field" name="field">
				<option selected="selected" value="" style="display:none">-Field-</option>
				<c:forEach items="${ fields }" var="f">
					<option>${ f }</option>
				</c:forEach>
			</select>
			
			<select id="scope" name="scope">
				<option selected="selected" value="" style="display:none">-Results-</option>
				<option value="high">Strongest</option>
				<option value="low" >Weakest</option>
				<option value="all" >All</option>
			</select>
			
			<button type="submit" class="btn btn-primary mb-2 mr-2">Search</button>
			<a href="/table">Clear Filter</a>
			</form>
	
</div>
	<table class="tabledata" id="science">
		<tr>


			<th>Name</th>
			<th>Strength</th>
		</tr>
		<c:forEach var="s" items="${scientists }">
			<tr>

				<td><a href="/details?id=${s.id}"
					style="background-color: #ffff66;" data-tooltip="${s.image }">${s.name }</a></td>

				<td>${s.strength}</td>




			</tr>
		</c:forEach>

	</table>


</body>
</html>