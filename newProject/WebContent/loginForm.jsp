<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>�α��� ȭ��</h1>
<%
	String id = (String)session.getAttribute("id");
%>
<h1>�ȳ��ϼ���! <%=id %>��!</h1>
<form action="001_UploadPage.jsp">
<button class= "UPLOAD" > UPLOAD </button> 
</form>

<form action="searchthis">
<button class= "TIMELINE" > TIME LINE </button> 
</form>

<input type="button" value="�α׾ƿ�" onclick="location.href='main.jsp?logout=yes'"/>
</body>
</html>