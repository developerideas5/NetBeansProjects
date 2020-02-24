package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class DisplayPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con = null;
    Statement stmt = null;
    int Counter = 0;
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Home page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background-color: #FF8000\">\n");
      out.write("        <h1> <span style=\"font-weight: bold;\"></span><span style=\"font-family: monospace;\"></span><span style=\"font-weight: bold; font-style: italic;\"></span></h1>\n");
      out.write("        <h1><span style=\"font-weight: bold; font-style: italic;\">&nbsp; </span><b style=\"mso-bidi-font-weight:normal\"><i style=\"mso-bidi-font-style:\n");
      out.write("                    normal\"><span style=\"font-size:72.0pt;line-height:115%;font-family:Algerian;\n");
      out.write("                        color:#FFF000\">HOF CAKES&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></i></b> ☏\n");
      out.write("            9999900000&nbsp; <span style=\"color: white;\">24x7 Call us</span>\n");
      out.write("        </h1>\n");
      out.write("\n");
      out.write("        <span style=\"text-decoration: underline; font-weight: bold; font-style: italic; color: white;\">Hof\n");
      out.write("            Cakes,Enoch Widman Strasse,20 A,Hof,Bavaria,Germany,95028.email id:\n");
      out.write("            hofcakes@live.de </span><span style=\"font-weight: bold; font-style: italic;\"></span><span\n");
      out.write(" style=\"color: white;\">&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <span style=\"color: rgb(68, 68, 68); font-family: Georgia, 'Times New Roman', Times, serif; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 30px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;\"></span>\n");
      out.write("            <p class=\"MsoNormal\"><span style=\"font-weight: bold; font-style: italic;\"></span>\n");
      out.write("                <span style=\"font-weight: bold; font-style: italic;\">\n");
      out.write("\n");
      out.write("                </span>\n");
      out.write("            <p class=\"MsoNormal\"><span style=\"font-size:20.0pt;line-height:115%;font-family:\n");
      out.write("                                       Algerian;color:white;mso-themecolor:background1\">Welcome to the Hof Cakes Enjoy\n");
      out.write("                    the Taste </span></p>\n");
      out.write("            <marquee behavior=\"scroll\" direction=\"left\">Yummy Yummy Tasty Delicious Cakes are waiting for you hurry up ...!!!!!! Follow us in the twitter </marquee>\n");
      out.write("\n");
      out.write("            <table style=\"width: 100%\" border=\"1\">\n");
      out.write("\n");
      out.write("                ");

                    
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
                        ResultSet rs = stmt.executeQuery("SELECT * FROM PUBLIC.CATEGORY");
                        if (!rs.next()) {
                            throw new SQLException("SELECT COUNT(*): no result");
                        }
                        do {
                            if (Counter == 0 || Counter % 3 == 0) {
                                out.println("<tr>");
                            }
                            Counter++;
                
      out.write("\n");
      out.write("\n");
      out.write("                <td style=\"height: 80px; background-color: #FFFF00;\"><span style=\"font-weight: bold;\">");
      out.print( rs.getString(2) );
      out.write("<br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath() +"/image/" + rs.getString(3) );
      out.write("\"> <br>\n");
      out.write("\n");
      out.write("                        <blink>For More Details </blink> <a href=\"DetailPage.jsp?id=");
      out.print( rs.getInt(1) );
      out.write("\">Click here!</a> <br></span><br>\n");
      out.write("                    <br>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                ");
 if (Counter == 0 || Counter % 3 == 0) {
                                out.println("</tr>");
                            }

                        } while (rs.next());
                        // 6. close the statement object
                        stmt.close();

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
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
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
