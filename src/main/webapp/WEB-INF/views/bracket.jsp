<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<link href='https://fonts.googleapis.com/css?family=Holtwood+One+SC'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Kaushan+Script|Herr+Von+Muellerhoff'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Abel'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Istok+Web|Roboto+Condensed:700'
	rel='stylesheet' type='text/css'>
<link type="text/css" rel="stylesheet" href="text.css">
<title>Chuck Madness</title>
<title>Bracket</title>
</head>
<body>


	<header class="hero">
		<div class="hero-wrap">
			<p class="intro" id="intro">Chuck Norris</p>
			<h1 id="headline">Tournament</h1>
			<p class="year">
				<i class="fa fa-star"></i> 2018 <i class="fa fa-star"></i>
			</p>
			<p>Grand Circus</p>
		</div>
	</header>


	<section id="bracket">
		<div class="container">
			<div class="split split-one">
				<div class="round round-one current">
					<div class="round-details">
						Round 1<br /> <span class="date">March 16</span>
					</div>
					<ul class="matchup">
						<li class="team team-top"><span class="score">0</span></li>
						<li class="team team-bottom">Virginia<span class="score">82</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">Wake Forest<span class="score">64</span></li>
						<li class="team team-bottom">Clemson<span class="score">56</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">North Carolina<span class="score">68</span></li>
						<li class="team team-bottom">Florida State<span class="score">54</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">NC State<span class="score">74</span></li>
						<li class="team team-bottom">Maryland<span class="score">92</span></li>
					</ul>
				</div>
				<!-- END ROUND ONE -->

				<div class="round round-two">
					<div class="round-details">
						Round 2<br /> <span class="date">March 18</span>
					</div>
					<ul class="matchup">
						<li class="team team-top">Detroit<span class="score">&nbsp;</span></li>
						<li class="team team-bottom">Detroit<span class="score">&nbsp;</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">detroit<span class="score">&nbsp;</span></li>
						<li class="team team-bottom">detroit<span class="score">&nbsp;</span></li>
					</ul>
				</div>
				<!-- END ROUND TWO -->

				<div class="round round-three">
					<div class="round-details">
						Round 3<br /> <span class="date">March 22</span>
					</div>
					<ul class="matchup">
						<li class="team team-top">Detroit<span class="score">&nbsp;</span></li>
						<li class="team team-bottom">Detroit<span class="score">&nbsp;</span></li>
					</ul>

				</div>
				<!-- END ROUND THREE -->
			</div>

			<div class="champion">
				<div class="semis-l"></div>
				<div class="final">
					<i class="fa fa-trophy"></i>
					<div class="round-details">
						championship <br /> <span class="date">March 30 - Apr. 1</span>
					</div>
					<ul class="matchup championship">
						<li class="team team-top">Chuck Norris <span
							class="vote-count">200</span></li>
						<li class="team team-bottom">Maybe<span class="vote-count">&nbsp;</span></li>
					</ul>
				</div>
			</div>
			<div class="split split-two">
				<div class="round round-three">
					<div class="round-details">
						Round 3<br /> <span class="date">March 22</span>
					</div>
					<ul class="matchup">
						<li class="team team-top">detroit<span class="score">&nbsp;</span></li>
						<li class="team team-bottom">detroit<span class="score">&nbsp;</span></li>
					</ul>

				</div>
				<!-- END ROUND THREE -->

				<div class="round round-two">
					<div class="round-details">
						Round 2<br /> <span class="date">March 18</span>
					</div>
					<ul class="matchup">
						<li class="team team-top">detroit<span class="score">&nbsp;</span></li>
						<li class="team team-bottom">detroit<span class="score">&nbsp;</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">detroit<span class="score">&nbsp;</span></li>
						<li class="team team-bottom">detroit<span class="score">&nbsp;</span></li>
					</ul>

				</div>
				<!-- END ROUND TWO -->
				<div class="round round-one current">
					<div class="round-details">
						Round 1<br /> <span class="date">March 16</span>
					</div>
					<ul class="matchup">
						<li class="team team-top">Minnesota<span class="score">62</span></li>
						<li class="team team-bottom">Northwestern<span class="score">54</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">Michigan<span class="score">68</span></li>
						<li class="team team-bottom">Iowa<span class="score">66</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">Illinois<span class="score">64</span></li>
						<li class="team team-bottom">Wisconsin<span class="score">56</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">Purdue<span class="score">36</span></li>
						<li class="team team-bottom">Boise State<span class="score">40</span></li>
					</ul>

				</div>
				<!-- END ROUND ONE -->
			</div>
		</div>
	</section>
	<section class="share">
		<div class="share-wrap">
			<a class="share-icon" href="https://twitter.com/basement47"><i
				class="fa fa-twitter"></i></a> <a class="share-icon" href="#"><i
				class="fa fa-facebook"></i></a> <a class="share-icon" href="#"><i
				class="fa fa-envelope"></i></a>
		</div>
	</section>

</body>
</html>