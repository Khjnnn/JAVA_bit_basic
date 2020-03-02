<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function checkValue(){ //입력받은 정보가 올바른지 체크하는 펑션
		inputForm = eval("document.loginInfo");
		if(!inputForm.id.value){
			alert("아이디를 입력하세요");
			inputForm.id.focus();
			return false;
		}
		if(!inputForm.password.value){
			alert("비밀번호를 입력하세요.");
			inutForm.password.focus();
			return false;
		} 
		function goJoinForm(){
			location.href="joinPage.jsp";
		}
	}
</script>
</head>
<body>
	<form name="loginInfo" method="post" action="loginPro.jsp" onsubmit="return checkValue()">
		 <table>
	         <tr>
	             <td bgcolor="skyblue">아이디</td>
	             <td><input type="text" name="id" maxlength="50"></td>
	         </tr>
	         <tr>
	             <td bgcolor="skyblue">비밀번호</td>
	             <td><input type="password" name="password" maxl  ength="50"></td>
	         </tr>
		</table>
		<br>
		<input type="submit" value="로그인"/>
		<input type="submit" value="회원가입" onclick="goJoinForm()"/>
	</form>
</html>