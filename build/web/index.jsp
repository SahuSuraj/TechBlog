

<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tech Blog</title>
        
<!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
/*            .banner-background{
          clip-path: polygon(30% 0%, 70% 0%, 100% 0, 99% 73%, 69% 88%, 33% 74%, 0 86%, 0 0);
            }*/
        </style>

     
    </head>
    
    <body>
<!--navbar-->
    <%@include file="normal_navbar.jsp" %>
<!--BANNER-->
<div class="container-fluid p-0 m-0">
    
    <div class="jumbotron primary-background text-white">
        <div class="container">
        <h3 class="display-3">Welcome to Tech Blog</h3>
        <p>A programming language is a formal language, which comprises a set of instructions that produce various kinds of output. Programming languages are used in computer programming to implement algorithms</p>
        <p>Thousands of different programming languages have been created, and more are being created every year. Many programming languages are written in an imperative form (i.e., as a sequence of operations to perform) while other languages use the declarative form (i.e. the desired result is specified, not how to achieve it). </p>
        
        <button class="btn btn-outline-light btn-lg"><span class="fa fa-external-link"></span>Start!Its Free</button>
        <a href="login_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-circle fa-spin"></span>Login</a>
        
        </div>
    </div>
    
    
</div>

<!--//cards-->

<div class="container">
    
    <div class="row">
         <div class="col-md-4">
           <div class="card">
                <div class="card-body">
                     <h5 class="card-title">Java Programming Language</h5>
                     <p class="card-text">Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible. It is intended to let application developers write once, run anywhere (WORA),[</p>
                     <a href="#" class="btn primary-background text-white">Read more..</a>
                </div>
          </div> 
        </div> 
        
           <div class="col-md-4">
           <div class="card">
                <div class="card-body">
                     <h5 class="card-title">Python Programming Language</h5>
                     <p class="card-text">Python is an interpreted, high-level, general-purpose programming language. Created by Guido van Rossum and first released in 1991, Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.</p>
                     <a href="#" class="btn primary-background text-white">Read more..</a>
                </div>
          </div> 
        </div> 
        
           <div class="col-md-4">
           <div class="card">
                <div class="card-body">
                     <h5 class="card-title">Data Structure</h5>
                     <p class="card-text">In computer science, a data structure is a data organization, management, and storage format that enables efficient access and modification. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data.</p>
                     <a href="#" class="btn primary-background text-white">Read more..</a>
                </div>
          </div> 
        </div> 
        
   </div>
    
     <div class="row">
         <div class="col-md-4">
           <div class="card">
                <div class="card-body">
                     <h5 class="card-title">C++ Programming Language </h5>
                     <p class="card-text">C++ was designed with a bias toward system programming and embedded, resource-constrained software and large systems, with performance, efficiency, and flexibility of use as its design highlights.</p>
                     <a href="#" class="btn primary-background text-white">Read more..</a>
                </div>
          </div> 
        </div> 
        
           <div class="col-md-4">
           <div class="card">
                <div class="card-body">
                     <h5 class="card-title">C Programming Language</h5>
                     <p class="card-text">A successor to the programming language B, C was originally developed at Bell Labs by Dennis Ritchie between 1972 and 1973 to construct utilities running on Unix. It was applied to re-implementing the kernel of the Unix operating system.[</p>
                     <a href="#" class="btn primary-background text-white">Read more..</a>
                </div>
          </div> 
        </div> 
        
           <div class="col-md-4">
           <div class="card">
                <div class="card-body">
                     <h5 class="card-title">Bootstrap (front-end framework)</h5>
                     <p class="card-text">Bootstrap is a free and open-source CSS framework directed at responsive, mobile-first front-end web development. It contains CSS- and (optionally) JavaScript-based design templates for typography, forms, buttons, navigation, and other interface components.</p>
                     <a href="#" class="btn primary-background text-white">Read more..</a>
                </div>
          </div> 
        </div> 
        
   </div>
    
    
</div>

<!--     JavaScript   -->

        <script src="https://code.jquery.com/jquery-3.5.0.min.js" integrity="sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
    </body>
</html>
