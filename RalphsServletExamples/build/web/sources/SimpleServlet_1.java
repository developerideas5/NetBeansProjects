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
@WebServlet(name = "SimpleServlet", urlPatterns = {"/SimpleServlet"})
public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out;
        out = response.getWriter();
        out.println("Hello from SimpleServlet");
        out.close();
    }
}
