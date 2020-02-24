<%-- 
    Document   : lookup
    Created on : Apr 7, 2014, 4:46:50 PM
    Author     : ralph
--%>

<%@page import="org.xml.sax.InputSource"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@page import="org.xml.sax.XMLReader"%>
<%@page import="javax.xml.parsers.SAXParser"%>
<%@page import="javax.xml.parsers.SAXParserFactory"%>
<%@page import="java.util.Hashtable"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    // this should be static, since we need it only once
    private static Hashtable<String, String> dictionary;
    
    public void jspInit(){
        System.out.println("Init");
        dictionary=new Hashtable<String,String>();
        String fileName=getServletConfig().getServletContext().getRealPath("/")+"eng-deu.tei";
        loadDictionary(fileName);
        getServletConfig().getServletContext().setAttribute("dict", dictionary);
        
    }
            
    
    // loads a dictionary from the file system
    private void loadDictionary(String fileName) {
            try {
                de.hof.swe.SaxDictionaryLoader sdl = 
                        new de.hof.swe.SaxDictionaryLoader(dictionary);
                SAXParserFactory spf = SAXParserFactory.newInstance();
                spf.setNamespaceAware(true);
                    SAXParser saxParser = spf.newSAXParser();
                    XMLReader xmlReader = saxParser.getXMLReader();
                    xmlReader.setContentHandler( sdl );
                    //xmlReader.parse(convertToFileURL(fileName));
                    FileReader in = new FileReader( fileName );
                    xmlReader.parse(new InputSource(in));

            } catch (Exception e) {
                    e.printStackTrace();
            }
    }
%>
<% 
    // both request and config objects are only available at run time:
    String englishWord = request.getParameter("englishword");
    dictionary = (Hashtable<String, String>)application.getAttribute("dict");
    if ( dictionary == null ) {
        dictionary = new Hashtable<String, String>();
        String fileName = config.getServletContext().getRealPath("/")+"eng-deu.tei";
        loadDictionary(fileName);        
        application.setAttribute("dict", dictionary);
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dictionary anwser</h1>
        The German translation of "<%= englishWord %>" is "<%= dictionary.get(englishWord) %>"
    </body>
</html>
