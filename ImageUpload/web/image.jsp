<%-- 
    Document   : image
    Created on : May 11, 2014, 1:17:35 PM
    Author     : shruti
--%>
<%@ page import="java.sql.*,java.io.*,java.util.*" %> 

<%





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

%>