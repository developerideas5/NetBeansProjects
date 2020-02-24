<%-- 
    Document   : Login
    Created on : Apr 22, 2014, 5:00:09 PM
    Author     : shruti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> 
    </head> 
    <body bgcolor="Gray">  
    <center>
        <img src="<%=request.getContextPath()%>/images/01.png" />
        <!--<img src="file:///c:/Users/shruti/Documents/NetBeansProjects/Hofcakes/web/WEB-INF/01.png" />-->
        <h1>Hof Cakes</h1> </center>
        <center> <h1 style=" font-size: 26px; font-weight: normal;letter-spacing: -1px;">Sign In or Sign Up to Continue</h1>
            <form action="LoginCheck.jsp" method="POST">
          
            <br/>Username:<input type="text" name="username"> 
            <br/>Password:<input type="password" name="password"> 
                
            <br/><input type="submit" value="Submit">
            </form>
          
</body>
</html>
    
