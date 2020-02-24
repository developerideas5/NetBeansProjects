/*
 * ToDo:
 * - add analyzer to session
 * - imbed image in some html
 * - maybe have only numbers as labels
 * - also should be able to download csv file
 * - session timeout is set to 2 minutes, should have some JS that tells the user
 * 
 * 0.01:
 * - got first version working
 * - based on @see http://www.tutorialspoint.com/servlets/servlets-file-uploading.htm
 */
package com.plagiation;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import javax.imageio.ImageIO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author ralph
 */
public class UploadServlet extends HttpServlet {

    private boolean isMultipart;
    private int maxFileSize = 50 * 1024;
    private int maxMemSize = 4 * 1024;

    /**
     * Original @see http://www.tutorialspoint.com/servlets/servlets-file-uploading.htm
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Check that we have a file upload request
        isMultipart = ServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
            java.io.PrintWriter out2 = response.getWriter();
            response.setContentType("text/html");
            out2.println("<html>");
            out2.println("<head>");
            out2.println("<title>Servlet upload</title>");
            out2.println("</head>");
            out2.println("<body>");
            out2.println("<p>No file uploaded</p>");
            out2.println("</body>");
            out2.println("</html>");
            return;
        }
        
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(maxMemSize);
        //factory.setRepository(new File("/home/ralph/Downloads/"));
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setSizeMax(maxFileSize);

        try {
            List fileItems = upload.parseRequest(request);
            Iterator i = fileItems.iterator();
            long totalSize = 0;
            Map<String,String> allFileContents = new ConcurrentHashMap<String,String>();
            while (i.hasNext()) {
                FileItem fi = (FileItem) i.next();
                if (!fi.isFormField()) {
                    //String fileName = fi.getName();
                    //long sizeInBytes = fi.getSize();
                    totalSize += fi.getSize();
                    String fileContent = fi.getString("UTF-8");
                    fileContent = fileContent.replaceAll("\\s+","");    // now remove all white-space characters:
                    allFileContents.put( fi.getName(), fileContent );
                }
            }
            
            PlagiarismAnalyzer an = new PlagiarismAnalyzer( allFileContents, (int)totalSize );
            HttpSession session = request.getSession();
            session.setAttribute("PlagiarismAnalyzer", an);
            
            response.sendRedirect("result.jsp");
        
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /**
     * Not yet needed for anything, just a dummy.
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Test Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Test Servlet</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "UploadServlet";
    }
}
