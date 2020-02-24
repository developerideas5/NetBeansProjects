package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BirthdayCake_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta content=\"text/html; charset=windows-1252\" http-equiv=\"content-type\">\n");
      out.write("    <title>BirthdayCake</title>\n");
      out.write("  </head>\n");
      out.write("  <body style=\"  background-color: #FFFF00\">\n");
      out.write("  <left>\n");
      out.write("         <img src=\"");
      out.print(request.getContextPath());
      out.write("/image/birthdayc.jpg\"> <br>\n");
      out.write("  </left>\n");
      out.write("  <right>\n");
      out.write("    <h1 style=\"color: rgb(0, 0, 0); font-family: 'Times New Roman'; font-style: normal; font-variant: normal; letter-spacing: normal; line-height: normal; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px;\"><span\n");
      out.write("        style=\"font-weight: bold; font-style: italic;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        </span></h1>\n");
      out.write("    <h1 style=\"color: rgb(0, 0, 0); font-family: 'Times New Roman'; font-style: normal; font-variant: normal; letter-spacing: normal; line-height: normal; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px;\">\n");
      out.write("      <p class=\"MsoNormal\"><b style=\"mso-bidi-font-weight:normal\"><i style=\"mso-bidi-font-style:\n");
      out.write("normal\">Birthday Cake<br>\n");
      out.write("          </i></b></p>\n");
      out.write("      \n");
      out.write("      <p class=\"MsoNormal\"><b style=\"mso-bidi-font-weight:normal\"><i style=\"mso-bidi-font-style:\n");
      out.write("normal\">Combination of different fruits and flavors<br>\n");
      out.write("          </i></b></p>\n");
      out.write("      <p class=\"MsoNormal\"><b style=\"mso-bidi-font-weight:normal\"><i style=\"mso-bidi-font-style:\n");
      out.write("normal\">Fat: 6%</i></b></p>\n");
      out.write("      <p class=\"MsoNormal\"><b style=\"mso-bidi-font-weight:normal\"><i style=\"mso-bidi-font-style:\n");
      out.write("normal\">Energy: 377kcal per KG <br>\n");
      out.write("          </i></b></p>\n");
      out.write("    </h1>\n");
      out.write("  </right>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <div style=\"clear:both;\"></div>\n");
      out.write("            <div class=\"add-to-cart\">\n");
      out.write("\t\n");
      out.write("        <button type=\"button\" title=\"Add to Cart\" class=\"btn_order_cart btn-cart\" onclick=\"productAddToCartForm.submit(this)\"><span><span>Add to Cart</span></span></button>\n");
      out.write("            </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
