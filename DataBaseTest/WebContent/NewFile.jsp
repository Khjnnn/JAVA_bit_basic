<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Boolean connect = false;

	String query_create = "create table student2(" + "id int not null auto_increment primary key,"
			+ "name varchar(10)" + ")";

	String query_insert = "insert into student2 values(null,'홍길동')";
	String query_select = "select * from stu1.student2";
	Class.forName("com.mysql.jdbc.Driver");

	try {
		conn = DriverManager.getConnection("jdbc:mysql://10.10.10.109:3306/stu1", "user", "1234");
		System.out.println(conn + ": DB connect 오케이");

		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(query_create);
			System.out.println("테이블 오케이~");
		} catch (Exception e) {
		}

		stmt.executeUpdate(query_insert);
		System.out.println("인써트 오케이~");
		
		rs = stmt.executeQuery(query_select); //셀렉트 문에만
		while(rs.next()){
			out.print(" id: "+ rs.getString(1));
			out.print(" name: " + rs.getString(2));
		}
		
		conn.close();
		
	} catch (Exception e) {
		System.out.println("에러에러");
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>