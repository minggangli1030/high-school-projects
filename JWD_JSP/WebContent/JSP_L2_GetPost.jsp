<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP_L2_getPost.jsp</title>
</head>
<body>
	<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	%>
	Username:<%=username%>
	</br>
	Password: <%= password%>

</body>
</html>