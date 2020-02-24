<%@ page import="beans.CartItem" %>

<jsp:useBean id="item0" class="beans.CartItem" scope="session" >
     <jsp:setProperty name="item0" property="itemName" value="Book" />
     <jsp:setProperty name="item0" property="pricePerItem" value="19.99" />
</jsp:useBean>

<jsp:useBean id="item1" class="beans.CartItem" scope="session" >
     <jsp:setProperty name="item1" property="itemName" value="Toy" />
     <jsp:setProperty name="item1" property="pricePerItem" value="12.49" />
</jsp:useBean>

<jsp:forward page="ShoppingCartTemplate.jsp" >
     <jsp:param name="header" value="header.html" />
     <jsp:param name="tableCaption" value="Produce Purchases" />
     <jsp:param name="action" value="ResultPage.jsp" />
     <jsp:param name="footer" value="footer.html" />
</jsp:forward>