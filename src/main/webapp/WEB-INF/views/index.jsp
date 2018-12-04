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
	<h1>${chuck.value }</h1>

	<div class="container" style="text-align: center; width: 100%;">

		<h1>How Strong?</h1>
		<form action="submit">
			Weakling<label class="radio-inline"> <input type="radio"
				name="optradio" value="1" checked>
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="2">2
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="3">3
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="4">4
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="5">5
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="6">6
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="7">7
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="8">8
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="9">9
			</label> <label class="radio-inline"> <input type="radio"
				name="optradio" value="10">Chuck Norris.
			</label> 
			<input type="hidden" name="scientistID" value="${scientist.id }">
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
	
	
	<!-- Share buttons will clean up -->
	
	<div id="share-buttons">
    
    <!-- Buffer -->
    <a href="https://bufferapp.com/add?url=https://simplesharebuttons.com&amp;text=Simple Share Buttons" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/buffer.png" alt="Buffer" />
    </a>
    
    <!-- Digg -->
    <a href="http://www.digg.com/submit?url=https://simplesharebuttons.com" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/diggit.png" alt="Digg" />
    </a>
    
    <!-- Email -->
    <a href="mailto:?Subject=Simple Share Buttons&amp;Body=I%20saw%20this%20and%20thought%20of%20you!%20 https://simplesharebuttons.com">
        <img src="https://simplesharebuttons.com/images/somacro/email.png" alt="Email" />
    </a>
 
    <!-- Facebook -->
    <a href="http://www.facebook.com/sharer.php?u=https://simplesharebuttons.com" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/facebook.png" alt="Facebook" />
    </a>
    
    <!-- Google+ -->
    <a href="https://plus.google.com/share?url=https://simplesharebuttons.com" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/google.png" alt="Google" />
    </a>
    
    <!-- LinkedIn -->
    <a href="http://www.linkedin.com/shareArticle?mini=true&amp;url=https://simplesharebuttons.com" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/linkedin.png" alt="LinkedIn" />
    </a>
    
    <!-- Pinterest -->
    <a href="javascript:void((function()%7Bvar%20e=document.createElement('script');e.setAttribute('type','text/javascript');e.setAttribute('charset','UTF-8');e.setAttribute('src','http://assets.pinterest.com/js/pinmarklet.js?r='+Math.random()*99999999);document.body.appendChild(e)%7D)());">
        <img src="https://simplesharebuttons.com/images/somacro/pinterest.png" alt="Pinterest" />
    </a>
    
    <!-- Print -->
    <a href="javascript:;" onclick="window.print()">
        <img src="https://simplesharebuttons.com/images/somacro/print.png" alt="Print" />
    </a>
    
    <!-- Reddit -->
    <a href="http://reddit.com/submit?url=https://simplesharebuttons.com&amp;title=Simple Share Buttons" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/reddit.png" alt="Reddit" />
    </a>
    
    <!-- StumbleUpon-->
    <a href="http://www.stumbleupon.com/submit?url=https://simplesharebuttons.com&amp;title=Simple Share Buttons" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/stumbleupon.png" alt="StumbleUpon" />
    </a>
    
    <!-- Tumblr-->
    <a href="http://www.tumblr.com/share/link?url=https://simplesharebuttons.com&amp;title=Simple Share Buttons" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/tumblr.png" alt="Tumblr" />
    </a>
     
    <!-- Twitter -->
    <a href="https://twitter.com/share?url=https://simplesharebuttons.com&amp;text=Simple%20Share%20Buttons&amp;hashtags=simplesharebuttons" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/twitter.png" alt="Twitter" />
    </a>
    
    <!-- VK -->
    <a href="http://vkontakte.ru/share.php?url=https://simplesharebuttons.com" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/vk.png" alt="VK" />
    </a>
    
    <!-- Yummly -->
    <a href="http://www.yummly.com/urb/verify?url=https://simplesharebuttons.com&amp;title=Simple Share Buttons" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/yummly.png" alt="Yummly" />
    </a>

</div>
	
	
	


</body>
</html>