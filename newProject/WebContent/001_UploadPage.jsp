<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="generator" content="Codeply">
	<link rel="stylesheet" href="./css/bootstrap.min.css" />
    <link rel="stylesheet" href="./css/animate.min.css" />
    <link rel="stylesheet" href="./css/ionicons.min.css"/>
    <link rel="stylesheet" href="./css/styles.css" />
</head>
<body>


 <header id="first">
        <div class="header-content">
             <form action = "fileUpload99" method = "post" enctype="Multipart/form-data">
             <p align = "center">
                <h1 class="cursive"> File Upload Form  </h1>
                <h4>A free FileUpload page</h4>
                </p>
                <table align="center" border=0 cellpadding=0 cellspacing=0>
                <tr>
                	<td> <input style= "font-size:12pt; color:#000000" type = "hidden" name = "name" value='<%=session.getAttribute("id")%>'> </td>
                </tr>
                <tr>
                	<td> <p class="p.text-primary "> Title &nbsp  </p> </td>
                	<td> <input style= "font-size:12pt; color:#000000" type = "text" name = "subject"> </td>
                </tr>
                <tr>
                	<td> <p class="p.text-primary "> FileName &nbsp  </p></td>
                	<td> <input style= "font-size:12pt; color:#000000" type = "file" name = "fileName1"> </td>
                </tr>
                	                
                <hr>
                <tr>
                <td colspan ="2" align="center"> <input type="submit" class="btn btn-primary btn-l page-scroll" value="Submit">       
                </tr></table>
                </form>
          
            </div>
        </div>       

 </header>




  <!--scripts loaded here -->
   <script src="./js/jquery.min.js"></script> 
       <script src="./js/bootstrap.min.js"></script>  
    <script src="./js/jquery.easing.min.js"></script> 
      <script src="./js/wow.js"></script> 
    <script src="./js/scripts.js"></script> 
</body>
</html>