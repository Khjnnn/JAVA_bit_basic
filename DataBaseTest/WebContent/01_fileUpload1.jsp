<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "java.util.Enumeration" %>
<%@ page import = "com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import = "com.oreilly.servlet.MultipartRequest" %>
 
 <%
 	//업로드 폴더에 파일 업로드
 	String uploadPath = request.getRealPath("/upload");
 	String uploadDir =this.getClass().getResource("").getPath();
 	out.println("테스트경로 : " + uploadDir + "<br>");
 	uploadDir = uploadDir.substring(1,uploadDir.indexOf(".metadata"))+"uploadTest/WebContent/uploadImage";

    out.println("절대경로 : " + uploadDir + "<br>"); 
 	System.out.print("ddw:"+uploadDir+"<br>");
 	
 	//
 	out.print("realPath: "+ uploadPath+"<br>");
 	int size = 5*1024*1024;
 	String name = "";
 	String subject = "";
 	String fileName1 = "";
 	String originalName1 = "";


MultipartRequest multi = null;


try{
		// 파일 업로드 수행 구문
	multi = new MultipartRequest(
			request, //요청정보
			uploadDir, // 업로드 절대경로
			size, // 제한사이즈 (5메가)
			"UTF-8", // 인코딩 방식
			new DefaultFileRenamePolicy()
			);
	
	name = multi.getParameter("name");
	subject = multi.getParameter("subject");
	
	// 첨부파일 여러개 가져옴 
	Enumeration files = multi.getFileNames();
	
	
	// 파일명만 가져온다 
	String file1 = (String)files.nextElement();
	
	//multi에서 해당 이름을 알려주고 실제 시스템상 명칭 알아냄( 리얼네임 )
	fileName1 = multi.getFilesystemName(file1);
	
	//multi에서 알고있는 파일 원본이름을 파일1을 통해 알아냄(사용자가 올린 파일명) 
	originalName1 = multi.getOriginalFileName(file1);

	out.write("파일명 : " + originalName1 + "<br>");

	out.write("실제파일명 : " + fileName1 + "<br>");
	
	System.out.println(fileName1);
	System.out.println(file1);
	System.out.println(originalName1);
	System.out.println(name);
	System.out.println(subject);
	System.out.println(files);
	
	
}catch(Exception e){
	out.print(e.getMessage());
	System.out.print("file upload fail : " + e.getMessage()); // 로그기록 
	
}


 %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content = "text/html;charset=EUC-KR">

<title>file upload page</title>
</head>
<body>
<form action = "01_fileCheck.jsp" method = "post" name = "fileCheck">
<input type = "hidden" value = "<%=name%>" name = "name">
	<input type = "hidden" value = "<%=subject%>" name = "subject">
	<input type = "hidden" value = "<%=fileName1%>" name = "fileName1">
	<input type = "hidden" value = "<%=originalName1%>" name = "originalName1">
	<input type = "hidden" value = "<%=originalName1%>" name = "originalName1">
</form>
<a href = "#" onclick = "javascript:fileCheck.submit()"> 업로드 파일 확인</a>


</body>
</html>