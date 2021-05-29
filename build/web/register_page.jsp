
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register page</title>
<!-- css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
/*    .banner-background{
            clip-path: polygon(30% 0%, 70% 0%, 100% 0, 99% 73%, 69% 88%, 33% 74%, 0 86%, 0 0);
            }*/
        </style>
        
    </head>
    
    <body>
<!--navbar-->
         <%@include file="normal_navbar.jsp" %>
    
         
         <main class="primary-background p-5 banner-background" >
            <div class="container">
                <div class="col-md-6 offet-md-3">
                    <div class="card">
                        <div class="card-header text-center primary-background text-white">
                            <span class="fa fa-user-plus fa-3x"></span>
                            <br>
                            Register here
                        </div>
                        <div class="card-body">
                            <form id="reg-form" action="RegisterServlet" method="POST">
                                 <div class="form-group">
                                    <label for="user_name">User Name</label>
                                    <input name="user_name" type="text" class="form-control" id="user_name" aria-describedby="emailHelp" placeholder="Enter Name">
                                 </div>
                                 <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input name="user_email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                 </div>
                                 <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input name="user_password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                 </div>
                                 <div class="form-group">
                                    <label for="Gender">Select Gender</label>
                                    <br>
                                    <input type="radio"id="gender" name="gender" value="Male">Male
                                    <input type="radio"id="gender" name="gender" value="Female">Female
                                 </div>
                                 <div class="frm-group">
                                    
                                    <textarea name="about" class="form-control" id="" cols="30" rows="10" placeholder="Enter Something about your self!"></textarea>
                                 </div>
                                 <div class="form-check">
                                    <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
                                    <label class="form-check-label" for="exampleCheck1">Agree Term and condition</label>
                                 </div>
                                <br>
                                <div class="container text-center" id="loader" style="display:none;">
                                    <span class="fa fa-refresh fa-spin fa-2x"></span>
                                    <h5>Please wait...</h5>
                                </div>
                                    <button id="submit-btn" type="submit" class="btn btn-primary">Submit</button>
                            </form>
                         </div>
                    </div>
                </div>
           </div>
         </main>
        
        
      
<!-- JavaScript-->

        <script src="https://code.jquery.com/jquery-3.5.0.min.js" integrity="sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="js/myjs.js" type="text/javascript"></script>  
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script>
            $(document).ready(function(){
              console.log("Loaded...")  
              
              $('#reg-form').on('submit',function(event){
               event.preventDefault();
             
        
        
        
               let form = new FormData(this);
               
               $("#submit-btn").hide();
               $("#loader").show();
               
//send register srvlet
                
               $.ajax({
                  url:"RegisterServlet",
                  type:'POST',
                  data: form,
                  success:function(data,textStatus, jqXHR){
                      console.log(data)
                      
                        $("#submit-btn").show();
                        $("#loader").hide();
                        
                        if(data.trim()==='done')
                        {
                        swal("Register successfully...Redirecting to Login Page!")
                              .then((value) => {
                                  window.location="login_page.jsp"
                             });
                         }else{
                             swal(data);
                         }
                  },
                  error:function(jqXHR, textStatus, errorThrown){
                       $("#submit-btn").show();
                        $("#loader").hide();
                       swal("Something went wrong....Try Again!");
                           
                  },
                  processData:false,
                  contentType:false
               });
    
                  
              });
              
            });
            
        </script>
    </body>
</html>
