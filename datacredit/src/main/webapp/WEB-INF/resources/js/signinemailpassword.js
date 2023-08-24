const id1=document.getElementById("valid");
const id2=document.getElementById("NotValid");

if(id1 != null)
{
	document.getElementById('valid').innerHTML='<b>Successfully Sign Up</b>'; 
	document.getElementById('valid').style.color="green";
	setTimeout(function() {document.getElementById('valid').innerHTML='';},4000);
}
if(id2 != null)
{
	document.getElementById('NotValid').innerHTML='<b>Wrong Password</b>'; 
	document.getElementById('NotValid').style.color="red";
	setTimeout(function() {document.getElementById('NotValid').innerHTML='';},5000);
}