package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>About Us</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: blueviolet\">\n");
      out.write("        <h1>Hof Cakes</h1>\n");
      out.write("    <tr>\n");
      out.write("        <td align=\"center\"style=\"font: bold\">\n");
      out.write("            We are Leading Online shopping in Hof with the Largest<br /> \n");
      out.write("            Delivery Network.<br /><br />\n");
      out.write("\n");
      out.write("            You may send  Cakes more<br /> \n");
      out.write("            Gifts to Hof at over 8 Locations surrounding HOf.<br /><br />\n");
      out.write("\n");
      out.write("            Cakes  to Hof can be sent with<br /> \n");
      out.write("            Express Delivery facility and also other surrounding places.<br /><br />\n");
      out.write("\n");
      out.write("            We also deliver Birthday Gifts, Anniversary Gifts, Wedding<br /> \n");
      out.write("            Gifts to Hof & other surrounding places on your desired date of delivery.<br /><br />\n");
      out.write("\n");
      out.write("            Sending Flowers & Gifts to Hof & other surrounding places was never so simple.<br />\n");
      out.write("            Moreover, we guarantee delivery of orders.<br /><br />\n");
      out.write("\n");
      out.write("            Enjoy the difference !   Send Flowers & Gifts to Hof & other <br />\n");
      out.write("            surrounding places today.\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
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
