package isep.lab1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FormServlet1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		String birthDay = request.getParameter("bDay");
		String sex = request.getParameter("sex");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<HTML>");
		out.println("<HEAD><TITLE>Lab1 Form display</TITLE></HEAD>");	
		out.println("<BODY>");
		out.println("<H1>Your parameters: </H1>");
		
		out.println("<table border=1>");
		out.println("  <tr>");
		out.println("    <td>First Name</td>");
		out.println("    <td>Last Name</td>		");
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
