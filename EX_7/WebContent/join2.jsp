<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>

<jsp:useBean id="bean" class="bean.joins" scope="session"/>
<jsp:setProperty property="*" name="bean" />
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr> <td> 아이디 </td> <td> <jsp:getProperty property="id" name="bean"/>
</tr>
<tr> <td> 비밀번호 </td> <td> <jsp:getProperty property="pw" name="bean"/>
</tr>
<tr> <td> 이름 </td> <td>  <jsp:getProperty property="name" name="bean"/>
</tr>
</table>
</body>
</html>