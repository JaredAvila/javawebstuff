package com.jaredavila.web;

import java.io.IOException;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("name");
		String userLang = request.getParameter("lang");
		String userTown = request.getParameter("hometown");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (userName == null) {
			userName = "Unknown";
		} 
		if (userLang == null) {
			userLang = "Unknown";
		} 
		if (userTown == null) {
			userTown = "Unknown";
		}
		out.write("<h1 style='color: blue; padding: 50px; border-radius: 8px; background-color: gray; margin: 10px;'>Welcome, " + userName + "</h1>");
		out.write("<h3 style='color: green;'>Your favorite language is: " + userLang + "</h3>");
		out.write("<h3 style='color: green;'>Your hometown is: " + userTown + "</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
