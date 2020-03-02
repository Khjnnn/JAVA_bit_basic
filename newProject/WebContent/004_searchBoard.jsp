<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.util.*" %>    
<!DOCTYPE html>
<%


ArrayList<String> titleList = (ArrayList<String>)request.getAttribute("titleList");
ArrayList<String> dateList = (ArrayList<String>)request.getAttribute("dateList");
ArrayList<String> imageList = (ArrayList<String>)request.getAttribute("imageList");
ArrayList<String> viewCountList = (ArrayList<String>)request.getAttribute("viewCountList");

%>
<html>
<head>
<meta charset="EUC-KR">
<title>검색 결과</title>
<script type="text/javascript">



////////타이틀, 날짜, 이미지 주소, 조회수 가져오는 부분/////
var titleArray = new Array();
<% for(int i=0; i< titleList.size(); i++){%>
titleArray[<%=i%>] = '<%=titleList.get(i)%>';
<%}%>
var dateArray = new Array();
<% for(int i=0; i< dateList.size(); i++){%>
dateArray[<%=i%>] = '<%=dateList.get(i)%>';
<%}%>

var imageArray = new Array();
<% for(int i=0; i< imageList.size(); i++){%>
imageArray[<%=i%>] = '<%=imageList.get(i)%>';
<%}%>

var viewCountArray = new Array();
<% for(int i=0; i< viewCountList.size(); i++){%>
viewCountArray[<%=i%>] = '<%=viewCountList.get(i)%>';
<%}%>
////////타이틀, 날짜, 이미지 주소, 조회수 가져오는 부분/////

var name = '<%=(String)request.getAttribute("name")%>';
var result = '<%=(String)request.getAttribute("result")%>';

	function searchResult(){
		if (result == null || result == "") {
			document.write("<p align = 'center'>");
			document.write("<br> <br>" + name + "의 검색결과입니다. <br>");

			for (var i = 0; i < titleArray.length; i++) {
				document.write("<p align = 'center'>");
				document.write("title : " + titleArray[i] + "<br>");
				document.write("date : " + dateArray[i] + "<br>");
				document.write("by. " + name + "<br><br>");
				document.write("<img src = '" + imageArray[i] + "'><br><br>");
				document.write("view : " + viewCountArray[i] + "<br>");
				document.write("<br><hr width  = '50%'><br>");
				document.write("</p>");
			}
		
		}else {
			alert(result);
		}
	}
</script>
</head>
<body onload = "searchResult()">
something is wrong with the script or servlet
</body>
</html>