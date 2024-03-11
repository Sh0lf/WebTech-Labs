package isep.lab1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ListItems")
public class ListItems extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create a session object if it is already not created.
		HttpSession session = request.getSession();
 
		ArrayList<String> previousItems = (ArrayList<String>)session.getAttribute("previousItems");
		if (previousItems == null) {
			previousItems = new ArrayList<String>();
		}
		String newItem = request.getParameter("newItem");
		if ((newItem != null) && (!newItem.trim().equals(""))) {
			previousItems.add(newItem);
		}
 
		session.setAttribute("previousItems", previousItems);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Lab1 Session display</TITLE></HEAD>");	
		out.println("<BODY>");
		
		out.println("<H1> List of Item </H1>");
		if (previousItems.size() == 0) {
			out.println("<I>No items</I>");
		} 
		else {
			out.println("<UL>");
			for(String item: previousItems) {
				out.println(" <LI>" + item);
			}
			out.println("</UL>");
		}
		out.println("</BODY></HTML>");
		out.close();
	}

}
