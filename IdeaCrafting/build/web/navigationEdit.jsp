<form action="navigationSave.jsp" method="post">
    <textarea cols="120" rows="30" style="width: 100%;" name="navigation"><%
    if ( navigation != null ) {
        out.println( navigation );
    } else {
        if ( keywords != null ) {
            for ( String name : keywords.keySet() ) {
                out.println( name );
            }

        } else {
            out.println("keywords is empty, <br/>this should not happen!");
        }
           
    }
%></textarea>             
    <div style="text-align: right;">    
        <input type="submit" name="action" value="Save" />
    </div>
</form>         
