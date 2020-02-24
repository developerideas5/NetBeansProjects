package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FruitCake_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>FruitCake</title>\n");
      out.write("  </head>\n");
      out.write("  <body style=\"  background-color: #00FF00\">\n");
      out.write("  <center><img src=\"");
      out.print(request.getContextPath());
      out.write("/image/fruitcake.jpg\"> </center>\n");
      out.write("   <text><h1>Birthday Cake<h1>Fat: 6%<br>\n");
      out.write("    \"This cake was sent home from our children's school. It is the simplest, great tasting cake I've ever made. Great to make with the kids, especially for cupcakes.\"<br>\n");
      out.write("    <h2>Ingredients<h2>\n");
      out.write("    1 cup white sugar\n");
      out.write("    1/2 cup butter\n");
      out.write("    2 eggs\n");
      out.write("    2 teaspoons vanilla extract\n");
      out.write("    1 1/2 cups all-purpose flour\n");
      out.write("    1 3/4 teaspoons baking powder\n");
      out.write("    1/2 cup milk\n");
      out.write("   </text>\n");
      out.write("  \n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <div style=\"clear:both;\"></div>\n");
      out.write("            <div class=\"add-to-cart\">\n");
      out.write("\t\n");
      out.write("        <button type=\"button\" title=\"Add to Cart\" class=\"btn_order_cart btn-cart\" onclick=\"productAddToCartForm.submit(this)\"><span><span>Add to Cart</span></span></button>\n");
      out.write("            </div>\n");
      out.write("  </body>\n");
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
