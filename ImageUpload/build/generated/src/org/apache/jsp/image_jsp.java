package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class image_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");






if(request.getParameter("imgid")!=null && request.getParameter("imgid")!="")

{

  int id =  Integer.parseInt(request.getParameter("imgid"));



  String filename = "image"+id+".jpg";

  Connection con=null;

  try{  

  Class.forName("org.hsqldb.jdbcDriver").newInstance();

  con=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/jfai3", "SA", "");  

  Statement st1=con.createStatement();

  String strQuery = "select imagefile from IMAGES where IMAGE_ID="+id;

  

  ResultSet rs1 = st1.executeQuery(strQuery);

  

  String imgLen="";

  if(rs1.next()){

  imgLen = rs1.getString(1);

 }  

  rs1 = st1.executeQuery(strQuery);

  if(rs1.next()){

  int len = imgLen.length();

  byte [] rb = new byte[len];

  InputStream readImg = rs1.getBinaryStream(1);

  int index=readImg.read(rb, 0, len);  

  st1.close();

  response.reset();

  response.setContentType("image/jpg");

  response.setHeader("Content-disposition","attachment; filename=" +filename);

  response.getOutputStream().write(rb,0,len); 

  response.getOutputStream().flush();  

  }

  }

  catch (Exception e){

  e.printStackTrace();

  }

}


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
