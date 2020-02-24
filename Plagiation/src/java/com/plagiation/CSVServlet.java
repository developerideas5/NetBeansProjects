package com.plagiation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ralph
 */
public class CSVServlet extends HttpServlet {

    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        PlagiarismAnalyzer an = (PlagiarismAnalyzer)session.getAttribute("PlagiarismAnalyzer");

        if ( an != null) {
            //BufferedImage img = an.analyze();
            //response.setContentType("image/png");
            response.setContentType("application/vnd.ms-excel");
            PrintWriter  out = response.getWriter();
            out.println( an.exportAsCSV() );
            
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "CSVServlet";
    }
}
