package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class LoginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con = null;
    Statement stmt = null;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body\n");
      out.write("         style=\"  background-color: #FF8000\"/>\n");
      out.write("        <div class=\"Header\" >\n");
      out.write("            <center><h1>Hof Cakes</h1><center>\n");
      out.write("                    <hr width=60%>\n");
      out.write("        </div>\n");
      out.write("        <center><img src=\"");
      out.print(request.getContextPath());
      out.write("/image/images.jpg\"> </center>\n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("            <center>\n");
      out.write("                <table><legend>Login Details</legend>\n");
      out.write("                    <tr><td>User Name</td><td><input type=\"text\" name=\"loginusername\"></td></tr>\n");
      out.write("                    <tr><td>Password</td><td><input type=\"password\" name=\"loginpassword\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"submit\" value=\"Register\"></td></tr>\n");
      out.write("                </table> \n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");
  String login_username = request.getParameter("loginusername");
            String login_password = request.getParameter("loginpassword");
            
            if (login_username != null && login_password != null) {
                
                try {

                    // 1. load database driver
                    Class.forName("org.hsqldb.jdbcDriver");

                    // 2. connect to the database
                    con = DriverManager.getConnection(
                            "jdbc:hsqldb:hsql://localhost/jfai3", "SA", ""
                    );

                    // 3. create statement object
                    stmt = con.createStatement();

                    // 4. execute SQL query
                    ResultSet rs = stmt.executeQuery("SELECT * FROM PUBLIC.CUSTOMER WHERE USERNAME='" + login_username + "' AND PASSWORD='" + login_password + "'");
                  

                    if (!rs.next()) 
                    {
                        out.println("Error Login");
                        
                    } else {
                        
                        session.setAttribute("LOGIN_ID", rs.getInt(1));
                        //String redirectURL = "http://localhost:8080/ComponentOrientedSoftwareEngineering/DisplayPage.jsp";
                        response.sendRedirect("DisplayPage.jsp");
                       // out.println("Login Success");
                        stmt.close();
                    }
                } catch (Exception ex) {
                    out.println(ex);
                } finally {
                    try {
                        // 7. close the database connection
                        con.close();
                    } catch (SQLException ex) {
                        out.println(ex);
                    }
                }
            }
        

        
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
