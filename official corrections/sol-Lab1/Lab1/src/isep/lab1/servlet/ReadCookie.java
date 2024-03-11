package isep.lab1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadCookie")
public class ReadCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String firstName = null;
		String lastName = null;
		String birthDay = null;
		String sex = null;
		
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("fName"))
					firstName = c.getValue();
				else if (c.getName().equals("lName"))
					lastName = c.getValue();
				else if (c.getName().equals("bDay"))
					birthDay = c.getValue();
				else if (c.getName().equals("sex"))
					sex = c.getValue();

			}
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<HTML>");
		out.println("<HEAD><TITLE>Lab1 Form display</TITLE></HEAD>");	
		out.println("<BODY>");
		out.println("<H1>Your parameters retrieved from your local cookies: </H1>");
		
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td>First Name</td>");
		out.println("<td>Last Name</td>		");
		out.println("<td>Birth Date</td>");
		out.println("<td>Sex</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+firstName+"</td>");
		out.println("<td>"+lastName+"</td>");		
		out.println("<td>"+birthDay+"</td>");
		out.println("<td>"+sex+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</BODY></HTML>");
		out.close();

	}
}
