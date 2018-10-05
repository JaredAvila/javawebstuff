package com.jaredavila.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jaredavila.web.models.Team;

/**
 * Servlet implementation class DeleteTeam
 */
@WebServlet("/DeleteTeam")
public class DeleteTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTeam() {
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
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String deleteName = request.getParameter("teamId");
		ArrayList<Object> teams = (ArrayList<Object>) session.getAttribute("teamList");
		for(Object team : teams) {
			Team teamName = (Team) team;
			System.out.println(teamName.getTeamName() + deleteName);
			if(teamName.getTeamName().equals(deleteName) == true) {
				teams.remove(teamName);
				System.out.println("FOUND IT!!!!!!!!!!!!!");
				break;
			}
		}
		session.setAttribute("teamList", teams);
		response.sendRedirect("rosterHome");
		
	}

}
