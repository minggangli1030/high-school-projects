<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP_L3_checkOut.jsp</title>
</head>
<body>
	Your cart: <%= session.getAttribute("product") %> <br/>
	<%= application.getAttribute("discount") %> <br/>
	<%= application.getAttribute("news") %>
</body>
</html>