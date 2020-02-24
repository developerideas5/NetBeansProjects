package org.ralph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ralph
 */
@WebServlet(name = "ShowCodeServlet", urlPatterns = {"/ShowCodeServlet"})
public class ShowCodeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ShowCode Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>ShowCode Example</h3>");

        // get parameters:
        String sFileName = request.getParameter("File");
        out.println("Code for Servlet " + sFileName + ":<br>");
        if (sFileName != null) {
            out.println("<pre>");
            String buffer;

            try {
                // open the file "FileIO.java":
                String sPath = getServletContext().getRealPath("/") + sFileName;
                FileReader oFReader = new FileReader(sPath);
                BufferedReader in = new BufferedReader(oFReader);

                // read the file line for line:
                while ((buffer = in.readLine()) != null) {
                    //buffer = buffer.replace('<', '<') replace(buffer, "<", "<");
                    //buffer = replace(buffer, ">", ">");
                    out.println(buffer);
                }
                in.close();

            } catch (Exception e) {
                out.println("ShowCode.doGet(): Exception: " + e);
            }

            out.println("</pre>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
