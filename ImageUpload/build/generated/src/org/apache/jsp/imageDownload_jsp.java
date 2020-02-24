package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class imageDownload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write(" \n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("\n");
      out.write(" <HEAD>\n");
      out.write("\n");
      out.write("  <TITLE>Download Images</TITLE>\n");
      out.write("\n");
      out.write("  </HEAD>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <BODY>\n");
      out.write("\n");
      out.write(" <br><br>\n");
      out.write("\n");
      out.write("  <table align=\"center\" border=0 width=\"200px\">\n");
      out.write("\n");
      out.write(" <tr>\n");
      out.write("\n");
      out.write("  <td colspan=2 align=\"center\"><b>Download Images</b></td>\n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr><td colspan=2> </td></tr>\n");
      out.write("\n");
      out.write("  ");




  
  Connection con=null;

  try{  

  Class.forName("org.hsqldb.jdbcDriver").newInstance();

  con=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/jfai3", "SA", "");

  Statement stmt=con.createStatement();

  String strQuery ="SELECT * FROM PUBLIC.IMAGES";

  ResultSet rs = stmt.executeQuery(strQuery);

  int sno=0;

  while(rs.next())

  {

  sno++;

  
      out.write("\n");
      out.write("\n");
      out.write("  <tr style=\"background-color:#efefef;\">\n");
      out.write("\n");
      out.write("  <td><b>");
      out.print(sno);
      out.write("</b></td>\n");
      out.write("\n");
      out.write("  <td align=\"center\">\n");
      out.write("\n");
      out.write("<a href=\"image.jsp?imgid=");
      out.print(rs.getInt(1));
      out.write("\">\n");
      out.write("\n");
      out.write("<img src=\"image.jsp?imgid=");
      out.print(rs.getInt(1));
      out.write("\" width=\"50\" height=\"50\">\n");
      out.write("\n");
      out.write("</a></td>\n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  ");


  }

  rs.close();

  con.close();

  stmt.close();

  }

  catch(Exception e)

  {

  e.getMessage();

  }

  
      out.write("\n");
      out.write("\n");
      out.write(" </table>\n");
      out.write("\n");
      out.write("  </BODY>\n");
      out.write("\n");
      out.write("</HTML>");
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
