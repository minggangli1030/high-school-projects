<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP_L2HW_BubbleSortWeb.jsp</title>
</head>
<body>
	<%!int[] arr = new int[10];
	String ans = "";%>

	<%="Please enter 10 numbers to sort"%>
	</br>
	<%
	String num = request.getParameter("num");
	int start = 0;
	int index = 0;
	for (int i = 0; i < num.length(); i++) {
		if (num.charAt(i) == ' ') {
			arr[index++] = Integer.parseInt(num.substring(start, i));
			start = i + 1;
		}
	}
	arr[9] = Integer.parseInt(num.substring(start, num.length()));
	for (int i = arr.length - 1; i >= 1; i--) {
		for (int j = 0; j < i; j++) {
			if (arr[j] > arr[j + 1]) {
		int t = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = t;
			}
		}
	}
	for (int numbers : arr) {
		ans += numbers;
		ans += " ";
	}
	%>
	Sorted Array: <%=ans%>



</body>
</html>