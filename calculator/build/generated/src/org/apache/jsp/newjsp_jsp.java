package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"Gray\">  \n");
      out.write("   <center>\n");
      out.write("        <h1>Calculator</h1>\n");
      out.write("   \n");
      out.write("        <form name=\"Calc\">\n");
      out.write("          <table border=4 bordercolorlight=\"#FF9900\" bordercolordark=\"#FF6633\">\n");
      out.write("            <tr> \n");
      out.write("              <td> \n");
      out.write("                <div align=\"center\"> <font size=\"+1\"> \n");
      out.write("                  <input type=\"text\"   name=\"Input\" size=\"16\">\n");
      out.write("                  </font></div>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr> \n");
      out.write("              <td height=\"111\"> \n");
      out.write("                <div align=\"center\"> \n");
      out.write("                  <input type=\"button\" name=\"one\"   value=\"  1  \" onClick=\"Calc.Input.value += '1'\">\n");
      out.write("                  <input type=\"button\" name=\"two\"   value=\"  2  \" onClick=\"Calc.Input.value += '2'\">\n");
      out.write("                  <input type=\"button\" name=\"three\" value=\"  3  \" onClick=\"Calc.Input.value += '3'\">\n");
      out.write("                  <input type=\"button\" name=\"plus\"  value=\"  +  \" onClick=\"Calc.Input.value += ' + '\">\n");
      out.write("                  <br>\n");
      out.write("                  <input type=\"button\" name=\"four\"  value=\"  4  \" onClick=\"Calc.Input.value += '4'\">\n");
      out.write("                  <input type=\"button\" name=\"five\"  value=\"  5  \" onClick=\"Calc.Input.value += '5'\">\n");
      out.write("                  <input type=\"button\" name=\"six\"   value=\"  6  \" onClick=\"Calc.Input.value += '6'\">\n");
      out.write("                  <input type=\"button\" name=\"minus\" value=\"   -  \" onClick=\"Calc.Input.value += ' - '\">\n");
      out.write("                  <br>\n");
      out.write("                  <input type=\"button\" name=\"seven\" value=\"  7  \" onClick=\"Calc.Input.value += '7'\">\n");
      out.write("                  <input type=\"button\" name=\"eight\" value=\"  8  \" onClick=\"Calc.Input.value += '8'\">\n");
      out.write("                  <input type=\"button\" name=\"nine\"  value=\"  9  \" onClick=\"Calc.Input.value += '9'\">\n");
      out.write("                  <input type=\"button\" name=\"times\" value=\"  x  \" onClick=\"Calc.Input.value += ' * '\">\n");
      out.write("                  <br>\n");
      out.write("                  <input type=\"button\" name=\"clear\" value=\"  Clear \" onClick=\"Calc.Input.value = ''\">\n");
      out.write("                  <input type=\"button\" name=\"zero\"  value=\"  0  \" onClick=\"Calc.Input.value += '0'\">\n");
      out.write("                  <input type=\"button\" name=\"div\"   value=\"   /  \" onClick=\"Calc.Input.value += ' / '\">\n");
      out.write("                </div>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr> \n");
      out.write("              <td> \n");
      out.write("                <div align=\"center\"> \n");
      out.write("                  <input type=\"button\" name=\"DoIt\"  value=\"             =             \" onClick=\"Calc.Input.value = eval(Calc.Input.value)\">\n");
      out.write("                </div>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("          </table>\n");
      out.write("          \n");
      out.write("          <div align=\"right\"><br>\n");
      out.write("\t\t</div>\n");
      out.write("         \n");
      out.write("        </form>\n");
      out.write("      </center>\n");
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
