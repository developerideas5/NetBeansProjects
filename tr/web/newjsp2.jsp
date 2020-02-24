<%-- 
    Document   : newjsp2
    Created on : May 12, 2014, 4:22:02 PM
    Author     : shruti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          
	    param1: <%= request.getParameter("param1") %>
	    param2: <%= request.getParameter("param2") %>
    </body>
</html>
