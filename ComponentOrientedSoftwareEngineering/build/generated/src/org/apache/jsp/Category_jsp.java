package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <form method=\"get\">\n");
      out.write("Select cakes:\n");
      out.write("<select required=\"required\" name=\"cake\">\n");
      out.write("    <option>Select</option>\n");
      out.write("<option value=\"1\">Fruitcake with nuts</option>\n");
      out.write("<option value=\"2\">Dry fruit cake</option>\n");
      out.write("<option value=\"3\">Almond Cake</option>\n");
      out.write("<option value=\"4\">Kiwi</option>\n");
      out.write("<option value=\"5\">Apple</option>\n");
      out.write("</select><br>\n");
      out.write("<input type=\"submit\" value=\"Submit\"><br>\n");
      out.write("</form>\n");
      out.write("\n");

    String selectedValue=request.getParameter("cake");
    System.out.println("Selected Value is: "+selectedValue);
   
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
        ResultSet rs = stmt.executeQuery("SELECT * FROM PUBLIC.CATEGORY WHERE CATEGORY_ID='" + selectedValue + "'");
        if (!rs.next()) {
            throw new SQLException("SELECT COUNT(*): no result");
        }
        do{
      out.write("\n");
      out.write("        \n");
      out.write("       <img src=\"");
      out.print(request.getContextPath());
      out.write("/image/");
      out.print(rs.getString(3));
      out.write("\" />\n");
      out.write("      \n");
      out.write("        ");
 
                                        out.println("<html>");
					out.println("<body>");
					out.println("<table>");
					out.println("<tbody>");
                                        
					out.println("<tr> <td>"+"<b> Cake Name: </b>"+rs.getString(2) +"</td> </tr>");
                                      	out.println("<tr> <td>"+"<b> Price Per Kg: </b>"+rs.getInt(4)+"</td> </tr>");
					out.println("<tr> <td>"+"<b> Availability: </b>"+rs.getInt(5)+"</td> </tr>");
                                        
  
      out.write("\n");
      out.write("  \n");
      out.write("  <form action=\"AddToCart.jsp\" method=\"post\"> \n");
      out.write("  <input type=\"hidden\" name=\"id\" value=\"");
      out.print(rs.getInt(1));
      out.write("\" /> \n");
      out.write("  <input type='submit' value='Add to cart' /></form>\n");
      out.write("                             ");
           
                                        out.println("</tbody>");
					out.println("</table>");
					out.println("<hr />");
					out.println("</body>");
					out.println("</html>");

                                    //   out.println(" " + rs.getString(1));
    
        }while(rs.next());
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
      out.write("   </body>\n");
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
