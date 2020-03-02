<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
	아이디:<input type="text" name="id" value= <%= request.getAttribute("id") %> > <br>
	
	비번:<input type="text" name="pw"> <br>
	
	<input type="checkbox" name="saveid" value="id">
	
	<input type="submit" value="로그인">
	
	
	</form>
</body>
</html>