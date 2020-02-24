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
@WebServlet(name = "ExcelServlet", urlPatterns = {"/ExcelServlet"})
public class ExcelServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("application/vnd.ms-excel");
        PrintWriter out = res.getWriter();

        out.println("2000	2001	2002	2003	2004");
        out.println("133	155	186	244	274");
        out.close();
    }
}
