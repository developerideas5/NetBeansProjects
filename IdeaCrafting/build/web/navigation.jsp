<%@page import="java.util.StringTokenizer"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%
    //Map<String,List> keywords = (Map<String,List>)application.getAttribute("keywords");
    out.println( "Keywords:" );
    out.println( "<pre>" );

    if ( navigation == null ) {

        if ( keywords != null ) {
            for ( String name : keywords.keySet() ) {
                out.print( "<a href='index.jsp?action=keyword&keyword="+name+"'>" );
                out.print( name );
                out.println( "</a>" );
            }

        } else {
            out.println("keywords is empty, <br/>this should not happen!");
        }
        
    } else {
        StringTokenizer st = new StringTokenizer(navigation, "\n");
        while ( st.hasMoreTokens() ) {
            String line = st.nextToken();
            String key = line.trim();
            int pos = line.indexOf(key);
            for ( int i=0; i<pos; i++ ) {
                out.print( " " );                        
            }
            if ( keywords.containsKey(key) ) {
                out.print( "<a href='index.jsp?action=keyword&keyword="+key+"'>" );
                out.print( key );        
                out.println( "</a>" );                
            } else {
                out.print( key + "\r\n" );                        
            }
        }
        
    }
    out.println( "</pre>" );
%>
