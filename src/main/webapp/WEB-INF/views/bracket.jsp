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
		<a href="/">About</a>

	</div>


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
			
			
			    <!-- ROUND ONE -->
				<div class="round round-one current">
					<div class="round-details">
						Round 1<br /> <span class="date">March 16</span>
					</div>
					<ul class="matchup">
					
						<li class="team team-top">${round1.get(0).getScientist().getName()}<span
							class="score">${round1.get(0).getScientist().getStrength()}</span></li>
						<li class="team team-top">${round1.get(15).getScientist().getName()}<span
							class="score">${round1.get(15).getScientist().getStrength()}</span></li>

					</ul>
					<ul class="matchup">
						<li class="team team-top">${round1.get(8).getScientist().getName()}<span
							class="score">${round1.get(8).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round1.get(7).getScientist().getName()}<span
							class="score">${round1.get(7).getScientist().getStrength()}</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">${round1.get(4).getScientist().getName()}<span
							class="score">${round1.get(4).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round1.get(11).getScientist().getName()}<span
							class="score">${round1.get(11).getScientist().getStrength()}</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">${round1.get(12).getScientist().getName()}<span
							class="score">${round1.get(12).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round1.get(3).getScientist().getName()}<span
							class="score">${round1.get(3).getScientist().getStrength()}</span></li>
					</ul>
				</div>
				<!-- END ROUND ONE -->

                <!-- QUARTER FINALS -->
				<div class="round round-two">
					<div class="round-details">
						Quarter Finals<br /> <span class="date">March 18</span>
					</div>
					<ul class="matchup">
						<li class="team team-top">${round2.get(0).getScientist().getName()}<span
							class="score">${round2.get(0).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round2.get(7).getScientist().getName()}<span
							class="score">${round2.get(7).getScientist().getStrength()}</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">${round2.get(4).getScientist().getName()}<br><span
							class="score">${round2.get(4).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round2.get(3).getScientist().getName()}<span
							class="score">${round2.get(3).getScientist().getStrength()}</span></li>
					</ul>
				</div>
				<!-- END QUARTER FINALS -->
				
				<!-- SEMI FINALS -->

				<div class="round round-three">
					<div class="round-details">
						Semi-Finals<br /> <span class="date">March 22</span>
					</div>
					<ul class="matchup">
						<li class="team team-top">${round3.get(0).getScientist().getName()}
						<span class="score">${round3.get(0).getScientist().getStrength()}</span>
						</li>
						<li class="team team-bottom">${round3.get(3).getScientist().getName()}
						<span class="score">${round3.get(3).getScientist().getStrength()}</span>
						</li>
					</ul>

				</div>
			</div>
			<!-- END SEMI FINALS -->
			
			<!-- CHAMPION -->

			<div class="champion">
			<i class="fa fa-trophy"></i>
				<div class="semis-l">
					<div class="round-details">
						Champion<br/> <span class="date"></span>
					</div>
					<ul class="matchup championship">
						<li class="team team-top">${winner.get(0).getScientist().getName()}<span
							class="vote-count"></span></li>

					</ul>
				</div>
				<!-- END CHAMPION -->
				
				<!-- FINAL -->
				<div class="final">
					
					<div class="round-details">
						Final <br /> <span class="date">March 26-28</span>
					</div>
					<ul class="matchup championship">
						<li class="team team-top">${champ.get(0).getScientist().getName()}
							<span class="score">${champ.get(0).getScientist().getStrength()}</span>
						</li>
						<li class="team team-bottom">${champ.get(1).getScientist().getName()}<span
							class="score">${champ.get(1).getScientist().getStrength()}</span></li>
					</ul>
				</div>
			</div>
			<!-- END FINAL -->
			
			<!-- SEMI FINALS -->
			<div class="split split-two">
				<div class="round round-three">
					<div class="round-details">
						Semi-Finals<br /> <span class="date">March 22</span>
					</div>
					<ul class="matchup">
						<li class="team team-top">${round3.get(2).getScientist().getName()}<span
							class="score">${round3.get(2).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round3.get(1).getScientist().getName()}<span
							class="score">${round3.get(1).getScientist().getStrength()}</span></li>
					</ul>

				</div>
				<!-- END SEMI FINALS -->
				
				<!-- QUARTER FINALS -->
				<div class="round round-two">
					<div class="round-details">
						Quarter Finals<br /> <span class="date">March 18</span>
					</div>
					<ul class="matchup">
						<li class="team team-top">${round2.get(2).getScientist().getName()}<span
							class="score">${round2.get(2).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round2.get(5).getScientist().getName()}<span
							class="score">${round2.get(5).getScientist().getStrength()}</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">${round2.get(6).getScientist().getName()}<span
							class="score">${round2.get(6).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round2.get(1).getScientist().getName()}<span
							class="score">${round2.get(1).getScientist().getStrength()}</span></li>
					</ul>

				</div>
				<!-- END QUARTER FINALS -->
				
				<!-- ROUND ONE -->
				<div class="round round-one current">
					<div class="round-details">
						Round 1<br /> <span class="date">March 16</span>
					</div>
					<ul class="matchup">
						<li class="team team-top">${round1.get(2).getScientist().getName()}<span
							class="score">${round1.get(2).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round1.get(13).getScientist().getName()}<span
							class="score">${round1.get(13).getScientist().getStrength()}</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">${round1.get(5).getScientist().getName()}<span
							class="score">${round1.get(5).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round1.get(10).getScientist().getName()}<span
							class="score">${round1.get(10).getScientist().getStrength()}</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">${round1.get(6).getScientist().getName()}<span
							class="score">${round1.get(6).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round1.get(9).getScientist().getName()}<span
							class="score">${round1.get(9).getScientist().getStrength()}</span></li>
					</ul>
					<ul class="matchup">
						<li class="team team-top">${round1.get(1).getScientist().getName()}<span
							class="score">${round1.get(1).getScientist().getStrength()}</span></li>
						<li class="team team-bottom">${round1.get(14).getScientist().getName()}<span
							class="score">${round1.get(14).getScientist().getStrength()}</span></li>
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