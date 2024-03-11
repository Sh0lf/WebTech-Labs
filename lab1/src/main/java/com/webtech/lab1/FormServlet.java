package com.webtech.lab1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

//urlPatterns = ("/FormServlet","/Form_Servlet")
@WebServlet(name = "formServlet", value = "/FormServlet")
public class FormServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String tempSex = request.getParameter("sex");
        String sex = null;

        if (Objects.equals(tempSex, "male")) {
            sex = "Male";
        } else if (Objects.equals(tempSex, "female")) {
            sex = "Female";
        }

        Cookie cookiefname = new Cookie("FirstName", request.getParameter("fname"));
        Cookie cookielname = new Cookie("LastName", request.getParameter("lname"));
        Cookie cookiebirth = new Cookie("BirthDate", request.getParameter("birthdate"));
        Cookie cookiesex = new Cookie("Sex", sex);

        response.addCookie(cookiefname);
        response.addCookie(cookielname);
        response.addCookie(cookiebirth);
        response.addCookie(cookiesex);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<table border=\"1\">\n" +
                "    <tr><th>Field</th><th>Value</th></tr>\n" +
                "    <tr><td>First Name</td><td>" + request.getParameter("fname") + "</td></tr>\n" +
                "    <tr><td>Last Name</td><td>" + request.getParameter("lname") + "</td></tr>\n" +
                "    <tr><td>Birth date</td><td>" + request.getParameter("birthdate") + "</td></tr>\n" +
                "    <tr><td>Sex</td><td>" + sex + "</td></tr>\n" +
                "</table>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}