<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var a_int = 4; 
	var b_float = 1.4; 
	var c_String = "50";
	var d_boolean = false;  // NaN : 낫어넘버	
		
	var sum = a_int + parseInt(b_float);
	console.log("섬은 : "+sum);
	var a ;
	var t = Math.floor(Math.random()*45); // 플로어 함수 : 뒤 소수점 빼기 
	var lotto = new Array;
	var num = new Array;
	
	document.write("<br>"+parseInt("ㅎㅇㅎㅇ")+"<br>");
	document.write("<br>"+"NaN+1 : " + (NaN +1) + "<br>");
	document.write("<br>"+"isNaN문자 : " + isNaN(parseInt("ㅎㅇㅎㅇ")) + "<br>");
	document.write("<br>"+"isNaN숫자 : " + isNaN(parseInt(123)) + "<br>");
	document.write("<br>");
	// 아래 함수 차이 
	 // Nuumber.isNaN();
	 // inNaN(); 
	//
	var score = new Array;
	var total = 0;
	var avg = 0 ;
	var count = 0;
	var name;
	score = ["김갱기",50,40,50,40,50];  // 총합 평균 
	for(i=0;i<score.length;i++){
		if(!isNaN(score[i])){
			count++;
			total += score[i];
			avg = total/count;
		}else {name = score[i]}
			
	}
	
	document.write("<br>");
	document.write("이름: "+name);
	document.write("<br>");
	document.write("total 은 "+total);
	document.write("<br>");
	document.write("avg 는 "+avg);
	document.write("<br>");	document.write("<br>");

	
	
	//
	
	//로또
	for(var i = 1 ; i < 46 ; i++ ){
		num.push(i);
	}	
	for(i=0 ; i<93 ; i++){
		t = parseInt(Math.floor(Math.random()*45));
		a = num[0];
		num[0] = num[t];
		num[t] = a;
	}
	document.write(num.slice(0,7)); // 0부터 7개 출력	
	document.write("<br>신한 100 033 706536 <br>"+t);
	
</script>
</head>
<body>
<h1> 예시 입니다 </h1>
</body>
</html>