<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Card Benefits</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
  <link rel="stylesheet" href="<c:url value="/resources/css/cardbenefit.css" />">
</head>

<body>
<div class="logocontainer">
    	<img src="<c:url value="/resources/img/DataCredit.png" />" alt="">
	</div>
  <div class="container">
    <div class="maincontainer">
      <div class="headingDiv">
        <h3>Membership Benefits</h3>
      </div>

      <div class="lowerContainer">

        <div class="img">
          <img src="<c:url value="/resources/img/rewards.jpg" />" alt="">
        </div>

        <div class="details">

          <div class="accordion" id="accordionExample">
            <div class="accordion-item">
              <h2 class="accordion-header" id="headingOne">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                  data-bs-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
                  Get rewarded for your spending
                </button>
              </h2>
              <div id="collapseOne" class="accordion-collapse collapse" aria-labelledby="headingOne"
                data-bs-parent="#accordionExample">
                <div class="accordion-body">
                  Explore the many ways you can turn your spends into rewards with -
                  <ul>
                    <li>1 Membership Rewards� Point for every INR 401 spent on your card except for Fuel, Insurance and
                      Utilities.</li>
                    <li>5 Membership Rewards points for every INR 100 spent on Fuel.</li>
                  </ul>
                  From travel, dining, shopping to charging all your expenses to your Card, get more value from all your
                  spends.
                  <br><br>
                  What's more? Your points never expire!
                </div>
              </div>
            </div>

            <div class="accordion-item">
              <h2 class="accordion-header" id="headingTwo">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                  data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                  Triple Your Rewards
                </button>
              </h2>
              <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo"
                data-bs-parent="#accordionExample">
                <div class="accordion-body">
                  Turn your overseas spends into experiences you will cherish with 3X Membership Rewards Points on all
                  your purchases made when traveling abroad.<br><br>
                  Maximise your Cardmembership with this special feature exclusively for you.
                </div>
              </div>
            </div>

            <div class="accordion-item">
              <h2 class="accordion-header" id="headingThree">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                  data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                  Redeem Your Rewards
                </button>
              </h2>
              <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree"
                data-bs-parent="#accordionExample">
                <div class="accordion-body">
                  Whether it is a new pair of headphones, a family trip away or even your morning coffee and pastry, when
                  we say you can use them for pretty much anything, we mean exactly that.
                  <ul>
                    <li>Our Membership Rewards catalogue offers you a wide range of entertainment, travel and dining
                      products including electronics, fitness gadgets, kitchen accessories, luggage and much more to
                      choose from.</li>
                    <li>Book travel on the American Express Online Travel website including flights, hotels and
                      experiences. You can even use your points to pay for taxes and fees.</li>

                    <li>Pay with points at online retailers</li>
                    <li>Purchase Gift Cards or eVouchers from a choice of well-known brands.</li>
                    <li>Transfer points to travel, hotel and retail loyalty programmes.</li>
                    <li>Use points to offset any purchase made on your Card once it appears on your statement.</li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="headingDiv">
        <h3>Card Benefits</h3>
      </div>

      <div class="middlecontainer">

        <div class="img">
          <img src="<c:url value="/resources/img/cardbenifit.jpg" />" alt="">
        </div>

        <div class="details">
          <div class="accordion" id="accordionExample">
            <div class="accordion-item">
              <h2 class="accordion-header" id="headingFour">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                  data-bs-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                  Card Benefits
                </button>
              </h2>
              <div id="collapseFour" class="accordion-collapse collapse" aria-labelledby="heading"
                data-bs-parent="#accordionExample">
                <div class="accordion-body">
                  <ul>
                    <li>No cost repayment up to 60 days.</li>
                    <li>Convert your online purchases to no cost EMI (Every Month Installment) up to 24 months.</li>
                    <li>Reward points worth of Rs.4000, which can be adjusted in your bill payment.</li>
                    <li>Up to 2.5% Instant cash back on fuel purchase.</li>
                    <li>Free medical coverage up to 1 lakh.</li>
                    <li>8 Domestic airport lounges per year.</li>
                    <li>8 International airport lounges per year.</li>
                    <li>Travel benefits while travelling abroad.</li>
                    <li>Instant reward points on online and offline card usage.</li>
                    <li>Get assured cashback on amazon and flipkart up to 15%</li>
                    <li>Withdraw cash on the go up to 45% of your total credit limit without any charges.</li>
                    <li>Get access to American Express premium membership.</li>
                  </ul>
                </div>
              </div>
            </div>

          </div>
        </div>
      </div>

      <div id="btncontainer">
        <button class="btn btn-primary btn-sm"> <a href="${pageContext. request. contextPath}/carddetails/${email}" style="color:white; text-decoration:none">Accept And Continue</a> </button>
      </div>

    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
      crossorigin="anonymous"></script>

    <script src="<c:url value="/resources/js/cardbenefit.js" />"></script>
</body>

</html>

<!-- <a href="carddetails/${email}" style="color:white; text-decoration:none">Accept And Continue</a> -->