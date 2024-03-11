package isep.lab1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ShowSession")
public class ShowSession extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s=request.getSession(true);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<HTML>");
		out.println("<HEAD><TITLE>Lab1 Session display</TITLE></HEAD>");	
		out.println("<BODY>");
		if(s.isNew()){
			out.println("<H1>Welcome on my site !</H1>");
			s.setAttribute("count",1);
		}
		else{
			out.println("<H1>Welcome back !</H1>");
			s.setAttribute("count",((int)s.getAttribute("count"))+1);
		}
		out.println("Number of visits: "+s.getAttribute("count"));
		out.println("</BODY></HTML>");
		out.close();
	}
}
