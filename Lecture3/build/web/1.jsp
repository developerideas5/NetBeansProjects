<%-- 
    Document   : 1
    Created on : May 5, 2014, 11:22:05 AM
    Author     : shruti
--%>


<%@page import="java.util.Enumeration"%>
<html>
    <body>
        <h1>Access the Config Object</h1>
<%
        out.print("password for database is " + config.getInitParameter("db-password"));
%>
    </body>
</html>