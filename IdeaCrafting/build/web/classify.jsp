<%@page import="java.util.StringTokenizer"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Hashtable"%>
<%@page import="java.util.Enumeration"%>
<%!
    private String getRidOfEmptyLines( String sInfoBs ) {
        String sRet = "";
        StringTokenizer st = new StringTokenizer(sInfoBs, "\r\n");
        while ( st.hasMoreTokens() ) {
            String tokn = st.nextToken().trim();
            if ( tokn.length() > 0 ) {
                sRet += tokn + "\r\n";
            }
        }
        return sRet;
    }
%>
<%
        request.setCharacterEncoding("UTF-8");      // needed to read umlauts in parameters
        String sKeyword = request.getParameter("keyword");  
        if ( sKeyword == null ) {
            sKeyword = "_new";
        }
        
        Enumeration parNames = request.getParameterNames();
        ArrayList<String> infoBs = new ArrayList<String>();
        ArrayList<String> keyWs = new ArrayList<String>();
        while (parNames.hasMoreElements()) {
            String sName = (String) parNames.nextElement();
            if ( sName.startsWith("infobit") ) {
                int index = Integer.parseInt( sName.substring(7) );
                String sInfoBs = request.getParameter(sName);
                sInfoBs = getRidOfEmptyLines( sInfoBs );
                infoBs.add(index, sInfoBs);
                //out.print("infobit" + index);
                //out.print("=" + request.getParameter(sName));
                //out.println("<br/>");                
            } else if ( sName.startsWith("keywords") ) {
                int index = Integer.parseInt( sName.substring(8) );
                keyWs.add(index, request.getParameter(sName));
                //out.print("keywords" + index);
                //out.print("=" + request.getParameter(sName));
                //out.println("<br/>");                
            }
        }
        
        // list all parameters:
        //for (int i = 0; i < infoBs.size(); i++) {
        //    out.println(infoBs.get(i) + ": " + keyWs.get(i) + "<br/>");
        //}
        
        // add entries to the infoBits and keywords lists:
        List<String> infoBits = (List<String>)application.getAttribute("infoBits");
        Map<String,List> keywords = (Map<String,List>)application.getAttribute("keywords");
        if ( (infoBits != null) && (keywords != null) ) {

            // we first need to delete all entries for the current keyword
            // but first we need to delete entries from infoBits
            List<Integer> infoBitsIndcs = keywords.get(sKeyword);
            if ( infoBitsIndcs != null ) {
                for ( int i = 0; i < infoBitsIndcs.size(); i++) {
                    infoBits.set( infoBitsIndcs.get(i), "");    // we cant remove, because then the array will be rearranged and pointers will point to the wrong places
                }                
            }
            if ( !sKeyword.equals("_new") ) {
                keywords.remove( sKeyword );            
            }
            
            
            // first add infobits to big List, we need the index for reference
            for (int i = 0; i < infoBs.size(); i++) {
                infoBits.add( infoBs.get(i) );
                // get the index under which this info bit was stored
                int index = infoBits.indexOf( infoBs.get(i) );
                // now add it to all the keywords:
                String keys = keyWs.get(i);
                StringTokenizer st = new StringTokenizer(keys, " ,");
                while ( st.hasMoreTokens()) {
                    String key = st.nextToken();
                    // check if key is already in map
                    List<Integer> infoBitsIndices = null;
                    if ( keywords.containsKey(key) ) {
                        infoBitsIndices = keywords.get(key);                        
                    } else {
                        infoBitsIndices = new ArrayList<Integer>();
                        keywords.put(key, infoBitsIndices);
                    }
                    infoBitsIndices.add( index );
                }
            } 

            response.sendRedirect("index.jsp");                      

        } else {
            out.println("infoBits or keywords is empty, this should not happen!");
        }
  
%>