<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function checkValue(){ //�Է¹��� ������ �ùٸ��� üũ�ϴ� ���
		inputForm = eval("document.loginInfo");
		if(!inputForm.id.value){
			alert("���̵� �Է��ϼ���");
			inputForm.id.focus();
			return false;
		}
		if(!inputForm.password.value){
			alert("��й�ȣ�� �Է��ϼ���.");
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
	             <td bgcolor="skyblue">���̵�</td>
	             <td><input type="text" name="id" maxlength="50"></td>
	         </tr>
	         <tr>
	             <td bgcolor="skyblue">��й�ȣ</td>
	             <td><input type="password" name="password" maxl  ength="50"></td>
	         </tr>
		</table>
		<br>
		<input type="submit" value="�α���"/>
		<input type="submit" value="ȸ������" onclick="goJoinForm()"/>
	</form>
</html>