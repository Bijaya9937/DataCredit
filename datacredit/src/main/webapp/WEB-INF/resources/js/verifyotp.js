
const id=document.getElementById("sentConfirmed");

if(id != null)
{
	document.getElementById('sentConfirmed').innerHTML='<b>OTP has been sent successfully !!!</b>'; 
	document.getElementById('sentConfirmed').style.color="green";
	setTimeout(function() {document.getElementById('sentConfirmed').innerHTML='';},3000);
}
