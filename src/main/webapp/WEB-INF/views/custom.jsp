<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>

<link type="text/css" rel="stylesheet" href="table.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script type="text/javascript"
	src="tooltipster/dist/js/tooltipster.bundle.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="tooltipster/dist/css/tooltipster.bundle.min.css" />
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


<script>
	$(document).ready(function() {
		$('.tooltip').tooltipster();
	});
</script>

<meta charset="UTF-8">
<title>Scientist List</title>
</head>
<body>
<!-- NavBar -->
	<div class="navbar">
		<a href="/">BrainPower</a>
		<div class="dropdown">
			<button class="dropbtn">
				Power Rankings <i class="fa fa-caret-down"></i>
			</button>

			<div class="dropdown-content">
				<a href="/table">Scientists</a> <a href="/bracket">Bracket</a>
			</div>

		</div>
		<a href="/alphabet-game">Alphabet Game</a> <a href="/">About</a>
	</div>

	<c:if test="${ empty scientists }">
		<center>
			<h1>
				No one added to custom Tournament!
				<h1>
		</center>

	</c:if>
	<c:if test="${ not empty scientists }">
	
<!-- Custom Bracket Table -->

		<table class="tabledata" id="science">
			<tr>
				<th>Name</th>
				<th>Strength</th>
			</tr>
			<c:forEach var="s" items="${scientists }">
				<tr>
					<td><a target="blank" class="screenshot" href="${s.bioLink }"
						data-tooltip="${s.image }" class="tooltip"> ${s.name }</a></td>
					<td>${s.strength}</td>
					<td><a href="/add-to-cart?id=${  s.name }"
						class="btn btn-light btn-sm">Add To Bracket</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>