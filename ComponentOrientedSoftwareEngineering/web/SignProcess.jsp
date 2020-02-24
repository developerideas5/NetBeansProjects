<%-- 
    Document   : SignProcess
    Created on : May 18, 2014, 4:54:11 PM
    Author     : shruti
--%>
<%@page import="com.util.DataHelper"%>
<%@ page import="java.sql.*" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String name = request.getParameter("name");
    String contact = request.getParameter("contact");

    
    DataHelper dh = new DataHelper();
    dh.addCustomer(username, password, name, contact);
    
    response.sendRedirect("LoginPage.jsp");
    
    /* Connection con = null;
    Statement stmt = null;

    try {

        // 1. load database driver
        Class.forName("org.hsqldb.jdbcDriver");

        // 2. connect to the database
        con = DriverManager.getConnection(
                "jdbc:hsqldb:hsql://localhost/jfai3", "SA", ""
        );
                    
        String query = "INSERT INTO PUBLIC.CUSTOMER(username,password,name,contact)VALUES(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1, username);
        ps.setString(2, password);
        ps.setString(3, name);
        ps.setString(4, contact);
        
        int i = ps.executeUpdate();
        ps.close();
        
        response.sendRedirect("LoginPage.jsp");
        
    } catch (Exception ex) {
       out.println(ex);
    } finally {
        try {
            con.close();
        } catch (SQLException ex) {
            out.println(ex);
        }
    }*/


%>