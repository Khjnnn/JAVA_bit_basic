<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   <%@ page import="java.text.SimpleDateFormat" %>
   <%@ page import= "java.util.*" %>
   	
   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	�ð��� : <%= new SimpleDateFormat().format(new Date()) %>
	<br> 	���� : <%= (int)(Math.random()*11) %>
	<form action="nine"  method="post">
	
	<input type="number" name="num">
	<input type="submit" name="check" value="Ȯ��">
	</form><br>
	<%= request.getAttribute("dan") %>
	
	
	
	
	
</body>
</html>