<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
	function A(){
		var date = new Date();
		var x = date.getSeconds();
		var y= (x % 5) + 1 ;
		alert("난수: "+ y);
	}
	var a ;
	console.log(typeof a);
	a = 1 ;
	console.log(typeof a);
	a = '1';
	console.log(typeof a);
	a = "1";
	console.log(typeof a);
	
	a = ['동','홍길','대길동',7,670,80];
	console.log(typeof a);
	
	
	
</script>
</head>
<body>
	<H1> 안녕하세요 홈페이지입니다 </H1>
	<a href="#" onclick="A()" > 눌러 </a>
</body>
</html>