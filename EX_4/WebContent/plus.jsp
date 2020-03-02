<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="plus" method="post">
	â:<input type="text" name="box" value="0"> 
	<input type="submit" name="cancel" value="C"> <br>
	<input type="submit" name="op" value="+">
	<input type="submit" name="op" value="-">
	<input type="submit" name="op" value="*">
	<input type="submit" name="op" value="/">
	
	</form>
	
	<%= session.getAttribute("final") %>
	
</body>
</html>