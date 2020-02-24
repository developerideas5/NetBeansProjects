<%@ page import="beans.CartItem" %>

<jsp:include page='<%= request.getParameter("header") %>' flush="true" />

<CENTER>

<H2><%= request.getParameter("tableCaption") %></H2>

<FORM METHOD="post" ACTION='<%= request.getParameter("action") %>' >
    <TABLE>
    
      <TR>
          <TD WIDTH=5%>SKU</TD>
          <TD>Item Name</TD>
          <TD WIDTH=5%>Pounds</TD>
          <TD WIDTH=25%>Price/Lb.</TD>
      </TR>
    
      <% int count = 0;
         CartItem item = null;
         double total = 0.0;
         while ((item = (CartItem)session.getAttribute("item" + count)) != null)
         {
      %>
      <TR>
          <TD> <%= count %> </TD>
          <TD> <%= item.getItemName() %> </TD>
          <TD> <INPUT TYPE=text NAME='<%= "item" + count %>' VALUE=<%= item.getNumItems() %>>
          </TD>
          <TD ALIGN=right> $<%= item.getPricePerItem() %> </TD>
      </TR>
      <%    total += (item.getNumItems() * item.getPricePerItem());
            count++;
         }
      %>
    
      <TR><TD COLSPAN=4><B>Total: $<%= total %></B></TD></TR>
    </TABLE>

    <INPUT TYPE=submit NAME=Page VALUE=Update>
    <INPUT TYPE=reset VALUE="Reset">


</FORM>
</CENTER>

<jsp:include page='<%= request.getParameter("footer") %>' flush="true"
/>

