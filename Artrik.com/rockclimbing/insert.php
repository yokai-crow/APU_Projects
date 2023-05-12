<?php
$name=$_POST['fullname'];
$phone=$_POST['phone'];
$email=$_POST['email'];
$subject=$_POST['subject'];
$detail=$_POST['detail'];



//Establishing connection with server
$conn=new mysqli('localhost','root', '','artrik_room');

//check for connection error
if($conn->connect_error){
    die("Error in db connection:".$conn->connect_errno.":".$conn->connect_error);
}
//insert value
$insert="insert into suggestion(id, name, phone, email, subject, detail)
values('','$name','$phone','$email','$subject','$detail')";
if($conn->query($insert)){
    echo '<script>alert("Thank you! We will get in touch with you soon");
            window.location = "../index.html";
    </script>';
   // header("location:../index.html ");
}
else{
    echo'error'.$conn->error;
}

//close connection
mysqli_close($conn);
?>