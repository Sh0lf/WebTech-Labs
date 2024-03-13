package com.webtech.lab2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String pwd = request.getParameter("pwd");

        boolean isCorrect = authenticate(login, pwd);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (isCorrect){
            out.print(1);
        } else {
            out.print(0);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("Successful communication");
    }

    private boolean authenticate(String login, String pwd) {
        // Check if log are correct values
        return login.equals("abc") && pwd.equals("123");
    }
}
