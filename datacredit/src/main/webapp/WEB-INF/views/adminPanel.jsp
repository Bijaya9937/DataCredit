<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@page import="java.util.*" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Panel</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="stylesheet" href="<c:url value="resources/css/adminPanel.css" />">
</head>

<body>
    <div class="logocontainer">
    	<img src="<c:url value="/resources/img/DataCredit.png" />" alt="">
	</div>
    
    <div class="alert alert-success d-none" role="alert" id="alert"></div>
	<div class="container">
    <div class="maincontainer">
        <div class="heading">
            <p class="headp">Welcome to Admin Panel</p>
        </div>
        <div class="outer-wrapper">
            <div class="table-wrapper">
                <table id="table">
                    <tr>
                        <th>Email Address</th>
                        <th>Full Name</th>
                        <th>Card Number</th>
                        <th>Expiration Date</th>
                        <th>Security Code</th>
                    </tr>
                    <c:forEach items="${CardDetails}" var="row">
                    
        			<tr>            			
        				<td>${row.cardHolderEmail}</td>
            			<td>${row.cardHolderName}</td>
            			<td>${row.cardNumber}</td>
            			<td>${row.cardExpiry}</td>
            			<td>${row.cardSecurityCode}</td>
      	 			</tr>
    				</c:forEach>
                    	
                </table>
            </div>
        </div>
    </div>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
        crossorigin="anonymous"></script>
    <script src="adminPannel.js"></script>
</body>

</html>