<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP_L3_cart.jsp</title>
</head>
<body>
	<%
	String product = request.getParameter("product");
	session.setAttribute("product", product);
	out.println("You have added " + product + " to your cart!");
	%>


</body>
</html>