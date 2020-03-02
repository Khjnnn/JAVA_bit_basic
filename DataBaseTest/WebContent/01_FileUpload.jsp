<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="generator" content="Codeply">
	<link rel="stylesheet" href="./css/bootstrap.min.css" />
    <link rel="stylesheet" href="./css/animate.min.css" />
    <link rel="stylesheet" href="./css/ionicons.min.css" />
    <link rel="stylesheet" href="./css/styles.css" />
<title>File Upload</title>
</head>
<body>


 <header id="first">
        <div class="header-content">
            <form action = "ftpupload" method = "post" enctype="Multipart/form-data">
                <h1 class="cursive"> File Upload Form  </h1>
                <h4>A free FileUpload page</h4>
                <table align="center" border=0 cellpadding=0 cellspacing=0>
                <tr>
                	<td> <p class="p.text-primary "> Writer &nbsp </p>  </td>
                	<td> <input style= "font-size:12pt; color:#000000" type = "text" name = "name"> </td>
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