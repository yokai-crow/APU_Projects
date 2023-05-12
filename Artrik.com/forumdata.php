<?php
$name=$_POST['fullname'];
$subject=$_POST['subject'];
$detail=$_POST['detail'];



//Establishing connection with server
$conn=new mysqli('localhost','root', '','artrik_room');

//check for connection error
if($conn->connect_error){
    die("Error in db connection:".$conn->connect_errno.":".$conn->connect_error);
}
//insert value
$insert="insert into forum(id, name, subject, detail)
values('','$name','$subject','$detail')";

if($conn->query($insert)){
    echo '<script>alert("Thread Added successfully");
            window.location = "./forum.php";
    </script>';
   // header("location:../index.html ");
}
else{
    echo'error'.$conn->error;
}

//close connection
mysqli_close($conn);
?>