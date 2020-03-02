<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String pagefile = request.getParameter("page");


	if(pagefile== null){
		pagefile = "main";
	}
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>홈페이지 입니다.</title>
</head>
<frameset rows="100,*" frameborder="NO" border="0">
<frame src="top.html" name="top" scrolling="NO" noresize marginwidth="0" >
<frameset cols="200,*" frameborder="NO" border="0">
<frame src="left.html" name="left" scrolling="NO" noresize marginwidth="0" marginheight="0">
<frame src="home.html" name="main" scrolling="auto" noresize>
</frameset>
</frameset>
<body>


			<%//	<jsp:include page='<%=pagefile+ ".jsp" %>'></jsp:include> %>
		
</body>
</html>