package com.webtech.lab1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(name = "showSession", value = "/ShowSession")
public class ShowSession extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        HttpSession s = request.getSession();
        String fname = (String) s.getAttribute("fname");
        String lname = (String) s.getAttribute("lname");
        LocalDate birthdate = (LocalDate) s.getAttribute("birthdate");
        Integer visitCount = (Integer) s.getAttribute("visitCount");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        if (fname == null || lname == null || birthdate == null) {
            out.println("<h2>Welcome</h2>");
            out.println("<form action=\"ShowSession\" method=\"post\">");
            out.println("First Name: <input type=\"text\" name=\"fname\"><br>");
            out.println("Last Name: <input type=\"text\" name=\"lname\"><br>");
            out.println("Date of Birth (YYYY-MM-DD): <input type=\"date\" name=\"birthdate\"><br>");
            out.println("<input type=\"submit\" value=\"Submit\">");
            out.println("</form>");
        } else {
            out.println("<h2>Welcome back</h2>");
            visitCount = (visitCount == null) ? 1 : visitCount + 1;
            s.setAttribute("visitCount", visitCount);

            LocalDate today = LocalDate.now();
            LocalDate nextBirthday = birthdate.withYear(today.getYear());
            if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
                nextBirthday = nextBirthday.plusYears(1);
            }
            long daysToBirthday = java.time.temporal.ChronoUnit.DAYS.between(today, nextBirthday);

            out.println("<p>Hi, " + fname + " " + lname + ". There are " + daysToBirthday + " days to your birthday.</p><br>");
            out.println("<p>You have visited our website " + visitCount +" times.</p>");
        }

        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if(request != null){
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            LocalDate birthdate = LocalDate.parse(request.getParameter("birthdate"));

            HttpSession session = request.getSession();
            session.setAttribute("fname", fname);
            session.setAttribute("lname", lname);
            session.setAttribute("birthdate", birthdate);

            doGet(request, response);
        }
    }
}