<%
    if ( keywords != null ) {
        if ( keywords.size() == 0 ) {
            out.println( "Currently there are no keywords." );        
            
        } else {
            out.println( "<pre>" );
            for ( String name : keywords.keySet() ) {
                //out.println( "<li>" );
                out.println( name + ": " + keywords.get(name) );
                //out.println( "</li>" );
            }
            out.println( "</pre>" );        

        }
        
    } else {
        out.println("keywords is empty, this should not happen!");
    }
%>