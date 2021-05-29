package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.tech.blog.entities.Category;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.dao.PostDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


User user=(User)session.getAttribute("currentUser");
if(user==null){
    response.sendRedirect("login_page.jsp");
}


      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile Page</title>\n");
      out.write("<!--      !--css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background:url(img/backgroung_img.jpg);\n");
      out.write("                background-size:cover;\n");
      out.write("                background-attachment:fixed;\n");
      out.write("            }\n");
      out.write("        </style>   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<!--       navbar start-->\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark primary-background\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-laptop\"></span> Tech Blog</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" \n");
      out.write("          data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("          aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-archive\"></span>Learn With <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\n");
      out.write("           data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <span class=\"fa fa-caret-square-o-down\"></span>Cateories\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Programming</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Project Implementation</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Data Structure</a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-address-book-o\"></span>Contact</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\" data-toggle=\"modal\" data-target=\"#add-post-modal\"><span class=\"fa fa-plus-circle fa-spin\"></span>Create Post</a>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("      <ul class=\"narbar-nav mr-right\">\n");
      out.write("          <li class=\"nav-item text-white\">\n");
      out.write("             <a class=\"nav-link text-white\" href=\"#!\" data-toggle=\"modal\" data-target=\"#profile-modal\"><span class=\"fa fa-user-circle text-white\"></span>");
      out.print( user.getName() );
      out.write("</a> \n");
      out.write("      </li>\n");
      out.write("          <li class=\"nav-item text-white\">\n");
      out.write("             <a class=\"nav-link text-white\" href=\"LogoutServlet\"><span class=\"fa fa-user-plus text-white\"></span>Log out</a>\n");
      out.write("      </li>\n");
      out.write("      </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<!--        end nav bar-->\n");
      out.write("                    <!--update msg-->\n");
      out.write("                            ");

                              Message m = (Message) session.getAttribute("msg");
                              if(m!=null){
                                  
      out.write("\n");
      out.write("                                  <div class=\"alert ");
      out.print( m.getCssclass() );
      out.write("\" role=\"alert\">\n");
      out.write("                                    ");
      out.print(m.getContent() );
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                                  \n");
      out.write("                                  ");

                                  session.removeAttribute("msg");
                                    }
                                
      out.write("\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("   <!--main body of the page-->\n");
      out.write("   <main>\n");
      out.write("       <div class=\"container\">\n");
      out.write("           <div class=\"row mt-4\">\n");
      out.write("               <!--first col-->\n");
      out.write("               <div class=\"col-md-4\">\n");
      out.write("                   <!--categories-->\n");
      out.write("                   <div class=\"list-group\">\n");
      out.write("                       <a href=\"#\" onclick=\"getPosts(0,this)\" class=\" c-link list-group-item list-group-item-action active\">\n");
      out.write("                         All Posts\n");
      out.write("                         </a>\n");
      out.write("  \n");
      out.write("                       \n");
      out.write("                            ");

                              PostDao d = new PostDao(ConnectionProvider.getConnection());
                              ArrayList<Category> list1=d.getAllCategories();
                              for(Category cc:list1)
                              {
                                
                               
      out.write("\n");
      out.write("                               <a href=\"#\"onclick=\"getPosts(");
      out.print( cc.getCid() );
      out.write(",this)\" class=\"c-link list-group-item list-group-item-action disabled\">");
      out.print( cc.getName());
      out.write("</a>\n");
      out.write("                              ");

                              }
                             
      out.write("\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("               <!--second col-->\n");
      out.write("               <div class=\"col-md-8\" >\n");
      out.write("                   <!--posts-->\n");
      out.write("                   <div class=\"container text-center\" id=\"loader\">\n");
      out.write("                       <i class=\"fa fa-refresh fa-4x fa-spin\"></i>\n");
      out.write("                       <h3 class=\"mt-3\">Loading...</h3>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"container-fluid\" id=\"post-container\">\n");
      out.write("                       \n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("       </div>\n");
      out.write("   </main>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   <!--end main body of the page-->\n");
      out.write("                                \n");
      out.write("\n");
      out.write("<!--Start profile model-->\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header primary-background text-white\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">TechBlog</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <div class=\"container text-center\">\n");
      out.write("              <img src=\"pics/");
      out.print( user.getProfile() );
      out.write("\" class=\"img-fluid\" style=\"border-radius:40%;max-width:150px;\"><br>\n");
      out.write("              <h5 class=\"modal-title\" id=\"exampleModalLabel\">");
      out.print(user.getName() );
      out.write("</h5>\n");
      out.write("              \n");
      out.write("              <!--details-->\n");
      out.write("              <div id=\"profile-detail\">\n");
      out.write("              <table class=\"table\">\n");
      out.write("           \n");
      out.write("             <tbody>\n");
      out.write("                <tr>\n");
      out.write("                  <th scope=\"row\">ID</th>\n");
      out.write("                  <td>");
      out.print( user.getId());
      out.write("</td>\n");
      out.write("                  \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <th scope=\"row\">Email</th>\n");
      out.write("                  <td>");
      out.print( user.getEmail());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <th scope=\"row\">Gender</th>\n");
      out.write("                  <td>");
      out.print( user.getGender());
      out.write("</td>\n");
      out.write("                 \n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                  <th scope=\"row\">About</th>\n");
      out.write("                  <td>");
      out.print( user.getAbout());
      out.write("</td>\n");
      out.write("                 \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <th scope=\"row\">Registered on</th>\n");
      out.write("                  <td>");
      out.print( user.getDateTime().toString() );
      out.write("</td>\n");
      out.write("                 \n");
      out.write("                </tr>\n");
      out.write("              </tbody>\n");
      out.write("             </table>\n");
      out.write("              </div>\n");
      out.write("                  \n");
      out.write("                  <!--profile edit-->\n");
      out.write("                  <div id=\"profile-edit\" style=\"display:none;\">\n");
      out.write("                      <h3 class=\"mt-2\">Please Edit Carefully</h3>\n");
      out.write("                      <form action=\"EditServlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                          <table class=\"table\">\n");
      out.write("                              <tr>\n");
      out.write("                                  <td>ID</td>\n");
      out.write("                                  <td>");
      out.print( user.getId());
      out.write("</td>\n");
      out.write("                              </tr>\n");
      out.write("                              \n");
      out.write("                               <tr>\n");
      out.write("                                  <td>Gender</td>\n");
      out.write("                                  <td>");
      out.print( user.getGender().toUpperCase() );
      out.write("</td>\n");
      out.write("                              </tr>\n");
      out.write("                              \n");
      out.write("                               <tr>\n");
      out.write("                                  <td>Email</td>\n");
      out.write("                                  <td><input type=\"email\" class=\"form-control\" name=\"user_email\" value=\"");
      out.print( user.getEmail());
      out.write("\"></td>\n");
      out.write("                              </tr>\n");
      out.write("                              \n");
      out.write("                              <tr>\n");
      out.write("                                  <td>Name</td>\n");
      out.write("                                  <td><input type=\"text\" class=\"form-control\" name=\"user_name\" value=\"");
      out.print( user.getName());
      out.write("\"></td>\n");
      out.write("                              </tr>\n");
      out.write("                              \n");
      out.write("                              <tr>\n");
      out.write("                                  <td>Password</td>\n");
      out.write("                                  <td><input type=\"password\" class=\"form-control\" name=\"user_password\" value=\"");
      out.print( user.getPassword());
      out.write("\"></td>\n");
      out.write("                              </tr>\n");
      out.write("                              \n");
      out.write("                              <tr>\n");
      out.write("                                  <td>About</td>\n");
      out.write("                                  <td>\n");
      out.write("                                      <textarea roes=\"5\" class=\"form-control\" name=\"user_about\">");
      out.print( user.getAbout());
      out.write("\n");
      out.write("                                      </textarea>\n");
      out.write("                                  </td>\n");
      out.write("                              </tr>\n");
      out.write("                              \n");
      out.write("                              <tr>\n");
      out.write("                                  <td>Profile</td>\n");
      out.write("                                  <td>\n");
      out.write("                                      <input type=\"file\" name=\"image\" class=\"form-control\"/>\n");
      out.write("                                  </td>\n");
      out.write("                              </tr>\n");
      out.write("                             \n");
      out.write("                          </table>\n");
      out.write("                                      <div class=\"container\">\n");
      out.write("                                          <button type=\"submit\" class=\"btn btn-outline-primary\">Save</button>\n");
      out.write("                                      </div>\n");
      out.write("                          \n");
      out.write("                      </form>\n");
      out.write("                  </div>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button id=\"edit-profile-btn\" type=\"button\" class=\"btn btn-primary\">Edit</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--End of profile model-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Add post model-->\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"add-post-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header primary-background text-white\">\n");
      out.write("        <h5 class=\"modal-title text-center\" id=\"exampleModalLabel\">Create Your Post</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        \n");
      out.write("          <form id=\"add-post-form\" action=\"AddPostServlet\" method=\"POST\">\n");
      out.write("              \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                   <select class=\"form-control\" name=\"cid\">\n");
      out.write("                  <option selected disabled>---SELECT CATEGORY---</option> \n");
      out.write("                  ");

                  PostDao postd=new PostDao(ConnectionProvider.getConnection());
                  ArrayList<Category> list=postd.getAllCategories();
                  for(Category c:list)
                  {
                  
      out.write("\n");
      out.write("                  <option value=\"");
      out.print( c.getCid() );
      out.write('"');
      out.write('>');
      out.print( c.getName() );
      out.write("</option>\n");
      out.write("                  \n");
      out.write("                  ");

                  }    
                  
      out.write("\n");
      out.write("              </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <input type=\"text\" name=\"pTitle\" placeholder=\"Enter Your Title\"class=\"form-control\"/>\n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <textarea type=\"text\" name=\"pContent\" placeholder=\"Enter Your Content\"class=\"form-control\"></textarea>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <textarea type=\"text\" name=\"pCode\" placeholder=\"Enter Your Code(If Any)\"class=\"form-control\"></textarea>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label>Select Your Photo</label><br>\n");
      out.write("                  <input type=\"file\" name=\"pic\" class=\"form-control\"/>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"container text-center\">\n");
      out.write("                  \n");
      out.write("                  <button type=\"submit\" class=\"btn btn-outline-primary\">POST</button>\n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("          </form>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!--End Add Post model-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--     JavaScript   -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.0.min.js\" integrity=\"sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                let editStatus = false;\n");
      out.write("                \n");
      out.write("                $('#edit-profile-btn').click(function(){\n");
      out.write("                  if(editStatus==false){\n");
      out.write("                    $('#profile-detail').hide()\n");
      out.write("                    \n");
      out.write("                    $('#profile-edit').show();\n");
      out.write("                    editStatus = true;\n");
      out.write("                    $(this).text(\"Back\")\n");
      out.write("                  }else{\n");
      out.write("                      $('#profile-detail').show()\n");
      out.write("                    \n");
      out.write("                    $('#profile-edit').hide();\n");
      out.write("                    editStatus = false;\n");
      out.write("                    $(this).text(\"Edit\")\n");
      out.write("                  }\n");
      out.write("                    \n");
      out.write("                })\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <!--now add post javascript-->\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(e){\n");
      out.write("                $(\"#add-post-form\").on(\"submit\",function(event){\n");
      out.write("                  event.preventDefault();\n");
      out.write("                  console.log(\"You have clicked on submit\")\n");
      out.write("                  \n");
      out.write("                 let form= new FormData(this);\n");
      out.write("                 $.ajax({\n");
      out.write("                     url: \"AddPostServlet\",\n");
      out.write("                     type: 'POST',\n");
      out.write("                     data: form,\n");
      out.write("                     success: function (data, textStatus, jqXHR){\n");
      out.write("                         console.log(data);\n");
      out.write("                         if(data.trim() == 'done')\n");
      out.write("                         { \n");
      out.write("                           swal(\"Good job!\", \"Your Blog Post Successfully\", \"success\");\n");
      out.write("                         } \n");
      out.write("                         else\n");
      out.write("                         {\n");
      out.write("                           swal(\"Error!\", \"Please Select All Fields!\", \"error\");\n");
      out.write("                         }\n");
      out.write("                     },\n");
      out.write("                     error:function (jqXHR, textStatus, errorThrown)\n");
      out.write("                     {\n");
      out.write("                          swal(\"Error!\", \"Please Select All Fields!\", \"error\");\n");
      out.write("                     },\n");
      out.write("                     processData:false,\n");
      out.write("                     contentType:false\n");
      out.write("                 })\n");
      out.write("                })\n");
      out.write("            })\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <!--loading post using ajax-->\n");
      out.write("        <script>\n");
      out.write("            function getPosts(catId,temp){\n");
      out.write("                $(\"#loader\").show();\n");
      out.write("                $(\"#post-container\").hide();\n");
      out.write("                $(\".c-link\").removeClass('active')\n");
      out.write("                \n");
      out.write("                 $.ajax({\n");
      out.write("                   url: \"load_posts.jsp\",\n");
      out.write("                   data:{cid:catId},\n");
      out.write("                   success:function(data, textStatus, jqXHR){\n");
      out.write("                   console.log(data);\n");
      out.write("                   $(\"#loader\").hide();\n");
      out.write("                   $(\"#post-container\").show();\n");
      out.write("                   $('#post-container').html(data)\n");
      out.write("                   $(temp).addClass('active')\n");
      out.write("                }\n");
      out.write("               })\n");
      out.write("            }\n");
      out.write("            $(document).ready(function(e){\n");
      out.write("                \n");
      out.write("                let allPostRef = $('.c-link')[0]\n");
      out.write("                getPosts(0, allPostRef)\n");
      out.write("            })\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>                 \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
