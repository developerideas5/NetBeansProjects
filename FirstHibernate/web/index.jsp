<%-- 
    Document   : index
    Created on : May 19, 2014, 4:33:51 PM
    Author     : shruti
--%>

<%@page import="de.hof.data.Helper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        Helper uh=new Helper();
        uh.addArticle("test");
        %>
    </body>
</html>
