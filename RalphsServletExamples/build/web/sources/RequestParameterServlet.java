package org.ralph;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ralph
 */
@WebServlet(name = "RequestParameterServlet", urlPatterns = {"/RequestParameterServlet"})
public class RequestParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Request Parameters:");
        Enumeration parNames = request.getParameterNames();
        while (parNames.hasMoreElements()) {
            String sName = (String) parNames.nextElement();
            out.print(sName + " = ");

            String[] sValues = request.getParameterValues(sName);
            if (sValues != null) {
                for (int i = 0; i < sValues.length; i++) {
                    out.print(sValues[i] + ", ");
                }
                out.println("");
            }

        }
    }
}
