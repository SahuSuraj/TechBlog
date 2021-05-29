package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.helper.ConnectionProvider;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/normal_navbar.jsp");
  }

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
      			null, true, 8192, true);
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tech Blog</title>\n");
      out.write("        \n");
      out.write("<!--css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("/*            .banner-background{\n");
      out.write("          clip-path: polygon(30% 0%, 70% 0%, 100% 0, 99% 73%, 69% 88%, 33% 74%, 0 86%, 0 0);\n");
      out.write("            }*/\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("<!--navbar-->\n");
      out.write("    ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark primary-background\">\n");
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
      out.write("       <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"login_page.jsp\"><span class=\"fa fa-user-circle\"></span>Login</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"register_page.jsp\"><span class=\"fa fa-user-plus\"></span>Sign up</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("<!--BANNER-->\n");
      out.write("<div class=\"container-fluid p-0 m-0\">\n");
      out.write("    \n");
      out.write("    <div class=\"jumbotron primary-background text-white\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <h3 class=\"display-3\">Welcome to Tech Blog</h3>\n");
      out.write("        <p>A programming language is a formal language, which comprises a set of instructions that produce various kinds of output. Programming languages are used in computer programming to implement algorithms</p>\n");
      out.write("        <p>Thousands of different programming languages have been created, and more are being created every year. Many programming languages are written in an imperative form (i.e., as a sequence of operations to perform) while other languages use the declarative form (i.e. the desired result is specified, not how to achieve it). </p>\n");
      out.write("        \n");
      out.write("        <button class=\"btn btn-outline-light btn-lg\"><span class=\"fa fa-external-link\"></span>Start!Its Free</button>\n");
      out.write("        <a href=\"login_page.jsp\" class=\"btn btn-outline-light btn-lg\"><span class=\"fa fa-user-circle fa-spin\"></span>Login</a>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--//cards-->\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("         <div class=\"col-md-4\">\n");
      out.write("           <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                     <h5 class=\"card-title\">Java Programming Language</h5>\n");
      out.write("                     <p class=\"card-text\">Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible. It is intended to let application developers write once, run anywhere (WORA),[</p>\n");
      out.write("                     <a href=\"#\" class=\"btn primary-background text-white\">Read more..</a>\n");
      out.write("                </div>\n");
      out.write("          </div> \n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("           <div class=\"col-md-4\">\n");
      out.write("           <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                     <h5 class=\"card-title\">Python Programming Language</h5>\n");
      out.write("                     <p class=\"card-text\">Python is an interpreted, high-level, general-purpose programming language. Created by Guido van Rossum and first released in 1991, Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.</p>\n");
      out.write("                     <a href=\"#\" class=\"btn primary-background text-white\">Read more..</a>\n");
      out.write("                </div>\n");
      out.write("          </div> \n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("           <div class=\"col-md-4\">\n");
      out.write("           <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                     <h5 class=\"card-title\">Data Structure</h5>\n");
      out.write("                     <p class=\"card-text\">In computer science, a data structure is a data organization, management, and storage format that enables efficient access and modification. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data.</p>\n");
      out.write("                     <a href=\"#\" class=\"btn primary-background text-white\">Read more..</a>\n");
      out.write("                </div>\n");
      out.write("          </div> \n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("   </div>\n");
      out.write("    \n");
      out.write("     <div class=\"row\">\n");
      out.write("         <div class=\"col-md-4\">\n");
      out.write("           <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                     <h5 class=\"card-title\">C++ Programming Language </h5>\n");
      out.write("                     <p class=\"card-text\">C++ was designed with a bias toward system programming and embedded, resource-constrained software and large systems, with performance, efficiency, and flexibility of use as its design highlights.</p>\n");
      out.write("                     <a href=\"#\" class=\"btn primary-background text-white\">Read more..</a>\n");
      out.write("                </div>\n");
      out.write("          </div> \n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("           <div class=\"col-md-4\">\n");
      out.write("           <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                     <h5 class=\"card-title\">C Programming Language</h5>\n");
      out.write("                     <p class=\"card-text\">A successor to the programming language B, C was originally developed at Bell Labs by Dennis Ritchie between 1972 and 1973 to construct utilities running on Unix. It was applied to re-implementing the kernel of the Unix operating system.[</p>\n");
      out.write("                     <a href=\"#\" class=\"btn primary-background text-white\">Read more..</a>\n");
      out.write("                </div>\n");
      out.write("          </div> \n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("           <div class=\"col-md-4\">\n");
      out.write("           <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                     <h5 class=\"card-title\">Bootstrap (front-end framework)</h5>\n");
      out.write("                     <p class=\"card-text\">Bootstrap is a free and open-source CSS framework directed at responsive, mobile-first front-end web development. It contains CSS- and (optionally) JavaScript-based design templates for typography, forms, buttons, navigation, and other interface components.</p>\n");
      out.write("                     <a href=\"#\" class=\"btn primary-background text-white\">Read more..</a>\n");
      out.write("                </div>\n");
      out.write("          </div> \n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("   </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--     JavaScript   -->\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.0.min.js\" integrity=\"sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
