<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP_L3_store.jsp</title>
</head>
<body>
	<h2>Welcome to Martin's store!</h2>
	<%
	String discount = "Milk is 20% off!";
	application.setAttribute("discount", discount);
	String news = "Apple is sold out!";
	application.setAttribute("news", news);
	%>
	<%=application.getAttribute("discount") %> <br/>
	<%=application.getAttribute("news") %>

</body>
</html>