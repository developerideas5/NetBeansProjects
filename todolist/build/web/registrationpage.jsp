<%-- 
    Document   : registrationpage
    Created on : Apr 25, 2014, 3:53:10 PM
    Author     : chinnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta content="text/html; charset=windows-1252" http-equiv="content-type">
    <title>Registration Page</title>
  </head>
  <body style="background-color: #ffcc99;"> Welcome to the registration page<br>
    Please Provide your details<br>
    <br>
    First Name : &nbsp; <input autocomplete="on" maxlength="30" required="required"
      name="firstname" type="text"><br>
    <br>
    Family Name: <input required="required" autocomplete="on" name="familyname"
      type="text"><br>
    <br>
    Email Id : <input autocomplete="on" size="30" required="required" name="emailid"
      type="email"><br>
    <br>
    Create Password : <input size="30" required="required" name="password" type="password"><br>
    <br>
    Confirm Password : <input size="30" required="required" name="password" type="password"><br>
    <br>
    Click Here To submit : <input value="Submit" type="submit">
  </body>
</html>

