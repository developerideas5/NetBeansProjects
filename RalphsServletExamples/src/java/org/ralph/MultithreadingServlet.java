package org.ralph;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Demonstrates problems that might occur do to multi-threading.
 * - modify static variable vs local variable
 * - have a common object and cause data corruption
 * - have a dead lock, meaning waiting for two resources
 * @author ralph
 */
public class MultithreadingServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet MultithreadingServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet MultithreadingServlet</h1>");
        out.println("</body>");
        out.println("</html>");
    } 

}
