<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function insert(){
	var name = prompt("이름을 입력하세요","");
	var math = prompt("수학점수를 입력 ","");
	var kor = prompt("국어점수를 입력 ","");
	var eng = prompt("영어점수를 입력 ","");
	var total = parseInt(eng)+parseInt(math)+parseInt(kor);
	var avg = parseInt(total/3);
	
	a({name,math,kor,eng,total,avg});
}
function a(valarr) {
	
	var form = document.createElement("form"); //폼세팅
	form.setAttribute("action", "NewFile3.jsp");
	form.setAttribute("method", "post");
	for ( var i in valarr) {
		var inputfield = document.createElement("input"); //인풋 세팅
		inputfield.setAttribute("type", "hidden");
		inputfield.setAttribute("name", i);
		inputfield.setAttribute("value", valarr[i]);
		form.appendChild(inputfield); // 추가 
	}
	document.body.appendChild(form);   //
	form.submit(); // 포스트방식으로 전송
}
	function Man(){
		var num = prompt("주민번호 : ");
		var a = num.charAt(7);
		var b = num.length;
		if (b!=14 || num.charAt(6)!='-'){
			alert("형식이 잘못되었습니다.");
			return;
		} else { 
			if(a==1 ||a==3 ){
				alert("남자입니다");
				
			}else if(a==2||a==4) {
				alert("여자입니다");
				
			}else {
				alert("잘못씀");
				
			}
		}
	}
	function dan(){
		var cc = prompt("구구단 숫자");
		var pp = [1,2,3,4,5,6,7,8,9];
		var checkc = isNaN(cc);
		if(cc==null || checkc == true){
			alert("잘못입력");
			return;
		}
		for(var v in pp){
			v++;
			document.write(cc+"*"+v+"="+(v*cc)+"<br>");		
			}
		
	}
	


</script>
</head>
<body>

<h1>성적관리프로그램</h1>

<table border="1">
<tr>
	<td> 이름 </td> <td> 수학 </td> <td> 국어 </td> <td> 영어 </td> <td> 총합 </td> <td> 평균 </td>
</tr>
	<td><%=request.getParameter("name") %></td>
	<td><%=request.getParameter("math") %></td>
	<td><%=request.getParameter("kor") %></td>
	<td><%=request.getParameter("eng") %></td>
	<td><%=request.getParameter("total") %></td>
	<td><%=request.getParameter("avg") %></td>
<tr>

</tr>
</table>
<input type="button" onclick="insert()" value="성적입력">
<input type="button" onclick="Man()" value="주민번호입력">
<input type="button" onclick="dan()" value="구구단">




</body>
</html>