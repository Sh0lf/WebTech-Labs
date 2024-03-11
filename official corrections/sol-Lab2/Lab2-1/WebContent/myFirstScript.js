function validateMyForm(){
    var fname = document.forms["f1"]["fName"].value;
    var lname = document.f1.lName.value;
    var bDay = document.f1.bDay.value;


    if (fname==null || fname=="") {
        alert("First name must be filled ");
        return false;
    }
    if (lname==null || lname==""){
    	alert("Last name must be filled");
        return false;
        }
    if (bDay==null || bDay==""){
    	alert("Birth day must be filled");
        	return false;
        }
    if (fname!=null && fname!=""){
    	alert("You typed: \n First Name: "+fname+"\n Last Name: "+lname+"\n BirthDay: "+bDay);
    }  
}

function toogleFM(){
	var x= document.getElementsByTagName("fieldset")[0].className;

	
	
	if (x== "fieldsetM"){
		document.getElementsByTagName("fieldset")[0].className= "fieldsetF";
		document.getElementsByTagName("fieldset")[1].className= "fieldsetF";
		document.getElementsByTagName("fieldset")[2].className= "fieldsetF";
		
		document.getElementsByTagName("legend")[0].style.color= "blue";
		document.getElementsByTagName("legend")[1].style.color= "blue";
		document.getElementsByTagName("legend")[2].style.color= "blue";
		
		document.getElementById("fName").style.borderColor = "blue";
		document.getElementById("lName").style.borderColor = "blue";
		document.getElementById("bDay").style.borderColor = "blue";
		
		document.getElementById("send").style.borderColor = "blue";
		
		document.getElementById("hello").innerHTML="Hello Madam";
	}else if(x== "fieldsetF"){
		document.getElementsByTagName("fieldset")[0].className= "fieldsetM";
		document.getElementsByTagName("fieldset")[1].className= "fieldsetM";
		document.getElementsByTagName("fieldset")[2].className= "fieldsetM";
		
		document.getElementsByTagName("legend")[0].style.color= "red";
		document.getElementsByTagName("legend")[1].style.color= "red";
		document.getElementsByTagName("legend")[2].style.color= "red";
		
		document.getElementById("fName").style.borderColor = "red";
		document.getElementById("lName").style.borderColor = "red";
		document.getElementById("bDay").style.borderColor = "red";
		
		document.getElementById("send").style.borderColor = "red";
		
		document.getElementById("hello").innerHTML="Hello Sir";
	}
}
