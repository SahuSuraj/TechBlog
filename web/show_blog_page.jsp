
<%@page import="com.tech.blog.dao.LikeDao"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.tech.blog.dao.UserDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entities.Category"%>
<%@page import="com.tech.blog.entities.Post"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.entities.User"%>
<%@page errorPage="error_page.jsp"%>

<%

User user=(User)session.getAttribute("currentUser");
if(user==null){
    response.sendRedirect("login_page.jsp");
}
%>


<%

int postId = Integer.parseInt(request.getParameter("post_id"));
PostDao d = new PostDao(ConnectionProvider.getConnection());

Post p = d.getPostByPostId(postId);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> <%= p.getpTitle()  %>|| TechBlog by Prateek Prajapati </title>
        
        
<!--      !--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            body{
                background:url(img/backgroung_img.jpg);
                background-size:cover;
                background-attachment:fixed;
            }
            
            .post-title{
                font-weight:100;
                font-size:30px;
            }
            .post-content{
                 font-weight:100;
                font-size:25px;
            }
            .post-date{
                font-style:italic;
                font-weight:bold;
            }
            .post-user-info{
               font-weight:200;
                font-size:20px;
            }
            .row-user{
                border:1px solid #e2e2e2;
                padding-top:15px;
            }
        </style>
        <div id="fb-root"></div>
<script async defer crossorigin="anonymous" src="https://connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v7.0"></script>
    
    </head>
    <body>
        
        
<!--       navbar start-->

        <nav class="navbar navbar-expand-lg navbar-dark primary-background">
      <a class="navbar-brand" href="index.jsp"><span class="fa fa-laptop"></span> Tech Blog</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" 
          data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
          aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <a class="nav-link" href="profile.jsp"><span class="fa fa-archive"></span>Learn With <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <span class="fa fa-caret-square-o-down"></span>Cateories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Programming</a>
          <a class="dropdown-item" href="#">Project Implementation</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Data Structure</a>
        </div>
      </li>
      <li class="nav-item">
          <a class="nav-link" href="#"><span class="fa fa-address-book-o"></span>Contact</a>
      </li>
      <li class="nav-item">
          <a class="nav-link" href="#" data-toggle="modal" data-target="#add-post-modal"><span class="fa fa-plus-circle fa-spin"></span>Create Post</a>
      </li>
     
    </ul>
      <ul class="narbar-nav mr-right">
          <li class="nav-item text-white">
             <a class="nav-link text-white" href="#!" data-toggle="modal" data-target="#profile-modal"><span class="fa fa-user-circle text-white"></span><%= user.getName() %></a> 
      </li>
          <li class="nav-item text-white">
             <a class="nav-link text-white" href="LogoutServlet"><span class="fa fa-user-plus text-white"></span>Log out</a>
      </li>
      </ul>
  </div>
</nav>
<!--        end nav bar-->
        
        <!--main content of the body-->
        <div class="container">
            <div class="row my-4">
                <div class="col-md-8 offet-md-2">
                    <div class="card">
                        <div class="card-header">
                            <h4 class="post-title"><%= p.getpTitle() %></h4>
                        </div>
                        
                        <div class="card-body">
                            <img class="card-img-top" src="<%= p.getpPic()%>">
                            <div class="row my-3 row-user">
                                <div class="col-md-8">
                                    
                                    <% UserDao ud = new UserDao(ConnectionProvider.getConnection()); %>
                                    <p class="post-user-info"><a href="#!"><%= ud.getUserByUserId(p.getUserId()).getName()%></a> has posted</p>
                                </div>
                                <div class="col-md-4">
                                    <p class="post-date"><%= DateFormat.getDateTimeInstance().format(p.getpDate()) %></p>
                                </div>
                            </div>
                            <p class="post-content"><%= p.getpContent()%></p>
                            <br>
                            <br>
                            <div class="post-code">
                            <pre> <%= p.getpCode() %></pre>
                            </div>
                        </div>
                        <div class="card-footer">
                            
                            <%
                            LikeDao ld = new LikeDao(ConnectionProvider.getConnection());
                            %>
                            
                            
                            <a href="#" onclick="doLike(<%= p.getPid() %>,<%= user.getId() %>)" class="btn btn-outline-dark btn-sm"><i class="fa fa-thumbs-o-up"></i><span class="like-counter"><%= ld.countLikeOnPost(p.getPid())%></span></a>
                             <a href="#" class="btn btn-outline-dark btn-sm"><i class="fa fa-commenting-o"></i><span>20</span></a>
                        </div>
                             <div class="card-footer">
                                 
                                <div class="fb-comments" data-href="http://localhost:8080/Tech_Blog/show_blog_page.jsp?post_id=<%= p.getPid() %>" data-numposts="5" data-width=""></div>
                             </div>
                    </div>
                </div>
            </div>
            
        </div>
        <!--end main contant of the body-->
        
        
<!--Start profile model-->

<!-- Modal -->

<div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header primary-background text-white">
        <h5 class="modal-title" id="exampleModalLabel">TechBlog</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <div class="container text-center">
              <img src="pics/<%= user.getProfile() %>" class="img-fluid" style="border-radius:40%;max-width:150px;"><br>
              <h5 class="modal-title" id="exampleModalLabel"><%=user.getName() %></h5>
              
              <!--details-->
              <div id="profile-detail">
              <table class="table">
           
             <tbody>
                <tr>
                  <th scope="row">ID</th>
                  <td><%= user.getId()%></td>
                  
                </tr>
                <tr>
                  <th scope="row">Email</th>
                  <td><%= user.getEmail()%></td>
                </tr>
                <tr>
                  <th scope="row">Gender</th>
                  <td><%= user.getGender()%></td>
                 
                </tr>
                 <tr>
                  <th scope="row">About</th>
                  <td><%= user.getAbout()%></td>
                 
                </tr>
                <tr>
                  <th scope="row">Registered on</th>
                  <td><%= user.getDateTime().toString() %></td>
                 
                </tr>
              </tbody>
             </table>
              </div>
                  
                  <!--profile edit-->
                  <div id="profile-edit" style="display:none;">
                      <h3 class="mt-2">Please Edit Carefully</h3>
                      <form action="EditServlet" method="POST" enctype="multipart/form-data">
                          <table class="table">
                              <tr>
                                  <td>ID</td>
                                  <td><%= user.getId()%></td>
                              </tr>
                              
                               <tr>
                                  <td>Gender</td>
                                  <td><%= user.getGender().toUpperCase() %></td>
                              </tr>
                              
                               <tr>
                                  <td>Email</td>
                                  <td><input type="email" class="form-control" name="user_email" value="<%= user.getEmail()%>"></td>
                              </tr>
                              
                              <tr>
                                  <td>Name</td>
                                  <td><input type="text" class="form-control" name="user_name" value="<%= user.getName()%>"></td>
                              </tr>
                              
                              <tr>
                                  <td>Password</td>
                                  <td><input type="password" class="form-control" name="user_password" value="<%= user.getPassword()%>"></td>
                              </tr>
                              
                              <tr>
                                  <td>About</td>
                                  <td>
                                      <textarea roes="5" class="form-control" name="user_about"><%= user.getAbout()%>
                                      </textarea>
                                  </td>
                              </tr>
                              
                              <tr>
                                  <td>Profile</td>
                                  <td>
                                      <input type="file" name="image" class="form-control"/>
                                  </td>
                              </tr>
                             
                          </table>
                                      <div class="container">
                                          <button type="submit" class="btn btn-outline-primary">Save</button>
                                      </div>
                          
                      </form>
                  </div>
              
              
          </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button id="edit-profile-btn" type="button" class="btn btn-primary">Edit</button>
      </div>
    </div>
  </div>
</div>

<!--End of profile model-->


<!--Add post model-->

<!-- Modal -->
<div class="modal fade" id="add-post-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header primary-background text-white">
        <h5 class="modal-title text-center" id="exampleModalLabel">Create Your Post</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        
          <form id="add-post-form" action="AddPostServlet" method="POST">
              
              <div class="form-group">
                   <select class="form-control" name="cid">
                  <option selected disabled>---SELECT CATEGORY---</option> 
                  <%
                  PostDao postd=new PostDao(ConnectionProvider.getConnection());
                  ArrayList<Category> list=postd.getAllCategories();
                  for(Category c:list)
                  {
                  %>
                  <option value="<%= c.getCid() %>"><%= c.getName() %></option>
                  
                  <%
                  }    
                  %>
              </select>
              </div>
              <div class="form-group">
                  <input type="text" name="pTitle" placeholder="Enter Your Title"class="form-control"/>
                  
              </div>
              <div class="form-group">
                  <textarea type="text" name="pContent" placeholder="Enter Your Content"class="form-control"></textarea>
              </div>
              <div class="form-group">
                  <textarea type="text" name="pCode" placeholder="Enter Your Code(If Any)"class="form-control"></textarea>
              </div>
              <div class="form-group">
                  <label>Select Your Photo</label><br>
                  <input type="file" name="pic" class="form-control"/>
              </div>
              <div class="container text-center">
                  
                  <button type="submit" class="btn btn-outline-primary">POST</button>
                  
              </div>
          </form>
          
      </div>
     
    </div>
  </div>
</div>
<!--End Add Post model-->




<!--     JavaScript   -->
        <script src="https://code.jquery.com/jquery-3.5.0.min.js" integrity="sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
        
        <script>
            $(document).ready(function(){
                let editStatus = false;
                
                $('#edit-profile-btn').click(function(){
                  if(editStatus==false){
                    $('#profile-detail').hide()
                    
                    $('#profile-edit').show();
                    editStatus = true;
                    $(this).text("Back")
                  }else{
                      $('#profile-detail').show()
                    
                    $('#profile-edit').hide();
                    editStatus = false;
                    $(this).text("Edit")
                  }
                    
                })
            });
            
            
        </script>
        <!--now add post javascript-->
        
        <script>
            $(document).ready(function(e){
                $("#add-post-form").on("submit",function(event){
                  event.preventDefault();
                  console.log("You have clicked on submit")
                  
                 let form= new FormData(this);
                 $.ajax({
                     url: "AddPostServlet",
                     type: 'POST',
                     data: form,
                     success: function (data, textStatus, jqXHR){
                         console.log(data);
                         if(data.trim() == 'done')
                         { 
                           swal("Good job!", "Your Blog Post Successfully", "success");
                         } 
                         else
                         {
                           swal("Error!", "Please Select All Fields!", "error");
                         }
                     },
                     error:function (jqXHR, textStatus, errorThrown)
                     {
                          swal("Error!", "Please Select All Fields!", "error");
                     },
                     processData:false,
                     contentType:false
                 })
                })
            })
            
        </script>
        
        
    </body>
</html>
