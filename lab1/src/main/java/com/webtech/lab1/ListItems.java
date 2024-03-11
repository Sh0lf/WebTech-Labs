package com.webtech.lab1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

//urlPatterns = ("/FormServlet","/Form_Servlet")
@WebServlet(name = "listItems", value = "/ListItems")
public class ListItems extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        HttpSession s = request.getSession();
        HashMap<String, Integer> itemsMap = (HashMap<String, Integer>) s.getAttribute("items");

        if (itemsMap == null) {
            itemsMap = new HashMap<String, Integer>();
            s.setAttribute("items", itemsMap);
        }

        String newItem = request.getParameter("newItem");

        Integer count = itemsMap.getOrDefault(newItem, 0);
        itemsMap.put(newItem, count + 1);;

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Items List</h2>");
        out.println("<ul>");
        for (String item : itemsMap.keySet()) {
            int itemCount = itemsMap.get(item);
            out.println("<li>" + item + " (Count: " + itemCount + ")</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}