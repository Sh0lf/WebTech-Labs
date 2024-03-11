package com.webtech.lab1;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "visitCounter", value = "/VisitCounter")
public class VisitCounter extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Get the existing visit count from the cookie
        int visitCount = 0;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visitCount")) {
                    try {
                        visitCount = Integer.parseInt(cookie.getValue());
                    } catch (NumberFormatException e) {
                        // Handle invalid cookie value
                    }
                    break;
                }
            }
        }

        // Increment the visit count
        visitCount++;

        // Set the updated visit count as a cookie
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
        response.addCookie(visitCookie);

        // Display the visit count to the user
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Visit Counter</h2>");
        out.println("<p>Total Visits: " + visitCount + "</p>");
        out.println("</body></html>");
    }
}
