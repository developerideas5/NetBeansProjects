<%@page import="java.util.ArrayList"%>
<%@page import="java.util.TreeMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%!
    private String tokenize(String sInfoBits, String sKeyword) {
        String sout = "";
        int i = 0;
        while (true) {
            int pos = sInfoBits.indexOf("\r\n\r\n");
            if ( pos < 0 ) break;
            String infoBit = sInfoBits.substring(0, pos);
            if ( infoBit.length() > 4) {
                sout += "\r\n\r\n";
                sout += "<textarea rows='3' style='width: 100%;' name='infobit"+i+"'>" + infoBit + "</textarea>";
                sout += "\r\n\r\n";
                sout += "Keywords: <input type='text' name='keywords"+i+"' value='"+sKeyword+"' />";                    
                i++;
            }
            sInfoBits = sInfoBits.substring(pos + 2);
        }    
        if ( sInfoBits.length() > 4) {
            sout += "\r\n\r\n";
            sout += "<textarea rows='3' style='width: 100%;' name='infobit"+i+"'>" + sInfoBits + "</textarea>";
            sout += "\r\n\r\n";
            sout += "Keywords: <input type='text' name='keywords"+i+"' value='"+sKeyword+"' />";
        }
        return sout;
    }

%>    
<%
    List<String> infoBits = (List<String>)application.getAttribute("infoBits");
    if ( infoBits == null ) {
        infoBits = new ArrayList<String>();
        infoBits.add("- enter new infobits here.");
        application.setAttribute("infoBits", infoBits);
    }
    Map<String,List> keywords = (Map<String,List>)application.getAttribute("keywords");
    if ( keywords == null ) {
        keywords = new TreeMap<String,List>();
        List infoBitsIndices = new ArrayList<Integer>();
        infoBitsIndices.add( 0 );
        keywords.put("_new", infoBitsIndices);
        application.setAttribute("keywords", keywords);
    }
    String navigation = (String)application.getAttribute("navigation");
%>