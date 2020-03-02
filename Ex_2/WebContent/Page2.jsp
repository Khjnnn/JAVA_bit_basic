<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
 <!-- 한가지 값만 가져올수있음
   리다이렉트 : 새창 띄움 (리퀘스트 새로 생성됨.)
   포워딩 : 덮음 (리퀘,리스폰즈 다 보냄) //둘 다 세션 공유 가능 -->
  안녕하세여 page 2 입니다. <br>
 request 속성값 : <%= request.getAttribute("request")%>
  <br>
  <%= request.getAttribute("id")%>
  
</body>
</html>