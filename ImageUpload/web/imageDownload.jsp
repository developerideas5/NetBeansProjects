<%-- 
    Document   : imageDownload
    Created on : May 11, 2014, 1:37:22 PM
    Author     : shruti
--%>

<%@ page import="java.sql.*,java.io.*,java.util.*" %> 

<HTML>

 <HEAD>

  <TITLE>Download Images</TITLE>

  </HEAD>



 <BODY>

 <br><br>

  <table align="center" border=0 width="200px">

 <tr>

  <td colspan=2 align="center"><b>Download Images</b></td>

  </tr>

  <tr><td colspan=2> </td></tr>

  <%



  
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

  %>

  <tr style="background-color:#efefef;">

  <td><b><%=sno%></b></td>

  <td align="center">

<a href="image.jsp?imgid=<%=rs.getInt(1)%>">

<img src="image.jsp?imgid=<%=rs.getInt(1)%>" width="50" height="50">

</a></td>

  </tr>

  <%

  }

  rs.close();

  con.close();

  stmt.close();

  }

  catch(Exception e)

  {

  e.getMessage();

  }

  %>

 </table>

  </BODY>

</HTML>