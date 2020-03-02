<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<table border="1">
		<tr>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			
		</tr><%try{
		if(session.getAttribute("num") != null){%>
		<% for(int i=0;i<Integer.parseInt(String.valueOf(session.getAttribute("num")));i++){
		%>
		<TR>
		<TD><%=(session.getAttribute("name"+i))%></TD>
		<TD><%=(session.getAttribute("kor"+i))%></TD>
		<TD><%=(session.getAttribute("eng"+i))%></TD>
		<TD><%=(session.getAttribute("math"+i))%></TD>
		</TR>
		<%}}
		}catch(Exception e){}%>
	
	</table>
</body>
</html>