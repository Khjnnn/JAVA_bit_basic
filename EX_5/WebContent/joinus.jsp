<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<form method="post" action="join">
<body>

	<table align="center">
	<tr align="center"><td>이름 : <input type="text" name="name1"> <br><br></td></tr>
	<tr align="center"><td>ID &nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="id"> <br><br></td></tr>
	<tr align="center"><td>PW &nbsp;&nbsp;: <input type="password" name="passwd"><br><br></td></tr>
	<tr align="center"><td>주소 : <input type="text" name="adress" > <br><br></td></tr>
	<tr align="center"><td>
	생년월일 : &nbsp; <input type="text" name="born">
	 <select name="birth">
		<option value=""> 월 </option>
		<option value="1월"> 1월 </option>
		<option value="2월"> 2월 </option>
		<option value="3월"> 3월 </option>
		<option value="4월"> 4월 </option>
		<option value="5월"> 5월 </option>
		<option value="6월"> 6월 </option>
		<option value="7월"> 7월 </option>
		<option value="8월"> 8월 </option>
		<option value="9월"> 9월 </option>
		<option value="10월"> 10월 </option>
		<option value="11월"> 11월 </option>
		<option value="12월"> 12월 </option>		
	</select>
	 <select name="day">
		<option value=""> 일 </option>
		<option value="1일"> 1일 </option>
		<option value="2일"> 2일 </option>
		<option value="3일"> 3일 </option>
		<option value="4일"> 4일 </option>
		<option value="5일"> 5일 </option>
		<option value="6일"> 6일 </option>
		<option value="7일"> 7일 </option>
		<option value="8일"> 8일 </option>
		<option value="9일"> 9일 </option>
		<option value="10일"> 10일 </option>
		<option value="11일"> 11일 </option>
		<option value="12일"> 12일 </option>
		<option value="13일"> 13일 </option>
		<option value="14일"> 14일 </option>
		<option value="15일"> 15일 </option>
		<option value="16일"> 16일 </option>
		<option value="17일"> 17일 </option>
		<option value="18일"> 18일 </option>
		<option value="19일"> 19일 </option>
		<option value="20일"> 20일 </option>
		<option value="21일"> 21일 </option>
		<option value="22일"> 22일 </option>
		<option value="23일"> 23일 </option>
		<option value="24일"> 24일 </option>
		<option value="25일"> 25일 </option>
		<option value="26일"> 26일 </option>
		<option value="27일"> 27일 </option>
		<option value="28일"> 28일 </option>
		<option value="29일"> 29일 </option>
		<option value="30일"> 30일 </option>
		<option value="31일"> 31일 </option>		
	</select>
	</td></tr>
	
	<tr align="center"><td> 성별: 
	<input type="radio" name="rad" value="남"> 남
	<input type="radio" name="rad" value="여"> 여
	<br></td></tr>
	<tr align="center"><td>E-mail : <input type="text" name="mail"> @ <select name="domain">
		<option value=""> == </option>
		<option value="naver.com"> naver.com </option>
		<option value="google.com"> google.com </option>
	</select></td></tr>
	
	<br>
	<tr align="center"><td>
	직업 &nbsp;<select name="job">
		<option value=""> 직업선택 </option>
		<option value="학생"> 학생 </option>
		<option value="교사"> 교사 </option>
		<option value="직장인"> 직장인 </option>
		<option value="기타"> 기타 </option>		
	</select>
	</td></tr>
	
	</table>
	<table align="center">		
	    <tr align="center"><td><input type="reset" value="초기화">
		<input type="submit" value="회원가입">
		<input type="submit" value="취소">
		</td>
		</tr>
	</form>
	</table>
	
</body>
</html>