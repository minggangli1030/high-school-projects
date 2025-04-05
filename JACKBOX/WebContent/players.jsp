<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport"
	content="with=device-width, initial-scale=1.0">

<!-- font-family: 'Poppins', sans-serif; -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap"
	rel="stylesheet">

<!-- font-family: 'Teko', sans-serif; -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Teko:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">

<!-- font-family: 'ZCOOL QingKe HuangYou', cursive; -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=ZCOOL+QingKe+HuangYou&display=swap"
	rel="stylesheet">

<link rel="shortcut icon" href="images/team-logo.png"
	type="image/x-icon" />

<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

<title>Players | JACKBOX</title>
<style>
* {
	margin: 0;
	padding: 0;
	font-family: 'Poppins', sans-serif;
}

/* header */
.header {
	min-height: 40vh;
	width: 100%;
	background-image: linear-gradient(rgba(4, 9, 30, 0.8),
		rgba(4, 9, 30, 0.8)), url('images/background.png');
	background-position: center;
	background-size: cover;
	position: relative;
}

nav {
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 0.5% 1%;
}

nav img {
	width: 100px;
	padding-right: 40px;
}

.nav-links {
	flex: 1;
	text-align: left;
}

.nav-links ul li {
	list-style: none;
	display: inline-block;
	padding: 12px 20px;
	position: relative;
}

.nav-links ul li a {
	color: #fff;
	text-decoration: none;
	font-size: 35px;
	font-family: 'ZCOOL QingKe HuangYou', cursive !important;
	transition: 0.5s;
}

.nav-links ul li a :hover {
	color: #f44336;
}

.text-box {
	width: 90%;
	color: #fff;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	text-align: center;
}

.text-box h1 {
	color: #f44336;
	font-size: 200px;
	font-family: 'Teko', sans-serif !important;
}

.text-box p {
	margin: 10px 0 40px;
	font-size: 80px;
	color: #fff;
	font-family: 'Teko', sans-serif !important;
}

/* players */
.player1 {
	width: 15%;
	color: #000000;
	position: absolute;
	top: 60%;
	left: 4%;
	transform: translate(-4%, -60%);
	text-align: center;
	font-size: 30px;
}

.player1 p {
	margin: 40px 0 0;
	font-size: 25px;
}

.player2 {
	width: 15%;
	color: #000000;
	position: absolute;
	top: 60%;
	left: 26.5%;
	transform: translate(-26.5%, -60%);
	text-align: center;
	font-size: 30px;
}

.player2 p {
	margin: 40px 0 0;
	font-size: 25px;
}

.player3 {
	width: 15%;
	color: #000000;
	position: absolute;
	top: 60%;
	left: 49%;
	transform: translate(-49%, -60%);
	text-align: center;
	font-size: 30px;
}

.player3 p {
	margin: 40px 0 0;
	font-size: 25px;
}

.player4 {
	width: 15%;
	color: #000000;
	position: absolute;
	top: 60%;
	left: 71.5%;
	transform: translate(-71.5%, -60%);
	text-align: center;
	font-size: 30px;
}

.player4 p {
	margin: 40px 0 0;
	font-size: 25px;
}

.player5 {
	width: 15%;
	color: #000000;
	position: absolute;
	top: 60%;
	left: 96%;
	transform: translate(-96%, -60%);
	text-align: center;
	font-size: 30px;
}

.player5 p {
	margin: 40px 0 0;
	font-size: 25px;
}


.coach1 {
	width: 15%;
	color: #000000;
	position: absolute;
	top: 95%;
	left: 37.75%;
	transform: translate(-37.75%, -95%);
	text-align: center;
	font-size: 30px;
}

.coach1 p {
	margin: 20px 0 0;
	font-size: 25px;
}

.coach2 {
	width: 15%;
	color: #000000;
	position: absolute;
	top: 95%;
	left: 62.25%;
	transform: translate(-62.25%, -95%);
	text-align: center;
	font-size: 30px;
}

.coach2 p {
	margin: 20px 0 0;
	font-size: 25px;
}
</style>
<script>
if (<%=session.getAttribute("isLogin")%>) {
		alert("Welcome <%=session.getAttribute("username")%>");
	} else {
		if (<%=request.getAttribute("message")%> != null) {
			alert("<%=request.getAttribute("message")%>");
	} else {
		alert("Please login or sign up first");
	}
}
</script>
</head>
<body>


	<section class="header">
		<nav>
			<a href="index.jsp"><img src="images/team-logo.png"></a>
			<div class="nav-links">

				<ul>
					<li><a href="index.jsp">HOME</a></li>
					<li><a href="schedule.jsp">SCHEDULE</a></li>
					<li><a href="players.jsp">PLAYERS</a></li>
					<li><a href="store.jsp">STORE</a></li>
					<li><a href="account.jsp">ACCOUNT</a></li>
				</ul>

			</div>
		</nav>
		<div class="text-box">
			<h1>JACKBOX</h1>
			<p>PLAYERS</p>
		</div>
	</section>

	<section class="players">
		<table>
			<tr>
				<td><div class="player1">
						<h1>JBX Bin</h1>
						<img src="images/Bin.png">
						<p>
							Role: TOP LANE</br>Signature Champions: FIORA, CAMILLE, IRELIA</br>Birth: 2002/9/28
						</p>
					</div></td>
				<td><div class="player2">
						<h1>JBX Tian</h1>
						<img src="images/Tian.png">
						<p>
							Role: JUNGLE</br>Signature Champions: LEESIN, QIYANA, VIEGO</br>Birth: 2000/7/24
						</p>
					</div></td>
				<td><div class="player3">
						<h1>JBX Knight</h1>
						<img src="images/Knight.png">
						<p>
							Role: MID LANE</br>Signature Champions: SYNDRA, SYLAS, LEBLANC</br>Birth: 2000/5/22
						</p>
					</div></td>
				<td><div class="player4">
						<h1>JBX SMLZ</h1>
						<img src="images/SMLZ.png">
						<p>
							Role: BOT LANE</br>Signature Champions: CAITLYN, KOG'MAW, APHELIOS</br>Birth: 1997/9/24
						</p>
					</div></td>
				<td><div class="player5">
						<h1>JBX Ming</h1>
						<img src="images/Ming.png">
						<p>
							Role: SUPPORT</br>Signature Champions: ALISTAR, GRAGAS, BRAUM</br>Birth: 1998/12/22
						</p>
					</div></td>
				<td><div class="coach1">
						<h1>JBX Chashao</h1>
						<img src="images/Chashao.png">
						<p>
							Role: COACH</br>Birth: 1990/2/11
						</p>
					</div></td>
				<td><div class="coach2">
						<h1>JBX Steak</h1>
						<img src="images/Steak.png">
						<p>
							Role: COACH</br>Birth: 1992/8/15
						</p>
					</div></td>

			</tr>

		</table>
	</section>
</body>
</html>