<%-- 
    Document   : DisplayPage
    Created on : May 17, 2014, 1:22:13 PM
    Author     : shruti
--%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%! Connection con = null;
    Statement stmt = null;
    int Counter = 0;%>

<html>
    <head>
        <title>Home page</title>
    </head>

    <body style="background-color: #FF8000">
        <h1> <span style="font-weight: bold;"></span><span style="font-family: monospace;"></span><span style="font-weight: bold; font-style: italic;"></span></h1>
        <h1><span style="font-weight: bold; font-style: italic;">&nbsp; </span><b style="mso-bidi-font-weight:normal"><i style="mso-bidi-font-style:
                    normal"><span style="font-size:72.0pt;line-height:115%;font-family:Algerian;
                        color:#FFF000">HOF CAKES&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></i></b> ☏
            9999900000&nbsp; <span style="color: white;">24x7 Call us</span>
        </h1>

        <span style="text-decoration: underline; font-weight: bold; font-style: italic; color: white;">Hof
            Cakes,Enoch Widman Strasse,20 A,Hof,Bavaria,Germany,95028.email id:
            hofcakes@live.de </span><span style="font-weight: bold; font-style: italic;"></span><span
 style="color: white;">&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <span style="color: rgb(68, 68, 68); font-family: Georgia, 'Times New Roman', Times, serif; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 30px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;"></span>
            <p class="MsoNormal"><span style="font-weight: bold; font-style: italic;"></span>
                <span style="font-weight: bold; font-style: italic;">

                </span>
            <p class="MsoNormal"><span style="font-size:20.0pt;line-height:115%;font-family:
                                       Algerian;color:white;mso-themecolor:background1">Welcome to the Hof Cakes Enjoy
                    the Taste </span></p>
            <marquee behavior="scroll" direction="left">Yummy Yummy Tasty Delicious Cakes are waiting for you hurry up ...!!!!!! Follow us in the twitter </marquee>

            <table style="width: 100%" border="1">

                <%
                    
                    try {

                        // 1. load database driver
                        Class.forName("org.hsqldb.jdbcDriver");

                        // 2. connect to the database
                        con = DriverManager.getConnection(
                                "jdbc:hsqldb:hsql://localhost/jfai3", "SA", ""
                        );

                        // 3. create statement object
                        stmt = con.createStatement();

                        // 4. execute SQL query
                        ResultSet rs = stmt.executeQuery("SELECT * FROM PUBLIC.CATEGORY");
                        if (!rs.next()) {
                            throw new SQLException("SELECT COUNT(*): no result");
                        }
                        do {
                            if (Counter == 0 || Counter % 3 == 0) {
                                out.println("<tr>");
                            }
                            Counter++;
                %>

                <td style="height: 80px; background-color: #FFFF00;"><span style="font-weight: bold;"><%= rs.getString(2) %><br>
                        <br>
                        <br>


                        <img src="<%=request.getContextPath() +"/image/" + rs.getString(3) %>"> <br>

                        <blink>For More Details </blink> <a href="DetailPage.jsp?id=<%= rs.getInt(1) %>">Click here!</a> <br></span><br>
                    <br>
                </td>

                <% if (Counter == 0 || Counter % 3 == 0) {
                                out.println("</tr>");
                            }

                        } while (rs.next());
                        // 6. close the statement object
                        stmt.close();

                    } catch (Exception ex) {
                        out.println(ex);
                    } finally {
                        try {

                            // 7. close the database connection
                            con.close();
                        } catch (SQLException ex) {
                            out.println(ex);
                        }
                    }%>

            </table>

    </body>
</html>
