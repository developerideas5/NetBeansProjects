<%-- 
    Document   : announcements
    Created on : Apr 7, 2014, 6:56:17 PM
    Author     : chinnu
--%>

<!DOCTYPE html>

<%@page import="java.util.Vector"%>
<html>
<body>
<h1>Announcements</h1>
<%
Vector<String> announcements = (Vector<String>)application.getAttribute("Announcements");
if ( announcements == null ) {
announcements = new Vector<String>();
application.setAttribute("Announcements", announcements);
}
out.println( "<ul>" );
for (int i = 0; i < announcements.size(); i++) {
String msg = announcements.get(i);
out.println( "<li>" );
out.println( msg );
out.println( " <a href='announcementDel.jsp?id="+i+"'>(delete)</a>" );
out.println( "</li>" );
}
out.println( "</ul>" );
%>
<form action="announcementAdd.jsp" method="POST">
<textarea name="announcement" cols="60" rows="1"></textarea><br />
<input type="submit" value="Post new announcement" />(more than 10 chars)
</body>
</html</form>