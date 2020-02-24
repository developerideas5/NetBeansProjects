<%@page import="java.util.List"%>
<%
    //request.setCharacterEncoding("UTF-8");      // needed to read umlauts in parameters
    String sKeyword = request.getParameter("keyword");  
    if ( sKeyword == null ) {
        sKeyword = "_new";
    }
       
    String sInfoBits = request.getParameter("infoBits");
    //out.println( sKeyword + ", " + sInfoBits );
%>
<form action="classify.jsp" method="post">
    <input type="hidden" name="keyword" value="<%=sKeyword %>" />
    <div>        
<%=tokenize( sInfoBits, sKeyword ) %>
    </div>
    <div style="text-align: right;">    
        <input type="submit" name="submit" value="Classify" />
    </div>
</form>         
