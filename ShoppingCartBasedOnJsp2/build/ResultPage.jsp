<%@ page import="beans.CartItem" %>

<jsp:useBean id="item0" class="beans.CartItem" scope="session" />
<% item0.setNumItems(Integer.parseInt(request.getParameter("item0"))); %>

<jsp:useBean id="item1" class="beans.CartItem" scope="session" />
<% item1.setNumItems(Integer.parseInt(request.getParameter("item1"))); %>

<jsp:forward page="ShoppingCartTemplate.jsp" >
     <jsp:param name="header" value="header.html" />
     <jsp:param name="tableCaption" value="Produce Purchases" />
     <jsp:param name="action" value="ResultPage.jsp" />
     <jsp:param name="footer" value="footer.html" />
</jsp:forward>