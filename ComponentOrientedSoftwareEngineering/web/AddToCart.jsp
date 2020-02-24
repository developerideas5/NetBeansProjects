<%-- 
    Document   : AddToCart
    Created on : May 15, 2014, 2:13:15 PM
    Author     : shruti
--%>

<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%! Connection con = null;
    Statement stmt = null;

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="Header" >
            <h1>View Cart</h1>
            <hr width=60%>
            <table cellpadding="5px" cellspacing="0px" border="1px">
                <tr>
                    <th>CAKE NAME</th>
                    <th>CAKE PRICE</th>
                    <th>QUANTITY</th>
                </tr>
                <%

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
                        String query = "INSERT INTO PUBLIC.ADDTOCART(CUSTOMER_ID, CATEGORY_ID, QUANTITY)VALUES(?,?,?)";
                        PreparedStatement ps = con.prepareStatement(query);

                        ps.setInt(1, ((Integer) session.getAttribute("LOGIN_ID")).intValue());
                        ps.setString(2, request.getParameter("CATEGORY_ID"));
                        ps.setString(3, request.getParameter("QUANTITY"));

                        int i = ps.executeUpdate();
                        ps.close();

                        ResultSet rs = stmt.executeQuery(
                                "SELECT C.CATEGORY_NAME, C.PRICE, A.QUANTITY FROM PUBLIC.CATEGORY AS C INNER JOIN PUBLIC.ADDTOCART AS A ON C.CATEGORY_ID=A.CATEGORY_ID WHERE A.CUSTOMER_ID=" + session.getAttribute("LOGIN_ID")
                        );

                        if (!rs.next()) {
                            out.println("<tr><td>No item in the cart.</td></tr>");
                        } else {
                               do {%>

                <tr>
                    <td><%= rs.getString(1)%></td>
                    <td><%= rs.getString(2)%></td>
                    <td><%= rs.getInt(3)%></td>
                </tr>

                <% } while (rs.next());
                        }
                       
                      /*  String cust_id=rs.getString(1);
                        String cat_id=rs.getString(2);
                                                        
                        if
                        {
                            String query2 = "UPDATE ADDTOCHART SET QUANTITY =? WHERE CUSTOMER_ID=" + rs.getString(1) + ",CATEGORY_ID =" + rs.getString(2) + " ";
                            PreparedStatement ps1 = con.prepareStatement(query2);

                            ps1.setString(3, request.getParameter("QUANTITY"));
                            
                            int j = ps1.executeUpdate();
                            ps.close();
                         
                        }*/
                    } catch (Exception ex) {
                        out.println(ex);
                    } finally {
                        try {

                            // 7. close the database connection
                            con.close();
                        } catch (SQLException ex) {
                            out.println(ex);
                        }
                    }%>


            </table>    

        </div>
    </body>
</html>
