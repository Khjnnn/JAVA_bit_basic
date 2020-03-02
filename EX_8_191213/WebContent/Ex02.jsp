<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function load_msg(){
		alert("어서오소");
	} 
	function unload(){
		alert("안녕하가세요");
	}
	function focusmsg(x){
		alert(x.name+"포컷스 눌렀다");
	}
	function lose_focus(x){
		alert(x.name+"포커스 벗어남");
	}
	function checksub(){
		alert("체크 되었습");
	}
	function resetsub(){
		alert("리셋이 되어브렀습");
	}
	function view_blood(){
	var bl = myform.blood.options[myform.blood.selectedIndex].value;
	alert(bl);		
	}
	function view_click(){
		myform.value;
		alert(myform.p.value);		
		}
	
	var arr = [1,2,3,4];
	var arr2 = {"key":1,"key1":2}
	
	arr2["key1"];
	
	
</script>
</head>
<body>
	<form name="myform" onsubmit="checksub()" onreset="resetsub()">
		
		<select name="blood" onchange="view_blood()">
			<option value="A" >A형</option>
			<option value="B" >B형</option>
			<option value="O" >O형</option>
			<option value="AB" >AB형 </option>
		</select>
		<input type="submit" value="확인">
		<input type="reset" value="취소">
		<input type="text" name="p">
		<input type="submit" onclick="view_click()" value="전송">
		ID : <input type="text" name="id" onfocus="focusmsg(this)" onblur="lose_focus(this)">
		PW : <input type="text" name="pw" onfocus="focusmsg(this)" onblur="lose_focus(this)">
	</form>
<H1>아아아아</H1>


</body>
</html>