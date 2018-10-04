package com.jaredavila.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class guess
 */
@WebServlet("/guess")
public class guess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String guess = request.getParameter("guess");
		if(guess.equals(session.getAttribute("number")) == true) {
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/done.jsp");
			view.forward(request, response);
		}
		int guessInt = Integer.parseInt(guess);
		int numInt = Integer.parseInt((String) session.getAttribute("number"));
		if (guessInt < numInt) {
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/higher.jsp");
			view.forward(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/lower.jsp");
			view.forward(request, response);
		}
	}

}
