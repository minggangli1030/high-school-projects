<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%> <!-- 指令 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloJSP</title>
</head>
<body>

	<%!String string = "Hello World!";%><%-- 声明 => 定义变量或者方法 --%>
	<%string = string + " I am learning JSP!";%><%-- 逻辑代码（脚本）=> 里面可以直接写正常的JAVA代码 --%>
	<%=string%> <%-- 表达式 => 直接输出（注意表达式不以分号结 束）--%>
	<!-- 注释 -->
	<!-- JSP页部元素构成：静态内容+指令+声明+逻辑代码/脚本+表达式+注释 --> 
</body>
</html>