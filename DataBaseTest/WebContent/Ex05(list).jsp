<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var arr1 = [1,2,3]; // 넘버 
	var arr2 = new Array("1",500,"3"); // 스트링 
	var arr = new Array(1,2,3,4,5);
	var sum = 0;
	for(var i=0 ; i < arr.length ; i++){
		sum += arr[i];
	}
	
	console.log("sum은"+sum);
	
	/*
	arr2.pop(); // 마지막 팝 (빼기) 
	arr2.shift(); // 쉬프트 (맨앞 빼기)
	arr2 = arr2.concat(arr1); // 배열합치기(arr1 합쳐삽입)
	arr2 = arr2.join("/"); // 배열>스트링으로 가져오고 구분자 끼워넣기(구분자 /)
	arr1.reverse();
	console.log(arr1);
	arr1.sort();
	console.log(arr1);
	var a = arr1.slice(0,-1); // 앞에있는걸뺌 (양수) 뒤에있는거뺌(-1) 
	console.log(a);
	console.log(typeof arr2);
	console.log(arr2);
	console.log(arr2.length);
	*/
</script>
</head>
<body>
<h1> 배열 이요 배열배열 </h1>
</body>
</html>