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

<<<<<<< HEAD
	<h1>
		<p>
			<img class="scientist" src="${scientist.image }">
		</p>
		<H8>Fact:</H8>
	</h1>
	<h1>${chuck.value }</h1>
=======

<<<<<<< HEAD

=======
	<h1>
		<p>
			<img src="${scientist.image }" />
		</p>
	</h1>
	<h1>${fact}</h1>


	
>>>>>>> 31d48a8a85ebd9b84b214f7e4fdb523a92c3eb85

	<div class="container">
		<img src="${scientist.image }" alt="Avatar" class="image"
			style="width: 30%">
		<div class="middle">
			<div class="text">${chuck.value }</div>
		</div>
	</div>




>>>>>>> cf72a0c575d01c407b6a37ea89ff2dc1a10b7c20
	<!-- Scientist strength rating -->
	<div class="container" style="text-align: center; width: 100%;">

<<<<<<< HEAD
		<h1>How Strong?</h1>
=======

>>>>>>> cf72a0c575d01c407b6a37ea89ff2dc1a10b7c20
		<form action="submit">
			 <b>Weakling</b> <label
				class="radio-inline"> <input type="radio" name="strength"
				value="1" checked>
			</label> <label class="radio-inline"> <input type="radio"
				name="strength" value="2"><b>2</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="strength" value="3"><b>3</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="strength" value="4"><b>4</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="strength" value="5"><b>5</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="strength" value="6"><b>6</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="strength" value="7"><b>7</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="strength" value="8"><b>8</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="strength" value="9"><b>9</b>
			</label> <label class="radio-inline"> <input type="radio"
				name="strength" value="10"><b>Chuck Norris</b>
			</label> <input type="hidden" name="scientistID" value="${scientist.id }">
		</form>

		<!-- Is this scientist stringer than chuck function -->
		<h1>Is This Scientist Stronger Than Chuck?</h1>

		<span class="yes" onclick="myFunction()"><i
			class="fas fa-thumbs-up fa-4x"></i></span> <span class="no"
			onclick="myFunction1()"><i class="fa fa-thumbs-down fa-4x"></i></span>

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
	</div>


	<!-- Share buttons will clean up -->

	<div id="share">

		<!-- Buffer -->
		<a
			href="https://bufferapp.com/add?url=https://simplesharebuttons.com&amp;text=Simple Share Buttons"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/buffer.png"
			alt="Buffer" />
		</a>

		<!-- Digg -->
		<a
			href="http://www.digg.com/submit?url=https://simplesharebuttons.com"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/diggit.png"
			alt="Digg" />
		</a>

		<!-- Email -->
		<a
			href="mailto:?Subject=Simple Share Buttons&amp;Body=I%20saw%20this%20and%20thought%20of%20you!%20 https://simplesharebuttons.com">
			<img id="petty"
			src="https://simplesharebuttons.com/images/somacro/email.png"
			alt="Email" />
		</a>

		<!-- Facebook -->
		<a
			href="http://www.facebook.com/sharer.php?u=https://simplesharebuttons.com"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/facebook.png"
			alt="Facebook" />
		</a>

		<!-- Google+ -->
		<a
			href="https://plus.google.com/share?url=https://simplesharebuttons.com"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/google.png"
			alt="Google" />
		</a>

		<!-- LinkedIn -->
		<a
			href="http://www.linkedin.com/shareArticle?mini=true&amp;url=https://simplesharebuttons.com"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/linkedin.png"
			alt="LinkedIn" />
		</a>

		<!-- Pinterest -->
		<a
			href="javascript:void((function()%7Bvar%20e=document.createElement('script');e.setAttribute('type','text/javascript');e.setAttribute('charset','UTF-8');e.setAttribute('src','http://assets.pinterest.com/js/pinmarklet.js?r='+Math.random()*99999999);document.body.appendChild(e)%7D)());">
			<img id="petty"
			src="https://simplesharebuttons.com/images/somacro/pinterest.png"
			alt="Pinterest" />
		</a>

		<!-- Print -->
		<a href="javascript:;" onclick="window.print()"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/print.png"
			alt="Print" />
		</a>

		<!-- Reddit -->
		<a
			href="http://reddit.com/submit?url=https://simplesharebuttons.com&amp;title=Simple Share Buttons"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/reddit.png"
			alt="Reddit" />
		</a>

		<!-- StumbleUpon-->
		<a
			href="http://www.stumbleupon.com/submit?url=https://simplesharebuttons.com&amp;title=Simple Share Buttons"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/stumbleupon.png"
			alt="StumbleUpon" />
		</a>

		<!-- Tumblr-->
		<a
			href="http://www.tumblr.com/share/link?url=https://simplesharebuttons.com&amp;title=Simple Share Buttons"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/tumblr.png"
			alt="Tumblr" />
		</a>

		<!-- Twitter -->
		<a
			href="https://twitter.com/share?url=https://simplesharebuttons.com&amp;text=Simple%20Share%20Buttons&amp;hashtags=simplesharebuttons"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/twitter.png"
			alt="Twitter" />
		</a>

		<!-- VK -->
		<a
			href="http://vkontakte.ru/share.php?url=https://simplesharebuttons.com"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/vk.png" alt="VK" />
		</a>

		<!-- Yummly -->
		<a
			href="http://www.yummly.com/urb/verify?url=https://simplesharebuttons.com&amp;title=Simple Share Buttons"
			target="_blank"> <img id="petty"
			src="https://simplesharebuttons.com/images/somacro/yummly.png"
			alt="Yummly" />
		</a>

	</div>


</body>
</html>