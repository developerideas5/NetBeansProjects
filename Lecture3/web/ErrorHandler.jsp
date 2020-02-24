<%-- 
    Document   : ErrorHandler
    Created on : May 5, 2014, 11:57:48 AM
    Author     : shruti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Error Handling Page</h1>
This page get’s called then a problem occured.  Usually, we do not want
to tell the user the exception type, but rather give him or her help. <br />
<%
    String msg = exception.toString();
    out.println( msg );
%>
    </body>
</html>

