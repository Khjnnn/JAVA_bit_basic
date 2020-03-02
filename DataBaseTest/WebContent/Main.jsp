<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript"></script>
</head>
<body>
	<table align="center" border = 1 width="1200">
		
		<tr height="70" >
			<td align="center" rowspan= "2" colspan="3" width ="240">
				<jsp:include page="Form/Form_Left_Barmenu.jsp"></jsp:include>
			</td>
			<td align="center" width="960" colspan="3">
				<jsp:include page="Form/Form_TopMenu.jsp"></jsp:include>
			</td>
		</tr>
		
		<tr height="900">
			<td align="center" width="140">
				<jsp:include page="Form/Form_LeftMenu.jsp"></jsp:include>
			</td>
			
			<td align="center" width ="680">
				
			</td>
			
			<td align="center" width="140">
				<jsp:include page="Form/Form_RightMenu_Ring.jsp"></jsp:include>
			</td>
		</tr>
	
	</table>


	<table align="center">
		<tr>
			<td align="center"><input type="image" src="http://10.10.10.109/img/left/left_event_ring.png"
				onclick='left_selectmenu(<%=session.getAttribute("RING")%>)'>
			</td>
		</tr>
		<td><br><br><br></td>
		<tr>
			<td align="center"><input type="image" src="http://10.10.10.109/img/left/left_event_string.png"
				onclick='left_selectmenu(<%=session.getAttribute("STRING")%>)'>
			</td>
		</tr>
		<td><br><br><br></td>
		<tr>
			<td align="center"><input type="image" src="http://10.10.10.109/img/left/left_event_feather.png"
				onclick='left_selectmenu(<%=session.getAttribute("FEATHER")%>)'>
			</td>
		</tr>
		<td><br><br><br></td>
		<tr>
			<td align="center"><input type="image" src="http://10.10.10.109/img/left/left_event_deco.png"
				onclick='left_selectmenu(<%=session.getAttribute("DECO")%>)'>
			</td>
		</tr>
	</table>

</body>
</html>