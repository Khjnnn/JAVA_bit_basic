<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function a(page, method, valarr) {
		var form = document.createElement("form"); //폼세팅
		form.setAttribute("action", page);
		form.setAttribute("method", method);

		for ( var i in valarr) {
			var inputfield = document.createElement("input"); //인풋 세팅
			inputfield.setAttribute("type", "hidden");
			inputfield.setAttribute("name", i);
			inputfield.setAttribute("value", valarr[i]);
			form.appendChild(inputfield); // 추가 
		}
		document.body.appendChild(form); //  
		form.submit(); // 포스트방식으로 전송
	}
</script>
</head>
<body onload="a('NewFile3.jsp','post',{'name':2 ,'kor':70, 'eng':90,'name':3 ,'kor':40, 'eng':30})">
	1페이지


</body>
</html>