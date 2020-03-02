<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
	<script type="text/javascript">
	function question() { 
		var answer = confirm("확인해줘");
		if (answer == true ){
			alert("확인!");
		}else {
			alert("취소~");
		}
	}
	
	</script>
</head>
<body>
<H1> 안녕 안</H1>
<form >
	<input type="button" onclick="question()" value="전송">
</form>
</body>
</html>