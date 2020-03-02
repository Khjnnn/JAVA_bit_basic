<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% pageContext.include("hobby2.jsp"); %>
<form action='end'>
독서 <input type="checkbox" name="hobby" value="독서">
	게임 <input type="checkbox" name="hobby" value="게임">
	음악감상 <input type="checkbox" name="hobby" value="음악감상">
	<input type="submit" name="sub" value="전송">
	</form>
</body>
</html>