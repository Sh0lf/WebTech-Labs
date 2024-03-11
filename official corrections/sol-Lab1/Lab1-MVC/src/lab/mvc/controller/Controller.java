package lab.mvc.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab.mvc.model.Person;

@WebServlet("/Controller")
public class Controller extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		String birthDay = request.getParameter("bDay");
		String sex = request.getParameter("sex");
		
		Person personBean = new Person(firstName, lastName, birthDay, sex);
		request.setAttribute("person",personBean);
		
		int year = Integer.parseInt(birthDay.substring(6).trim());
		
		String url="";
		if (year >= 1990)
			url="/old.jsp"; 
		else if (year < 1990)
			url="/young.jsp";		
		
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
		dispatcher.include(request, response);
		
	}

}
