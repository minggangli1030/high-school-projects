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

<title>Store | JACKBOX</title>
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
			<p>STORE</p>
		</div>
	</section>
</body>
</html>