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

<title>Account | JACKBOX</title>
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

/* account */
.login-form {
	width: 15%;
	color: #000000;
	position: absolute;
	left: 35%;
	top: 70%;
	transform: translate(-35%, -70%);
	text-align: center;
}

.login-form h1 {
	font-size: 100px;
	font-family: 'Teko', sans-serif !important;
}

.login-form form {
	margin: 10px 0 40px;
	font-size: 30px;
	color: #000000;
}

.signup-form {
	width: 15%;
	color: #000000;
	position: absolute;
	left: 65%;
	top: 70%;
	transform: translate(-65%, -70%);
	text-align: center;
}

.signup-form h1 {
	font-size: 100px;
	font-family: 'Teko', sans-serif !important;
}

.signup-form form {
	margin: 40px 0 40px;
	font-size: 30px;
	color: #000000;
}

.toggle-button {
	display: inline-block;
	text-decoration: none;
	color: #000000;
	border: 1px solid #000000;
	padding: 8px 20px;
	font-size: 20px;
	background: transparent;
	position: relative;
	align: center;
	cursor: pointer;
}

.toggle-button:hover {
	border: 1px solid #f44336;
	background: #f44336;
	transition: 0.5s;
}

.input-box {
	font-size: 20px;
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
			<p>ACCOUNT</p>
		</div>
	</section>

	<section class="account">
		<table>
			<tr>
				<td><div class="login-form">
						<h1>LOGIN</h1>
						<form action="/JACKBOX/login" method="post">

							<input name="username" type="text" class="input-box" required
								placeholder="Username"></input><br /> <input name="password"
								type="password" class="input-box" required
								placeholder="Password"></input><br /> <br /> <input
								type="submit" value="Login ➜" class="toggle-button" />

						</form>

					</div></td>
				<td><div class="signup-form">
						<h1>SIGNUP</h1>
						<form action="/JACKBOX/signup" method="post"
							enctype="multipart/form-data">

							<input name="username" type="text" class="input-box" required
								placeholder="Username"></input><br /> <input name="password"
								type="password" class="input-box" required
								placeholder="Password"></input><br /> <input name="email"
								type="text" class="input-box" required placeholder="Email"></input><br />
							<br /> <input type="file" name="logoFile"></input><br> <input
								type="submit" value="REGISTER ➜" class="toggle-button" />


						</form>
					</div></td>
			</tr>
		</table>
	</section>
</body>
</html>