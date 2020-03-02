<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>
<script type="text/javascript">

//서블릿에서 받아온 정보를 showUploaded() 함수로 출력한다

var name = '<%=(String)request.getAttribute("name")%>';
var subject ='<%=(String)request.getAttribute("subject")%>';
var reg_date = '<%=(String)request.getAttribute("reg_date")%>';
var imgAdd = '<%=(String)request.getAttribute("imgAdd")%>';
var read_count = '<%=(String)request.getAttribute("read_count")%>';

	function showUploaded(){
		
		document.write("<p align = 'center'>");
		document.write("title : " + subject + "<br>");
		document.write("date : " + reg_date + "<br>");
		document.write("by. " + name + "<br><br>");
		document.write("<img src = '" + imgAdd + "'><br>");
		document.write("view : " + read_count + "<br>");
		document.write("<br><hr width  = '50%'><br>");
		document.write("</p>");	
	}

	
</script>
</head>
<body onload = "showUploaded()"> 

</body>
</html>