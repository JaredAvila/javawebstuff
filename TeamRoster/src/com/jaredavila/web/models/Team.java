package com.jaredavila.web.models;

import java.util.ArrayList;

public class Team {
	
	//attributes ---------------------------------------------------------------------------------------------------------------------------------------------
	
	private String teamName;
	public ArrayList<Object> players;
	private int numOfPlayers;
	
	
	//constructors -------------------------------------------------------------------------------------------------------------------------------------------
	
	public Team() {}
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
	
	//getters and setters ------------------------------------------------------------------------------------------------------------------------------------
	
	public void setTeamName(String newName) {
		this.teamName = newName;
	}
	public String getTeamName() {
		return this.teamName;
	}
	public ArrayList<Object> getPlayers() {
		return this.players;
	}
	public void setPlayers(ArrayList<Object> players) {
		this.players = players;
	}
	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}
	public int getNumOfPlayers() {
		return this.numOfPlayers;
	}
}
