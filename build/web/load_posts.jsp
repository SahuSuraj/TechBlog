<%@page import="com.tech.blog.entities.User"%>
<%@page import="com.tech.blog.dao.LikeDao"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.blog.entities.Post"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>

<div class="row">
    
   
<%
        
    User uu = (User)session.getAttribute("currentUser");
//    slow down the loading
    
    
//    Thread.sleep(1000);
    
    

    PostDao d= new PostDao(ConnectionProvider.getConnection());
    int cid=Integer.parseInt(request.getParameter("cid"));
    List<Post> posts = null;
    if(cid==0){
         posts=d.getAllPosts();
    }else{
     posts=d.getPostByCatId(cid);
    }
    
    if(posts.size()==0){
        out.println("<h3 class='display-3 text-center'>Sorry!No Post In This Category...</h3>");
        return;
    }
    
    for(Post p:posts){
%>    
      
<div class="col-md-6 mt-2">
    
    <div class="card">
        <img class="card-img-top" src="<%= p.getpPic()%>">
       
        <div class="body">
            <b> <%= p.getpTitle()%></b>
            <p> <%= p.getpContent()%></p>
            <!--<pre><%= p.getpCode()%></pre>-->
            
        </div>
            <div class="card-footer text-center primary-background">
                <%
                
                LikeDao ld= new LikeDao(ConnectionProvider.getConnection());
                
                %>
<!--                <a href="#" onclick="doLike(<%= p.getPid() %>,<%= uu.getId() %>)" class="btn btn-outline-light btn-sm"><span class="like-counter"><%= ld.countLikeOnPost(p.getPid()) %></span></a>
                <a href="#" class="btn btn-outline-light btn-sm"><span>20</span></a>-->
                <a href="show_blog_page.jsp?post_id=<%= p.getPid() %>" class="btn btn-outline-light btn-sm">Read more...</a>
            </div>    
    </div>
    
    
</div>
    
<%
        
    }



%>
</div>