<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
	
	function A(){
		var a;
		var date = new Date();
		var x = date.getSeconds();
		var b;
		a = x%6+1;
		
		if ( a == 6 ) {
			alert("당첨입니다 !!!!!!!!!!!");
			
		} else {
			alert("꽝ㅋ");
			b = confirm("다시 허쉴?");
			
			if(b==true) {
				A();
			} else {}
		}
	}
	
	</script>
</head>
<body>
<H1> 랜덤 버튼 당첨기계</H1>
<form >
	<input type="button" onclick="A()" value="당첨확인" style="border: 0px;">
</form>
</body>
</html>