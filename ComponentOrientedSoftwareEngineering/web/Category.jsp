<%-- 
    Document   : newjsp
    Created on : May 11, 2014, 6:11:10 PM
    Author     : shruti
--%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%!Connection con = null;
    Statement stmt = null;%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: yellowgreen">
 <form method="get">
Select cakes:
<select required="required" name="cake">
    <option>Select</option>
<option value="1">Fruitcake with nuts</option>
<option value="2">Dry fruit cake</option>
<option value="3">Almond Cake</option>
</select><br>
<input type="submit" value="Submit"><br>
</form>

<%
    String selectedValue=request.getParameter("cake");
    System.out.println("Selected Value is: "+selectedValue);
   
    try {

        // 1. load database driver
        Class.forName("org.hsqldb.jdbcDriver");

        // 2. connect to the database
        con = DriverManager.getConnection(
            "jdbc:hsqldb:hsql://localhost/jfai3", "SA", ""
        );

        // 3. create statement object
        stmt = con.createStatement();

        // 4. execute SQL query
        ResultSet rs = stmt.executeQuery("SELECT * FROM PUBLIC.CATEGORY WHERE CATEGORY_ID='" + selectedValue + "'");
        if (!rs.next()) {
            throw new SQLException("SELECT COUNT(*): no result");
        }
        do{%>
        
       <img src="<%=request.getContextPath()%>/image/<%=rs.getString(3)%>" />
      
        <% 
                                        out.println("<html>");
					out.println("<body>");
					out.println("<table>");
					out.println("<tbody>");
                                        
					out.println("<tr> <td>"+"<b> Cake Name: </b>"+rs.getString(2) +"</td> </tr>");
                                      	out.println("<tr> <td>"+"<b> Price Per Kg: </b>"+rs.getInt(4)+"</td> </tr>");
					out.println("<tr> <td>"+"<b> Availability: </b>"+rs.getInt(5)+"</td> </tr>");
                                        
  %>
  
  <a href="AddToCart.jsp?id=<%= request.getParameter("cake") %>">Add to cart</a>
  <%
    session.setAttribute("cake_ids", request.getParameter("cake"));
  %>
  <form action="AddToCart.jsp" method="get"> 
  <input type="hidden" name="id" value="" />
  <input type='submit' value='Add to cart' /></form>
                             <%           
                                        out.println("</tbody>");
					out.println("</table>");
					out.println("<hr />");
					out.println("</body>");
					out.println("</html>");

                                    //   out.println(" " + rs.getString(1));
    
        }while(rs.next());
        // 6. close the statement object
        stmt.close();

    } catch (Exception ex) {
       out.println(ex);
    } finally {
        try {

            // 7. close the database connection
            con.close();
        } catch (SQLException ex) {
            out.println(ex);
        }
    }
%>
   </body>
</html>
