<%@page import="com.util.DataHelper" %>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%! Connection con = null;
    Statement stmt = null;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body
         style="  background-color: #FF8000"/>
        <div class="Header" >
            <center><h1>Hof Cakes</h1><center>
                    <hr width=60%>
        </div>
        <center><img src="<%=request.getContextPath()%>/image/images.jpg"> </center>
        <form method="post">
            <center>
                <table><legend>Login Details</legend>
                    <tr><td>User Name</td><td><input type="text" name="loginusername"></td></tr>
                    <tr><td>Password</td><td><input type="password" name="loginpassword"></td></tr>
                    <tr><td><input type="submit" value="Login"></td></tr>
                </table> 
            </center>
        </form>

        <%  String login_username = request.getParameter("loginusername");
            String login_password = request.getParameter("loginpassword");
            
            if (login_username != null && login_password != null) 
            {
                System.out.println(login_username);
                System.out.println(login_password);
                
                DataHelper dh= new DataHelper();
                dh.checkLogin(login_username, login_password);
                
                 
              /*  try {

                    // 1. load database driver
                    Class.forName("org.hsqldb.jdbcDriver");

                    // 2. connect to the database
                    con = DriverManager.getConnection(
                            "jdbc:hsqldb:hsql://localhost/jfai3", "SA", ""
                    );

                    // 3. create statement object
                    stmt = con.createStatement();

                    // 4. execute SQL query
                    ResultSet rs = stmt.executeQuery("SELECT * FROM PUBLIC.CUSTOMER WHERE USERNAME='" + login_username + "' AND PASSWORD='" + login_password + "'");
                  

                    if (!rs.next()) 
                    {
                        out.println("Error Login");
                        
                    } else {
                        
                        session.setAttribute("LOGIN_ID", rs.getInt(1));
                        response.sendRedirect("DisplayPage.jsp");
          
                        stmt.close();
                    }
                } catch (Exception ex) {
                    out.println(ex);
                } finally {
                    try {
                        // 7. close the database connection
                        con.close();
                    } catch (SQLException ex) {
                        out.println(ex);
                    }
                }*/
            }
        

        %>  



    </body>
</html>
