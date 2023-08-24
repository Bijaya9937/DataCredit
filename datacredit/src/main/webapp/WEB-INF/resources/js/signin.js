
const id=document.getElementById("valid");
const inputText=document.getElementById("email");
const btn=document.getElementById("alogin");

const mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

if(id != null)
{
	document.getElementById('valid').innerHTML='<b>Successfully Signed In !!!</b>'; 
	document.getElementById('valid').style.color="green";
	setTimeout(function() {document.getElementById('valid').innerHTML='';},4000);
}


