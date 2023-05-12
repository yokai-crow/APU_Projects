function validation(){
    var fullname=document.getElementById("fullname").value;
    var phone=document.getElementById("phone").value;
    var email=document.getElementById("email").value;
    var subject=document.getElementById("subject").value;
    var detail=document.getElementById("detail").value;
    var error_message=document.getElementById("error_message");
    var text;

    error_message.style.padding="10px";
    if(fullname.length < 5){
        text="Please Enter the valid name:";
        error_message.innerHTML=text;
        return false;
    }

    if(subject.length < 4){
        text="Please Enter the valid subject:";
        error_message.innerHTML=text;
        return false;
    }
    if(isNaN(phone)|| phone.length != 10){
        text="Please Enter the valid phone number:";
        error_message.innerHTML=text;
        return false;
    }
    if(email.indexof("@") == -1|| email.length < 6){
        text="Please Enter the valid Email Address:";
        error_message.innerHTML=text;
        return false;
    }
    if(detail.length <= 60){
        text="Please Enter more than 60 characters:";
        error_message.innerHTML=text;
        return false;
    }
    alert("Form Submitted Successfully!");

    return true;
}