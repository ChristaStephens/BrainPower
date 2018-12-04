<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>


<head>
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

		<br>

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
	<h1>${chuck.value }</h1>

	<div class="container" style="text-align: center; width: 100%;">

		<h1>How Strong?</h1>
		<form>
			Weakling<label class="radio-inline"> <input type="radio"
				name="optradio" checked>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio">2
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio">3
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio">4
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio">5
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio">6
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio">7
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio">8
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio">9
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio">Chuck Norris.
			</label>
		</form>
	</div>

	
	<p> blank text, left empty on purpose</p>
	
	<button onclick="myFunction()">Is this Scientist Stronger Than Chuck?</button>
	
	<p id="demo"></p>
	<script>
function myFunction() {
  document.getElementById("demo").innerHTML = "Are you nuts, the Norse Gods are named after Chuck Norris. No one is stronger than Chuck!";
}
</script>
	
	
	
	
	
	
	


</body>
</html>