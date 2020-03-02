<%@page import="bean.Beantest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<jsp:useBean id="beantest" class="bean.Beantest" scope="session"/>
				<%// 빈이름           자바빈 클래스명         범위(스코프)  %>

<jsp:setProperty property="name" name="beantest" />
				<%// 빈이름(전체*)       속성명	    	  설정할 값 (자동지정) %>
<jsp:setProperty property="kor" name="beantest" />
<jsp:setProperty property="eng" name="beantest" />
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:getProperty property="name" name="beantest"/> <br>
<jsp:getProperty property="kor" name="beantest"/> <br>
<jsp:getProperty property="eng" name="beantest"/>

</body>
</html>