/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ideacrafting;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
    The IdeaBits.txt file format is of the following form:
    - first comes a keyword in one line, followed by \r\n
    - then comes one ideaBit for that keyword, followed by \r\n\r\n
    - if there are more ideaBits for one keyword, they will all be listed
      with their respective keywords
    - an empty line denotes the separation to the next keyword
    - keywords can occur multiple times

    Example:

_new
- W2 Performance evaluation: kommentare von Studenten in evaluationen
- is there openmath or open mathematics
- stirling motor mit 3D drucker drucken?  check openhardware

ai
- fische die erbgut über andere fische austauschen (parasiten) auf ähnliche art und
weise könnte auch erworbenes 'wissen' vererbt werden

ai
- understanding of text, use same text in different languages, and find a graph structure that
is the same, that should represent the actual meaning of the text

 * @author ralph
 */
public class SaveServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setCharacterEncoding("utf-8");
        //PrintWriter out = response.getWriter();
        //out.println("hi from SaveServlet");
        
        ServletContext application = getServletConfig().getServletContext();
        List<String> infoBits = (List<String>)application.getAttribute("infoBits");
        Map<String,List> keywords = (Map<String,List>)application.getAttribute("keywords");
        String navigation = (String)application.getAttribute("navigation");

        StringBuffer allInfoBits = new StringBuffer();
        if ( keywords != null ) {
            if ( keywords.size() == 0 ) {
                response.sendRedirect("index.jsp");     

            } else {
                // first add the navigation string:
                if (navigation != null) {
                    allInfoBits.append( "Navigation\r\n" );
                    allInfoBits.append( navigation );
                    allInfoBits.append( "\r\n" );
                }
                
                // now add the keyword-infobits pairs:
                for ( String key : keywords.keySet() ) {
                    List<Integer> indices = keywords.get(key);
                    for ( int i=0; i<indices.size(); i++ ) {
                        String value = infoBits.get( (Integer)indices.get(i));
                        if ( value.trim().length() > 0 ) {
                            allInfoBits.append( key + "\r\n" );
                            allInfoBits.append( value +"\r\n");                                    
                        }
                    }
                    //allInfoBits.append( "\r\n" );        

                }

                // now send as file download
                byte[] zip = zipData( C.TXT_FILE_NAME, allInfoBits.toString() );
                ServletOutputStream sos = response.getOutputStream();
                response.setContentType("application/zip");
                response.setHeader("Content-Disposition", "attachment; filename="+C.ZIP_FILE_NAME);
                sos.write(zip);
                sos.flush();
            }

        } else {
            response.sendRedirect("index.jsp");     
        }

        
    }

    private byte[] zipData(String fileName, String data) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream zos = new ZipOutputStream(baos);
 
        zos.putNextEntry(new ZipEntry(fileName));
        zos.write( data.getBytes("UTF-8") );
        zos.closeEntry();
            
        zos.flush();
        baos.flush();
        zos.close();
        baos.close();
 
        return baos.toByteArray();
    }
    
}
