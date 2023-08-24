<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SignUp Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="/resources/css/signup.css" />">

</head>

<body>
    <div class="logocontainer">
    	<img src="<c:url value="/resources/img/DataCredit.png" />" alt="">
	</div>
    <div class="mycontainer">
        <div id="main">
            <p class="text-primary" id="htext">Sign Up</p>

            <div id="alert"></div>


            <form action="signupRes" method="post">
                <div class="mb-3" id="inputname">
                    <label for="name" class="form-label">FULL NAME</label>
                    <input type="text" name="signupName" class="form-control" id="name" autofocus required>
                </div>


                <div class="mb-3">
                    <label for="email" class="form-label">EMAIL ADDRESS</label>
                    <input type="text" name="signupEmail" class="form-control" id="email" required>
                </div>
                
                <div class="mb-3">
                    <label for="phonenumber" class="form-label">PHONE NUMBER</label>
                    <input type="tel" name="signupNumber" class="form-control" id="mobilenumber" required>
                </div>
				
				<div class="mb-3">
                    <label for="password" class="form-label">PASSWORD</label>
                    <input type="password" name="signupPassword" class="form-control" id="password" required>
                </div>

                <button id="btn" type="submit" class="btn btn-primary">SUBMIT</button>

                <div id="logintext" class="text-center text-primary my-2">
                	Already have an account? <a href="signinEmail/''" id="alogin"> Login</a>
                </div>
	        </form>
        </div>
    </div>


</body>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.27.2/axios.min.js" integrity="sha512-odNmoc1XJy5x1TMVMdC7EMs3IVdItLPlCeL5vSUPN2llYKMJ2eByTTAIiiuqLg+GdNr9hF6z81p27DArRFKT7A==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <!--  <script src="<c:url value="/resources/js/script.js" />"></script>-->
    
</html>