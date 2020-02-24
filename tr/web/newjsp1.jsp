<%-- 
    Document   : newjsp1
    Created on : May 12, 2014, 4:21:54 PM
    Author     : shruti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

	<html>
	 
	<head>
	    <title>Java Code Geeks Snippets - Pass Parameters to other JSP Page</title>
	</head>
	 
	<body>
	 
	    This is the caller JSP page.
	     
	    <jsp:include page="newjsp2.jsp">
	        <jsp:param name="param1" value="value1"/>
	        <jsp:param name="param2" value="value2"/>
	    </jsp:include>
	 
	</body>
        </html>