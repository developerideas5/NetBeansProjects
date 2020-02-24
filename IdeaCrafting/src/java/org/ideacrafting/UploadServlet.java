
package org.ideacrafting;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

/**
 * Allows file upload using commons libraries
 * @see http://stackoverflow.com/questions/1831271/how-to-retrieve-uploaded-image-and-save-to-a-file-with-jsp/1832413#1832413
 * @author ralph
 */
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // get the list of items uploaded by the user:
        List<FileItem> items = null;
        try {
            items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
        } catch (FileUploadException e) {
            throw new ServletException("Cannot parse multipart request.", e);
        }
        
        // the user should upload only one file
        if ( items.size() == 1 ) {
            FileItem item = items.get(0);
            if (item.isFormField()) {
                // there should be no other fields in this form
            } else {
                // Process uploaded fields here.
                String filename = FilenameUtils.getName(item.getName()); // Get filename.
                long filesize = item.getSize();
                //if ( filename.equals( C.ZIP_FILE_NAME ) && ( filesize < C.MAX_UPLOAD_FILE_SIZE ) ) {
                if ( ( filesize < C.MAX_UPLOAD_FILE_SIZE ) ) {
                    String data = unzipData( item.getInputStream() );
                    request.setAttribute("ideaBits", data);
                
                } else {
                    throw new ServletException("Wrong file name or file size larger than 1 MByte.");                    
                }
            }            
            
        } else {
            throw new ServletException("You may upload only one file!");
        }

        // Show result page.        
        request.getRequestDispatcher("upload.jsp").forward(request, response);
    }
    
    private String unzipData(InputStream data) throws IOException {
        String sData = "";
        ZipInputStream zis = new ZipInputStream(
                new BufferedInputStream(data));
        ZipEntry entry;

        if ((entry = zis.getNextEntry()) != null) {
            if ( entry.getName().equals(C.TXT_FILE_NAME) ) {
                //sData += ("Unzipping: " + entry.getName());

                int size;
                byte[] buffer = new byte[2048];

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(baos, buffer.length);

                while ((size = zis.read(buffer, 0, buffer.length)) != -1) {
                    bos.write(buffer, 0, size);
                }
                bos.flush();                
                sData = baos.toString("UTF-8");

                bos.close();
                baos.close();
                
            }
        }

        zis.close();
        data.close();
        
        return sData;
    }

}
