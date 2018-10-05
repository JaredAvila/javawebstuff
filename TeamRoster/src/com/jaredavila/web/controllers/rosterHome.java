package com.jaredavila.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jaredavila.web.models.Roster;

/**
 * Servlet implementation class rosterHome
 */
@WebServlet("/rosterHome")
public class rosterHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rosterHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Roster myRoster = (Roster)session.getAttribute("myRoster");
		@SuppressWarnings("unchecked")
		ArrayList<Object> teamList = (ArrayList<Object>) session.getAttribute("teamList");
		session.setAttribute("myRoster", myRoster);
		session.setAttribute("teamList", teamList);
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/home.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
