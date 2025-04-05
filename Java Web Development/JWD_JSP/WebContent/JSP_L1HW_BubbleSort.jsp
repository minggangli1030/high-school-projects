<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP_L1HW_BubbleSort</title>
<style>
Body {
	font-size: 150%;
	color: black;
}
</style>
</head>
<body>
	<%!int[] arr = { 5, -8, 9, 3, 4, 999, 1241234, 1234, 0, -1, 23, -2348, 9243, 9234, -92341, 342, 1234, -17 };
	String ans = "";%>
	<%
	for (int i = arr.length - 1; i >= 1; i--) {
		for (int j = 0; j < i; j++) {
			if (arr[j] > arr[j + 1]) {
		int t = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = t;
			}
		}
	}
	for (int i = 0; i < arr.length; i++) {
		ans += arr[i];
		ans += ", ";
	}
	%>
	<%="Sorted Array: "%>
	<%=ans%>
</body>
</html>