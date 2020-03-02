<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
2페이지 <%= request.getParameter("name") %>
<br><%= request.getParameter("kor") %>
<br><%= request.getParameter("eng") %>
<h1>성적관리프로그램</h1>

<table border="1">
<tr>
	<td> 이름 </td> <td> 수학 </td> <td> 국어 </td> <td> 영어 </td> <td> 총합 </td> <td> 평균 </td>
</tr>
	<td><%=request.getParameter("name") %></td>
	<td><%=request.getParameter("math") %></td>
	<td><%=request.getParameter("kor") %></td>
	<td><%=request.getParameter("eng") %></td>
	<td><%=request.getParameter("total") %></td>
	<td><%=request.getParameter("avg") %></td>
<tr>
</body>
</html>