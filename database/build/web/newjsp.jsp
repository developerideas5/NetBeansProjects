<%@ page import="java.sql.*" %>
<html>
    <body>
        <h1>Hello Derby!</h1>
<%
    Connection con = null;
    Statement stmt = null;
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
        ResultSet rs = stmt.executeQuery("SELECT * FROM PUBLIC.CLIENT");
            //"SELECT count(*) FROM customer"
        
        if (!rs.next()) {
            throw new SQLException("SELECT COUNT(*): no result");
        }
        do{
        // 5. display result
            System.out.println("********************************");
        out.println("Number of customers: " + rs.getString(1)+ rs.getString(2));
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