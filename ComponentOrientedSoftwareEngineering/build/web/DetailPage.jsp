<%-- 
    Document   : DryFruitCake
    Created on : May 17, 2014, 2:15:24 PM
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
        <meta content="text/html; charset=windows-1252" http-equiv="content-type">
        <title>Shopping Bag</title>
    </head>
    <body>
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
                ResultSet rs = stmt.executeQuery("SELECT * FROM PUBLIC.CATEGORY WHERE CATEGORY_ID=" + request.getParameter("id"));
                if (!rs.next()) {
                    throw new SQLException("SELECT COUNT(*): no result");
                }
                do {
        %>
    <center><img src="<%=request.getContextPath() + "/image/" + rs.getString(3)%>" /> </center>
    <text><h1><%= rs.getString(2)%></h1>
     <h3> <%= rs.getString(6)%></h3>
    </text>

    <br>
    <div style="clear:both;"></div>

    <form name="add_to_cart" method="post" action="AddToCart.jsp">
        <div class="add-to-cart">
            <input type="hidden" name="CATEGORY_ID" value="<%= rs.getInt(1) %>">
            <hr/>
            Quantity <input type="text" name="QUANTITY" value="1">
            <button type="submit" class="">Add to cart</button>
        </div>
    </form>

    <%
            } while (rs.next());
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
        }%>


</body>
</html>
