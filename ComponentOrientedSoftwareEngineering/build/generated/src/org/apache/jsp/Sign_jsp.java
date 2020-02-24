package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Sign_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("     <div class=\"Header\" >\n");
      out.write("            <center><h1>Hof Cakes</h1><center>\n");
      out.write("                    <hr width=60%>\n");
      out.write("                    <body\n");
      out.write("         style=\"  background-color: #FFE000\"/>\n");
      out.write("        </div>\n");
      out.write("<form>\n");
      out.write("    <center>\n");
      out.write("        <table><legend>Personal Details</legend>\n");
      out.write("        <tr><td>User Name</td><td><input type=\"text\" name=\"username\"></td></tr>\n");
      out.write("        <tr><td>Password</td><td><input type=\"password\" name=\"password\"></td></tr>\n");
      out.write("        <tr><td>Name</td><td><input type=\"text\" name=\"name\"></td></tr>\n");
      out.write("        <tr><td>Contact</td><td><input type=\"text\" name=\"contact\"></td></tr>\n");
      out.write("        <tr><td><input type=\"submit\" value=\"Register\"></td></tr>\n");
      out.write("        </table> \n");
      out.write("    </center>\n");
      out.write("</form>\n");
      out.write("    ");

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String name=request.getParameter("name");       
        String contact=request.getParameter("contact");
        
 Connection con = null;
    Statement stmt = null;

  
    try {

        // 1. load database driver
        Class.forName("org.hsqldb.jdbcDriver");

        // 2. connect to the database
        con = DriverManager.getConnection(
            "jdbc:hsqldb:hsql://localhost/jfai3", "SA", ""
        );
     
        String query= "INSERT INTO PUBLIC.CUSTOMERS(username,password,name,contact)VALUES(?,?,?,?)";
        PreparedStatement ps= con.prepareStatement(query);
        
			System.out.println("1 "+username);
                        System.out.println("2 "+password);
			System.out.println("3 "+name);
			System.out.println("4 "+contact);
    
        ps.setString(1,username);
        ps.setString(2,password);
        ps.setString(3,name);
        ps.setString(4,contact);
        System.out.println("1111111111111");
        int i = ps.executeUpdate();
        ps.close();
        } catch (Exception ex)
        {
             out.println(ex);
         } finally 
        {
          try {
                con.close();
               } catch (SQLException ex) 
               {
                 out.println(ex);
               }
        }



      out.write("\n");
      out.write("</body>\n");
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
