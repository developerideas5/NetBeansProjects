<%-- 
    Document   : dateandtime
    Created on : Apr 27, 2014, 12:08:58 AM
    Author     : chinnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<html>
<head>
<title>Current Date & Time</title>
</head>
<body>
<center>
<h1> Current Date & Time</h1>
</center>
<%
   Date date = new Date();
   out.print( "<h2 align=\"center\">" +date.toString()+"</h2>");
%>
</body>
</html>
