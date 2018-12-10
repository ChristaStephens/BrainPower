<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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

	<div class="navbar">
		<a href="/">BrainPower</a>

		<div class="dropdown">
			<button class="dropbtn">
				Power Rankings <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="/table">Scientists</a>
			</div>
		</div>


	</div>
	
	
	<form action="/table-filter" method="post">
	
					<select id="country" name="country">
						<option selected="selected" value="" style="display: none">-Country-</option>
						<c:forEach items="${ allCountries }" var="c">
							<option>${ c }</option>
						</c:forEach>
					</select> 
					
					<select id="field" name="field">
						<option selected="selected" value="" style="display: none">-Field-</option>
						<button type="submit" class="btn btn-primary mb-2 mr-2">
							<c:forEach items="${ fields }" var="f">
								<option>${ f }</option>
							</c:forEach>
						</button>
					</select>
					<button type="submit" class="btn btn-primary mb-2 mr-2">View
						All</button>

					<button type="submit" class="btn btn-primary mb-2 mr-2">Search</button>
					<a href="/table">Clear Filter</a>
				</form>



		
<!-- 		<div> -->
<!-- 			<form action="/table-view-all"> -->
<!-- 				<select id="viewAll" name="viewAll"> -->
<!-- 					<option selected="selected" value="" style="display: none">-View -->
<!-- 						All-</option> -->
<!-- 					<option value="alpha">A-Z</option> -->
<!-- 					<option value="High">Strongest</option> -->
<!-- 					<option value="low">Weakest</option> -->
<!-- 				</select> -->
<!-- 			</form> -->

<!-- 		</div> -->
	</div>



	<c:if test="${ empty scientists }">
		<center><h1>Your search didn't return any results!</h1></center>
		
			</c:if>
	<c:if test="${ not empty scientists }">

	<table class="tabledata" id="science">
	
		<tr>
			<th>Name</th>
			<th>Field</th>
			<th>Country</th>
			<th>Strength</th>
		</tr>
		
		<c:forEach var="s" items="${scientists }">
			<tr>
				<td><a target="blank" class="screenshot" href="${s.bioLink }"
					data-tooltip="${s.image }" class="tooltip"> ${s.name }</a></td>


				<td>${s.field}</td>
				<td>${s.country}</td>
				<td>${s.strength}</td>
			</tr>
		</c:forEach>

	</table>
</c:if>

</body>
</html>