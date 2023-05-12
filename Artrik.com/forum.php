<?php
    include './rockclimbing/db.php';
?>

<!DOCTYPE html>
<html lang="en">
     
    <head>
        <title>
            ART-RIK | Forum
        </title>
        <link rel="icon" href="./img/unnamed-removebg-preview.png">
        <link rel="stylesheet" href="./css/decor.css">
        <style>
            .forum-input{
                border: 3px solid whitesmoke;
                height: 350px;
                width: 500px;
                margin:auto;
                padding-top: 15px;
                padding-left: 100px;
                padding-right: 40px;
                padding-bottom: 40px;
                border-radius: 20px;
            }
            .forum-input-box{
                align-items: center;
                display: flex;
                justify-content: center;
            }
            .form-input-box button{
                background: #1c00b5;
                width: 100px;
                border: none;
                outline: none;
                color: white;
                height: 36px;
                border-radius: 30px;
                margin-top: 20px;
                box-shadow: 0 5px 15px 0px rgba(28, 0, 181, 0.3);
            }
            .nam-sub{
                margin:auto;
                padding-top:1px;
                padding-bottom:8px;
                padding-right:100px;
                padding-left:10px;
            }
            .forumdiscuss{
                margin: 50px;
                padding-top: 10px;
                padding-right: 10px;
                text-align: justify;
                border-spacing: 50px;
                border: 1px solid whitesmoke;
                border-radius: 7px;
                background-color: white;
            }
            .begin{
                border:1px solid green;
                border-radius:10px;
                padding-left:10px;
                padding-right:20px;
                padding-top:10px;
                padding-bottom:10px;
            }
        </style>


    </head>

    <body>
        <header>
            <div class="headerImg">
                <a href="index.html">
                    <img src="./img/banner.png">
                </a>
            </div>
            <div class="nav">
                <!--<button>&#9776;</button>-->
                <img src="./img/unnamed-removebg-preview.png">
                <nav class="opt">
                    <a href="index.html">&#9750; HOME</a>
                    <a href="explore.html">&#9784; EXPLORE</a>
                    <div class="dropbar">
                        <button class="dropbtn">&#10064; CATEGORY</button>
                        <div class="dropCont">
                            <a href="#">DANCING</a>
                            <a href="#">CAMPING</a>
                            <a href="hiking.html">HIKING</a>
                            <a href="./rockclimbing/rockclimbing.html">ROCK CLIMBING</a>
                        </div>
                    </div>
                    <a href="./rockclimbing/contactus.html">&phone; CONTACT&nbsp;&nbsp;US</a>
                    <a href="About.html">&#9752; ABOUT</a> 
                </nav>
            </div>
        </header>
        <br/>
        <!--content area start(main viewport)-->
        <div class="content">
        <div class="forum-input">
                <h1 >Disscussion Forum</h1>
                <p style="color:green;">Discuss your topic of interest.</p>
                <br>
                <div class="forum-input-box">
                    
                        
                      
                        <form action="./forumdata.php" method="post" > 
                            <div class="input-row">
                                <div class="nam-sub">
                                    <span>Name:</span>
                                    <input type="text" name="fullname" placeholder="Mark Angel" id="fullname">
                                </div>
                                <div class="nam-sub">
                                    <span>Topic:</span>
                                    <input type="text" name="subject" id="subject" placeholder="Rock-climbing">
                                </div>
                            </div>
                            <span>Thoughts/ideas:</span><br>
                            <textarea type="text" name="detail" id="detail" placeholder="Your suggestion and feedback" rows="5" cols="20" class="nam-sub"></textarea>
                            <br>
                            <button type="submit" name="send" id="submit" value="submit">Send</button>
                            <button type="reset" name="reset" value="reset">Reset</button>
                        </form>
                    
                </div>



            </div>

            
            <div class="forumdiscuss">
                <h1 style="color:#777; text-align:center;">Disscussion Board</h1>
                <div class="uline"></div>
                <div class="begin">
                    <?php
                            $forum="SELECT * FROM forum WHERE 1";
                            $data=mysqli_query($conn,$forum);
                            if(mysqli_num_rows($data)>0)
                            {
                            while($content=mysqli_fetch_assoc($data))
                            {
                            echo"<p class='begin'>";
                            echo "<img src='img/unnamed.png' style='height:50px;width:50px;'>","<br>";
                            echo "Name: ",$content['name'];
                            echo "<br>Discussion topic: ",$content['subject'];
                            
                            echo "<br>Thread: ",$content['detail'];
                            
                            echo"</p><br>";
                            
                            }
                            } else
                            {
                            echo"forum closed";
                            }
                        ?>
                </div>
            </div>

        </div>

            <!--footer section start-->
        <footer id="footer">
            <div>
                <img src="./img/unnamed-removebg-preview.png" style="height: 130px; width: 130px;">
                <p>All rights reserved | Art-Rik.Com &copy; 2022</p>
            </div>
        </footer>
    </body>
</html>