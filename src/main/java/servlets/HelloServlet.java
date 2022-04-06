package servlets;

import utilities.HTML;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        HTML.Start(out, "Hello World! Servlet");
        out.println("<h2>Search for a player's name in the database :-)</h2>");
        out.println("<form action='GetPlayerServlet' method='GET'>");
        out.println("  <label for='pname'>Nickname:</label>");
        out.println("  <input type='text' name='pname'/>");
        out.println("  <input type='submit' />");
        out.println("</form>");
        out.println("<p>This query finds a player in your private Battlefield 2 statistics database and lists up some(not all..) of the player's stats.</p>");
        HTML.MiniTutorial(out);
        HTML.EndBasic(out);
    }

    public void destroy() {
    }
}