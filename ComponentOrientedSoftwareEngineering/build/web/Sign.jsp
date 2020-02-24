<%-- 
    Document   : Sign
    Created on : May 11, 2014, 6:08:27 PM
    Author     : shruti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <body style="  background-color: #FFE000">

        <div class="Header">
            <center><h1>Hof Cakes</h1></center>
            <hr width=60%>

        </div>
        <form action="SignProcess.jsp" method="POST">
            <center>
                <table><legend>Personal Details</legend>
                    <tr><td>User Name</td><td><input type="text" name="username"></td></tr>
                    <tr><td>Password</td><td><input type="password" name="password"></td></tr>
                    <tr><td>Name</td><td><input type="text" name="name"></td></tr>
                    <tr><td>Contact</td><td><input type="text" name="contact"></td></tr>
                    <tr><td><input type="submit" value="Register"></td></tr>
                </table> 
            </center>
        </form>
    </body>
</html>
