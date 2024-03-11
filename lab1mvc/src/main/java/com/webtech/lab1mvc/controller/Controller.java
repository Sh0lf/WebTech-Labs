package com.webtech.lab1mvc.controller;

import com.webtech.lab1mvc.model.Person;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

// for the moment, only doPost
@WebServlet(name = "Controller", value = "/Controller")
public class Controller extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "";

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String birthDay = request.getParameter("birthDay");
        String sex = request.getParameter("sex");

        Person personBean = new Person(firstName, lastName, birthDay, sex);
        request.setAttribute("person", personBean);

        LocalDate date = LocalDate.parse(birthDay);
        int year = date.getYear();

        if (year >= 1990)
            url="/young.jsp";
        else if (year < 1990)
            url="/old.jsp";

        RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
        dispatcher.include(request, response);
    }
}
