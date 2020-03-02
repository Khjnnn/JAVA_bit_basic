<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%!	
	
	int[] x = {1,2,3,4,5,6,7,8,9};
	int[] y = {1,2,3,4,5,6,7,8,9};
	int a,b ;
	int total;
	int ran = (int)(Math.random()*9);
	int score = 0;
	%>
	<%
	a = x[0] = x[ran];
	ran = (int)(Math.random()*9);
	b = y[0] = y[ran];
	session.setAttribute("a", a);
	session.setAttribute("b", b);
	total = a*b;
	session.setAttribute("total", total);
	
	%>
	
<form action="score" method="post">
	<%= session.getAttribute("a") %>  x 
	<%= session.getAttribute("b") %>
	 =	 <input type="text" name="pang" > <br>
	Score :<%=session.getAttribute("score") %> <br>
	 
	<input type="submit" name="start" value="확인">
	</form>
	<form action="close" method="post">
	<input type="submit" name="close" value="close"> 
	<input type="reset" name="reset" value="초기화">  
	</form>
	
</body>
</html>