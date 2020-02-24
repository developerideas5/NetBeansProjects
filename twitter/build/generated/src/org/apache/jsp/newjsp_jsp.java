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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("            <input id=\"form1:button1\" name=\"form1:button1\" class=\"Btn2\" onblur=\"return this.myonblur();\" onfocus=\"return this.myonfocus();\" onmouseout=\"return this.myonmouseout();\" onmouseover=\"return toggleDisplay();return this.myonmouseover();\" style=\"left: 269px; top: 340px; position: absolute\" type=\"submit\" value=\"Click to toggle image display\">\n");
      out.write("    </input>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    sjwuic_assign_button('form1:button1', defaultButtonStrings, true, false, false);\n");
      out.write("    </script>\n");
      out.write("    <img id=\"form1:image1\" style=\"left: 300px; top: 190px; position: absolute\" src=\"EgglessFruitCake.jpg\" alt=\"\" border=\"0\"></img>\n");
      out.write("\n");
      out.write("        Report Abuse\n");
      out.write("        Like (0)\n");
      out.write("    4. Re: onMouseOver with buttons\n");
      out.write("    807575 Newbie\n");
      out.write("    807575 Aug 21, 2006 11:50 AM (in response to 807575)\n");
      out.write("    what happens if you call like this?\n");
      out.write("\n");
      out.write("    onMouseOver=\"toggleDisplay()\" why do you need 'return' there?\n");
      out.write("        Report Abuse\n");
      out.write("        Like (0)\n");
      out.write("    5. Re: onMouseOver with buttons\n");
      out.write("    807575 Newbie\n");
      out.write("    807575 Aug 21, 2006 12:10 PM (in response to 807575)\n");
      out.write("    Same thing.\n");
      out.write("\n");
      out.write("    I was following the syntax used by Creator when it generates the page. However, return is normally used when calling a Function vs. just passing script.\n");
      out.write("        Report Abuse\n");
      out.write("        Like (0)\n");
      out.write("    6. Re: onMouseOver with buttons\n");
      out.write("    807575 Newbie\n");
      out.write("    807575 Aug 22, 2006 6:16 AM (in response to 807575)\n");
      out.write("    You use the \"language=\" Attribute which is deprecated.\n");
      out.write("\n");
      out.write("    <script language=\"text/javascript\">\n");
      out.write("\n");
      out.write("    What Browser are you using? Try\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    Juergen\n");
      out.write("\n");
      out.write("    Message was edited by:\n");
      out.write("    bookon\n");
      out.write("\n");
      out.write("    Message was edited by:\n");
      out.write("    bookon\n");
      out.write("        Report Abuse\n");
      out.write("        Like (0)\n");
      out.write("\n");
      out.write("Go to original post\n");
      out.write("Actions\n");
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
