package org.ralph;

import Acme.JPM.Encoders.GifEncoder;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.io.OutputStream;
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
@WebServlet(name = "GifServlet", urlPatterns = {"/GifServlet"})
public class GifServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String sText = request.getParameter("Message");
        response.setContentType("image/gif");
        OutputStream out = response.getOutputStream();
        Image gifImage = makeMessageGif(sText);
        sendAsGif(gifImage, out);
    }

    public static Image makeMessageGif(String s) {
        Frame f = new Frame();
        f.addNotify();
        Image retImage = f.createImage(100, 100);
        Graphics g = retImage.getGraphics();
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 99, 99);
        g.setColor(Color.RED);
        g.drawString(s, 30, 50);
        return retImage;
    }

    public static void sendAsGif(Image image, OutputStream out) {
        try {
            new GifEncoder(image, out).encode();
        } catch (Exception e) {  // not good choice, should log instead
            System.out.println("Exception in sendAsGif()" + e);
        }
    }
}
