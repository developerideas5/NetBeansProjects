<%-- 
    Document   : logout
    Created on : Apr 27, 2014, 3:56:30 PM
    Author     : chinnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
session.setAttribute("userid", null);
session.invalidate();
response.sendRedirect("index.jsp");
%>
