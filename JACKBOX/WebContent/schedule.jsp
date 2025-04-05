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

<title>Schedule | JACKBOX</title>
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

/* Upcoming Schedule */
.schedule {
	width: "80%";
	margin: auto;
	text-align: center;
	padding-top: 80px;
}

.schedule h1 {
	font-size: 100px;
	font-weight: 600;
	font-family: 'Teko', sans-serif !important;
}

.schedule p {
	color: #777;
	font-size: 30px;
	font-weight: 300;
	line-height: 22px;
	padding: 10px;
}

.schedule-row {
	margin-top: 2%;
	display: flex;
	justify-content: space-around;
}

.schedule-col {
	flex-basis: 31%;
	background: #fff3f3;
	border-radius: 10px;
	margin-bottom: 5%;
	padding: 20px 12px;
	box-sizing: border-box;
	background: #fff3f3;
	border-radius: 10px;
	margin-bottom: 5%;
	transition: 0.5s;
}

.schedule-col h3 {
	text-align: center;
	font-weight: 600;
	margin: 10px 0;
	font-family: 'Teko', sans-serif !important;
	font-size: 50px;
}

.schedule-col p {
	color: #777;
	font-size: 20px;
	font-weight: 400;
	line-height: 30px;
	padding: 10px;
	margin: 10px 0;
}

.schedule-jackbox {
	color: #f44336;
	text-align: center;
	font-weight: 600;
	margin: 10px 0;
	font-family: 'Teko', sans-serif !important;
	font-size: 50px;
}

.schedule-col:hover {
	box-shadow: 0 0 20px 0px rgba(0, 0, 0, 0.2);
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
			<p>NEWS</p>
		</div>
	</section>

	<section class="schedule">
		<h1>Upcoming Games</h1>
		<p>LPL 2044 Summer Season Week 7</p>
		<div class=schedule-row>
			<div class="schedule-col">
				<h3>
					<div class=schedule-jackbox>JACKBOX</div>
					vs Funplus Pheonix
				</h3>
				<p>
					Date: Monday, August 8, 2044</br>Time: 7 pm (GMT+8)</br>Location: Jack in the
					Box</br>Starting Roster: Bin Tian Knight SMLZ Ming
				</p>
			</div>
			<div class="schedule-col">
				<h3>
					<div class=schedule-jackbox>JACKBOX</div>
					vs Invitus Gaming
				</h3>
				<p>
					Date: Friday, August 12, 2044</br>Time: 5 pm (GMT+8)</br>Location: Shanghai
					Media Tech Studio</br>Starting Roster: Bin Tian Knight SMLZ Ming
				</p>
			</div>
			<div class="schedule-col">
				<h3>
					<div class=schedule-jackbox>JACKBOX</div>
					vs Royal Never Give Up
				</h3>
				<p>
					Date: Sunday, August 14, 2044</br>Time: 7 pm (GMT+8)</br>Location: Jack in
					the Box</br>Starting Roster: Bin Tian Knight SMLZ Ming
				</p>
			</div>
		</div>

	</section>
</body>
</html>