<%-- 
    Document   : LoginCheck.jsp
    Created on : Apr 22, 2014, 7:55:37 PM
    Author     : shruti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Helper.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <%String username=request.getParameter("username");
            String password=request.getParameter("password");
           
           System.out.println(username);
           System.out.println(password);
           
           Authentication authentication=new Authentication(username, password);
           if(authentication.IsAuthorized())
           {
               //System.out.println("working");
               out.println("Welcome " + username);
               //response.sendRedirect("LoginCheck.jsp");
           }
           else
           {
               response.sendRedirect("Login.jsp");
           }
             %>
        
        
    </body>
</html>
