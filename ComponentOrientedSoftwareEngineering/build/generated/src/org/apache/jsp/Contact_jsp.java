package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact Page</title>\n");
      out.write("        \n");
      out.write("    <body  style=\"  background-color: #FFEE00\"/>\n");
      out.write("        </div\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1> \n");
      out.write("            Contact us for more details \n");
      out.write("            <br>\n");
      out.write("            Hof Cakes,\n");
      out.write("            <br>\n");
      out.write("            Enoch Widman Strasse,\n");
      out.write("            <br>\n");
      out.write("            HOF-95028\n");
      out.write("            <br>\n");
      out.write("            Bavaria,\n");
      out.write("            <br>\n");
      out.write("            Germany.\n");
      out.write("            <br>\n");
      out.write("            Email:hofcakes@gmail.com\n");
      out.write("            <br>\n");
      out.write("            Phone Number:004915218700562\n");
      out.write("            <br>\n");
      out.write("        </h1>\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <img src=\"image/birthday-cake.gif\" alt=\"\"/>\n");
      out.write("   \n");
      out.write("    <img src=\"image/birthdayc.jpg\" alt=\"\"/>\n");
      out.write("   \n");
      out.write("    <img src=\"image/dry-fruit-cake.jpg\" alt=\"\"/>\n");
      out.write("    \n");
      out.write("    <img src=\"image/images (1).jpg\" alt=\"\"/>\n");
      out.write("    \n");
      out.write("    <img src=\"image/images (2).jpg\" alt=\"\"/>\n");
      out.write("    \n");
      out.write("    <img src=\"image/images.jpg\" alt=\"\"/>\n");
      out.write("   \n");
      out.write("    <img src=\"image/download.jpg\" alt=\"\"/>\n");
      out.write("   \n");
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
