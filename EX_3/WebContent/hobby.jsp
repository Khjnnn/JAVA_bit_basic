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
���� <input type="checkbox" name="hobby" value="����">
	���� <input type="checkbox" name="hobby" value="����">
	���ǰ��� <input type="checkbox" name="hobby" value="���ǰ���">
	<input type="submit" name="sub" value="����">
	</form>
</body>
</html>