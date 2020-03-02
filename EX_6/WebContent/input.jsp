<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="score">
	<table align="center">
	<tr align="center"><td>이름 : <input type="text" name="name"> <br><br></td></tr>
	<tr align="center"><td>국어 : <input type="text" name="kor"> <br><br></td></tr>
	<tr align="center"><td>영어 : <input type="text" name="eng"><br><br></td></tr>
	<tr align="center"><td>수학 : <input type="text" name="math" > <br><br></td></tr>
	<tr align="center"><td> <input type="submit" value="입력"> 
	</form>
	<form method="post" action="cancel">
	<input type="submit" value="취소">  	
	</td>
	</tr>
	</table>
	</form>
</body>
</html>