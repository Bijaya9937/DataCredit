<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile Score</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/css/profileScore.css"/>">
</head>
<body>
<div class="logocontainer">
    	<img src="<c:url value="/resources/img/DataCredit.png" />" alt="">
	</div>
<div class="container">
    <div class="mycontainer">
        <div class="heading">
            <h4><span class="text-primary" id="hname"></span>We are reviewing your profile.</h4>
        </div>
        <div class="gauge">
  			<div class="gauge__body">
    			<div class="gauge__fill"></div>
    			<div class="gauge__cover"></div>
    			
  			</div>
  			<div class="cscore"></div>
			<div class="tips"></div>
  		</div>
  		<div class="btncontainer">
        <button class="btn btn-primary btn-sm"> <a href="${pageContext.request.contextPath}/cardbenefit/${email}" style="color:white; text-decoration:none">Explore More</a> </button>
      </div>
        
    </div>
</div>
</body>
<script src="<c:url value="/resources/js/profileScore.js"/>"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
    crossorigin="anonymous"></script>

</html>