<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%
    //request.setCharacterEncoding("UTF-8");      // needed to read umlauts in parameters
    String sKeyword = request.getParameter("keyword");  
    if ( sKeyword == null ) {
        sKeyword = "_new";
    }
       
    //out.println( keywords.get(sKeyword) );
    List indices = keywords.get(sKeyword);
%>
<form action="index.jsp" method="post">
    <textarea cols="120" rows="30" style="width: 100%;" name="infoBits"><%   
if ( indices != null ) {
    for ( int i=0; i<indices.size(); i++ ) {
        String infoBit = infoBits.get( (Integer)indices.get(i) );
        if ( infoBit.length() > 0 ) {
            out.println( infoBit );                        
        }
    }    
}        
%></textarea>             
    <input type="hidden" name="keyword" value="<%=sKeyword %>" />
    <div style="text-align: right;">    
        <input type="submit" name="action" value="Classify" />
    </div>
</form>         
