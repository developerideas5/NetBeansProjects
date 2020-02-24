<%@page import="java.util.TreeMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.util.Enumeration"%>
<%!
    private void importInfoBits(String sIdeaBits) {
        StringTokenizer st = new StringTokenizer(sIdeaBits, "\r\n");
        while ( st.hasMoreTokens() ) {
            String line = st.nextToken();
            //out.println("1:"+line);
        }
    }
%>
<%
    request.setCharacterEncoding("UTF-8");      // needed to read umlauts in parameters
    
    String sIdeaBits = (String)request.getAttribute("ideaBits");  
    if ( sIdeaBits != null ) {
        //importInfoBits(sIdeaBits);
        
        // first look if navigation is present:
        String sNavigation = null;
        if ( sIdeaBits.startsWith("Navigation") ) {
            int pos = sIdeaBits.indexOf("\r\n\r\n");
            sNavigation = sIdeaBits.substring(12, pos);     
            sIdeaBits = sIdeaBits.substring(pos + 4);
        }
        application.setAttribute("navigation", sNavigation);
        
        // need to delete everything:
        List<String> infoBits = new ArrayList<String>();
        application.setAttribute("infoBits", infoBits);
        Map<String,List> keywords = new TreeMap<String,List>();        
        application.setAttribute("keywords", keywords);
        
        // and now fill it again with new data:
        int i = 0;
        while (true) {
            int pos = sIdeaBits.indexOf("\r\n\r\n");
            if ( pos < 0 ) break;
            String infoBitWithKey = sIdeaBits.substring(0, pos);
            if ( infoBitWithKey.length() > 1) {
                int pos2 = infoBitWithKey.indexOf("\r\n");                
                String sKey = infoBitWithKey.substring(0, pos2);
                String sIdea = infoBitWithKey.substring(pos2+2) + "\r\n";

                infoBits.add( sIdea );
                // get the index under which this info bit was stored
                int index = infoBits.indexOf( sIdea );
                // now add it to the keywords:
                // check if key is already in map
                List<Integer> infoBitsIndices = null;
                if ( keywords.containsKey(sKey) ) {
                    infoBitsIndices = keywords.get(sKey);                        
                } else {
                    infoBitsIndices = new ArrayList<Integer>();
                    keywords.put(sKey, infoBitsIndices);
                }
                infoBitsIndices.add( index );
                
                               
                //out.println("_" + sKey + "_");  
                //out.println("_" + infoBitWithKey.substring(pos2+2) + "_");  
                i++;
            }
            sIdeaBits = sIdeaBits.substring(pos + 4);
        }    

        response.sendRedirect("index.jsp");    
        
    } else {
        out.println("error");        
    }
%>