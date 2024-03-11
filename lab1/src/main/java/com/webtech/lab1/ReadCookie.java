package com.webtech.lab1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "readCookie", value = "/ReadCookie")
public class ReadCookie extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {

            for (Cookie cookie : cookies) {
                if (!"JSESSIONID".equals(cookie.getName())) {
                    cookie.setValue("");
                    cookie.setPath("/");
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }
        }

        PrintWriter out = response.getWriter();
        out.println("Cookies cleaned");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        Cookie[] cookies = request.getCookies();

        PrintWriter out = response.getWriter();
        out.println("<table border=\"1\">\n" +
                "    <tr><th>Field</th><th>Value</th></tr>\n");

        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();
            out.println("<tr><td>" + name + "</td><td>" + value + "</td></tr>\n");
        }
        out.println("</table>");
        out.println("</body></html>");
    }
}
