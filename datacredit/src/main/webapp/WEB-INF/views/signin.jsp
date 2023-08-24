<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@page import="java.util.*" %>
<%
Random rand = new Random();
int n = rand.nextInt(9000) + 1000;
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SignIn Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/css/signin.css" />">

</head>

<body>
    <div class="logocontainer">
    	<img src="<c:url value="/resources/img/DataCredit.png" />" alt="">
	</div>
    <div class="mycontainer">
        <div id="main">
            <p class="text-primary" id="htext">Get Your OTP &#128522;</p>
            
			<div id="${msge}"></div>
            <form action="${pageContext. request. contextPath}/otpEmail" method="post">
                <div class="mb-3">
                    <input type="hidden" name="signinOtp" id="otp" value="<%=n%>">
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">EMAIL ADDRESS</label>
                    <input type="text" name="signinEmail" class="form-control" id="email">
                </div>
      			
      			
      			<div class="text text-center">
                	<button id="btn" type="submit" class="btn btn-primary">GET OTP</button>
				</div>
                

	        </form>
        </div>
    </div>


</body>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.27.2/axios.min.js" integrity="sha512-odNmoc1XJy5x1TMVMdC7EMs3IVdItLPlCeL5vSUPN2llYKMJ2eByTTAIiiuqLg+GdNr9hF6z81p27DArRFKT7A==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="<c:url value="/resources/js/signin.js" />"></script>
    
</html>