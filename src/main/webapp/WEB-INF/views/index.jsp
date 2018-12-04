<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>


<head>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="style.css">
<link type="text/css" rel="stylesheet" href="button.css">

<meta charset="UTF-8">
<title>Home</title>
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
		<a href="/">About</a>
	</div>
	<button class="button" style="vertical-align: middle">
		<span><a href="/">Next Scientist</a></span>
	</button>

	<%-- <div class="row">
  <div class="column">
    <div class="card">
      <img src="/images/lucas-vasques-453684-unsplash.jpg" alt="Romel" style="width:50%">
      <div class="container">
        <h2>${chuck.value }</h2>
        
        <p>Nightly rate: $${moscowhotel[0].pricePerNight }</p>
       
      </div>
    </div>
  </div> --%>

	<h1>
		<p>
			<img src="${scientist.image }" />
		</p>
	</h1>
	<h1>${chuck.value }</h1>

	<div class="container" style="text-align: center; width: 100%;">

		<h1>How Strong?</h1>
		<form action="submit">
			<b>Weakling</b><label class="radio-inline"> <input type="radio"
				name="optradio" value="1" checked>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="2"><b>2</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="3"><b>3</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="4"><b>4</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="5"><b>5</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="6"><b>6</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="7"><b>7</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="8"><b>8</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="9"><b>9</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="10"><b>Chuck Norris.</b>
			</label> <input type="hidden" name="scientistID" value="${scientist.id }">
		</form>
	</div>

    <p>Blank on purpose</p>
	<h1>Is This Scientist Stronger Than Chuck?</h1>

	<span class="yes" onclick="myFunction()"><i class="fas fa-thumbs-up fa-4x"></i></span>
	<span class="no" onclick="myFunction1()"><i class="fa fa-thumbs-down fa-4x"></i></span>

	<p id="demo"></p>
	<script>
		function myFunction() {
			document.getElementById("demo").innerHTML = "Are you nuts, the Norse Gods are named after Chuck Norris. No one is stronger than Chuck!";
		}
	</script>

	<p id="demo"></p>
	<script>
		function myFunction1() {
			document.getElementById("demo").innerHTML = "You've chosen wisely, Chuck will spare you......for now.";
		}
	</script>
</body>
</html>