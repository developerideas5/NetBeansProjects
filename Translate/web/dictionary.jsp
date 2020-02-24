<%-- 
    Document   : dictionary
    Created on : May 5, 2014, 12:17:22 PM
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
        <h1>Dictionary!</h1>
    <form action="lookup.jsp" method="POST">
        enter english word:
        <textarea name="englishword" cols="60" rows="1"></textarea><br />
        <input type="submit" value="lookup" />
    </form>
    </body>
</html>
