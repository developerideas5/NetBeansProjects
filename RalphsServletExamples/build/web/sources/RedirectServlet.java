package org.ralph;

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
@WebServlet(name="RedirectServlet", urlPatterns={"/RedirectServlet"})
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //response.setStatus(404, "tough luck");
        //response.sendError(404, "more luck next time");
        response.sendRedirect("http://www.yahoo.com");
    } 

}
