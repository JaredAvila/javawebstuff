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
import com.jaredavila.web.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/Teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("teamId") == null) {
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/NewTeam.jsp");
			view.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			String viewName = request.getParameter("teamId");
			@SuppressWarnings("unchecked")
			ArrayList<Object> teams = (ArrayList<Object>) session.getAttribute("teamList");
			for(Object team : teams) {
				Team teamName = (Team) team;
				System.out.println(teamName.getTeamName() + viewName);
				if(teamName.getTeamName().equals(viewName) == true) {
					System.out.println("FOUND IT!!!!!!!!!!!!!");
					break;
				}
			}
			session.setAttribute("teamName", viewName);
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/TeamInfo.jsp");
			view.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings({ "unchecked" })
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String teamName = request.getParameter("teamName");
		Team newTeam = new Team(teamName);
		newTeam.setNumOfPlayers(0);
		if(session.getAttribute("myRoster") == null) {
			ArrayList<Object> teamList = new ArrayList<Object>();
			teamList.add(newTeam);
			Roster myRoster = new Roster(teamList);
			session.setAttribute("myRoster", myRoster);
			session.setAttribute("teamList", teamList);
			response.sendRedirect("rosterHome");
		} else {
			ArrayList<Object> teamList = (ArrayList<Object>) session.getAttribute("teamList");
			teamList.add(newTeam);
			Roster myRoster = (Roster) session.getAttribute("myRoster");
			myRoster.setRoster(teamList);
			session.setAttribute("teamList", teamList);
			session.setAttribute("myRoster", myRoster);
			response.sendRedirect("rosterHome");
		}
		
	}

}
