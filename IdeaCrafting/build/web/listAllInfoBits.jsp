<%
    if ( infoBits != null ) {
        if ( infoBits.size() == 0 ) {
            out.println( "Currently there are no InfoBits." );        
        } else {
            out.println( "<pre>" );
            for (int i = 0; i < infoBits.size(); i++) {
                String msg = infoBits.get(i);
                //out.println( "<li>" );
                out.println( msg );
                //out.println( "  <a href='announcementDel.jsp?id="+i+"'>(delete)</a>" );
                //out.println( "</li>" );
            }
            out.println( "</pre>" );        
        }
    
    } else {
        out.println("infoBits is empty, this should not happen!");
    }
    
%> 