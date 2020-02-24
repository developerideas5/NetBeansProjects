package org.ralph;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ralph
 */
@WebServlet(name = "ThirdServlet", urlPatterns = {"/ThirdServlet"})
public class ThirdServlet extends HttpServlet {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logger.log(Level.INFO, "ThirdServlet's get() method was called.");
        PrintWriter out = response.getWriter();
        out.println("ThirdServlet's get() method was called.");
    }

    @Override
    public void init() {
        logger.log(Level.INFO, "ThirdServlet's init() method was called.");
    }

    @Override
    public void destroy() {
        logger.log(Level.INFO, "ThirdServlet's destroy() method was called.");
    }
}
