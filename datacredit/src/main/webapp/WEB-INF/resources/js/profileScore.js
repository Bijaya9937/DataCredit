const gaugeElement = document.querySelector(".gauge");
const tipsMessage=document.querySelector(".tips");
const cscore=document.querySelector(".cscore");

function setGaugeValue(gauge, value) {
  if (value < 0 || value > 1) {
    return;
  }
  gauge.querySelector(".gauge__fill").style.transform = `rotate(${
    value / 2
  }turn)`;
  gauge.querySelector(".gauge__cover").textContent = `${Math.round(
    value * 100
  )}%`;
 const cibilScore = value*850;
  
  console.log(cibilScore);
  cscore.innerText=`Your CIBIL Score :${Math.round(cibilScore)}`;
  if (cibilScore >= 750) {
  tipsMessage.innerText = "Congratulations on your excellent CIBIL score! With your responsible credit behavior, you're eligible for premium credit card offers with lower interest rates, higher credit limits, and exclusive rewards.";
} else if (cibilScore >= 650 && cibilScore < 750) {
  tipsMessage.innerText = "Your good CIBIL score shows that you're managing your finances well. Consider exploring credit cards with cashback rewards or travel benefits to make the most of your spending.";
} else if (cibilScore >= 550 && cibilScore < 650) {
  tipsMessage.innerText = "Your fair CIBIL score indicates room for improvement. Focus on timely payments and reducing credit utilization to enhance your score. As it improves, you'll unlock better credit card offers.";
} else {
  tipsMessage.innerText = "Your CIBIL score needs improvement, but don't worry! Start by paying bills on time and reducing outstanding debt. As your score improves, you'll gain access to more credit card benefits and financial opportunities.";
}
 
}
let x=Math.random();
setGaugeValue(gaugeElement, x);
