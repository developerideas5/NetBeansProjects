package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class DetailPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta content=\"text/html; charset=windows-1252\" http-equiv=\"content-type\">\n");
      out.write("        <title>Shopping Bag</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
                ResultSet rs = stmt.executeQuery("SELECT * FROM PUBLIC.CATEGORY WHERE CATEGORY_ID=" + request.getParameter("id"));
                if (!rs.next()) {
                    throw new SQLException("SELECT COUNT(*): no result");
                }
                do {
        
      out.write("\n");
      out.write("    <center><img src=\"");
      out.print(request.getContextPath() + "/image/" + rs.getString(3));
      out.write("\" /> </center>\n");
      out.write("    <text><h1>");
      out.print( rs.getString(2));
      out.write("</h1>\n");
      out.write("     <h3> ");
      out.print( rs.getString(6));
      out.write("</h3>\n");
      out.write("    </text>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <div style=\"clear:both;\"></div>\n");
      out.write("\n");
      out.write("    <form name=\"add_to_cart\" method=\"post\" action=\"AddToCart.jsp\">\n");
      out.write("        <div class=\"add-to-cart\">\n");
      out.write("            <input type=\"hidden\" name=\"CATEGORY_ID\" value=\"");
      out.print( rs.getInt(1) );
      out.write("\">\n");
      out.write("            <hr/>\n");
      out.write("            Quantity <input type=\"text\" name=\"QUANTITY\" value=\"1\">\n");
      out.write("            <button type=\"submit\" class=\"\">Add to cart</button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");

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
